class Person {
String name;
int age;
String gender;

static Student[] students = new Student[5];
static Teacher[] teachers = new Teacher[3];

public Person(String name, int age, String gender){
    this.name = name;
    this.age= age;
    this.gender = gender;
}
 static void displayInfo(){
    System.out.println("------BASIC INFORMATION--------");
    for (int s= 0; s< students.length; s++){
    System.out.println("\nName: " + students[s].name);
    System.out.println("Age: " + students[s].age);
    System.out.println("Gender: " + students[s].gender);
 }
    for (int t=0; t< teachers.length; t++){
         System.out.println("\nName: " + teachers[t].name);
          System.out.println("Age: " + teachers[t].age);
           System.out.println("Gender: " + teachers[t].gender);
    }

}
}
class Student extends Person {
int studentId;

static Student[] students = new Student[5];

public Student(String name, int age, String gender, int studentId){
super(name, age, gender);
this.studentId = studentId;
}
static void displayStudent(){
    System.out.println("\n-------STUDENT INFORMATION------");
    for (int s= 0; s<students.length; s++){
        System.out.println("Name: " + students[s].name); 
        System.out.println("Age: " + students[s].age); 
        System.out.println("Gender: " + students[s].gender); 
        System.out.println("Student ID: " + students[s].studentId); 
        System.out.println("-----------------------------");
    }
}
}
class Teacher extends Person {
    String department;

    static Teacher[] teachers = new Teacher[3];
    Course[] courses;
    public Teacher(String name, int age, String gender, String department, Course[]courses){
        super(name, age, gender);
        this.department = department;
        this.courses = courses;
    }
    static void displayTeachers(){
    System.out.println("-----TEACHER INFORMATION-------");
        for (int t=0; t< teachers.length; t++){
            System.out.println("Name: " + teachers[t].name);
            System.out.println("Age: " + teachers[t].age); 
            System.out.println("Gender: " + teachers[t].gender);
            System.out.println("Department: " + teachers[t].department);
            System.out.println("Course/s handled: ");
            for (int c=0; c<teachers[t].courses.length; c++){
                System.out.println("\t" + teachers[t].courses[c].courseCode + " - " + teachers[t].courses[c].courseName);
            }
            System.out.println("---------------------------------");
        }

}
}
class Course {
    String courseCode;
    String courseName;

    public Course(String courseCode, String courseName){
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    static void displayCourse(Course[]courses){
        System.out.println("-----COURSE INFORMATION-------");
        for (int c=0; c< courses.length; c++){
            System.out.println((c+1) + ".) " + courses[c].courseCode + " - " + courses[c].courseName);
        }

    }
}
class TeacherStudentAssignment {
    public static void main (String[]args){
        Student.students[0] = new Student("Khenshiene Carlos", 20, "Male", 202411544);
        Student.students[1] = new Student("Jerico Macalintal", 16, "Male", 202567123);
        Student.students[2] = new Student("Aurelia Liora", 14, "Female", 203523280);
        Student.students[3] = new Student("Charles Leyson", 23, "Male", 202432194);
        Student.students[4] = new Student("Sophie Smith", 20, "Female", 202463264);

        Course course1 = new Course("FITT 1" , "Physical activities Towards Health and Fitness 1");
        Course course2 = new Course("DCIT 50A" , "Object Oriented Programming");
        Course course3 = new Course("COSC 55B" , "Discrete Structures 2");
        Course course4 = new Course("MATH 1A" , "Analytic Geometry");

        Course[] t1course = {course1,};
        Course[] t2course = {course2,};
        Course[] t3course = {course3, course4};
        Course[] allcourses = {course1, course2, course3, course4};

        Teacher.teachers[0] = new Teacher("Jerico Quitilen", 30, "Male", "Physical Education Department", t1course);
        Teacher.teachers[1] = new Teacher("Khenverlie Libao", 34, "Male", "Computer Science Department", t2course);
        Teacher.teachers[2] = new Teacher("Rey Jonel Parales", 40, "Male", "Physics Department", t3course);

        Person.students = Student.students;
        Person.teachers = Teacher.teachers;

        Person.displayInfo();
        Student.displayStudent();
        Teacher.displayTeachers();
        Course.displayCourse(allcourses);
    }
}



