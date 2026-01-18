import java.util.Random;
import java.util.Scanner;

public class Lab1JavaReview {

    

    static Scanner scnr= new Scanner(System.in);
    static Random rand = new Random ();

    static int i;
    static int adding;
    static String [] books = new String [5];
    static int [] booknumber= new int[5];
    static boolean[] isavailable = new boolean[5];
    static int filledindex;
    static int bookcount;
    static boolean exists;
    static int newnum;
    static boolean foundnumber;
    static boolean notempty;
    static int numbook;
    static int availablebooks;
    static int borrowedbooks;

    public static void main(String[] args){
        while (true){
            System.out.println("---------------------------------");
            System.out.println("|    WELCOME TO CVSU LIBRARY    |");
            System.out.println("---------------------------------");
            System.out.println("| PLEASE CHOOSE YOUR ACTION     |");
            System.out.println("| 1. ADD BOOK                   |");
            System.out.println("| 2. UPDATE BOOK STATUS         |");
            System.out.println("| 3. SHOW ALL BOOKS             |");
            System.out.println("| 4. GENERATE REPORT            |");
            System.out.println("| 5. EXIT                       |");
            System.out.println("---------------------------------");

            System.out.print("\nPLEASE ENTER THE NUMBER OF YOUR ACTION: ");
            String action = scnr.nextLine();

            try{
                int chosen_action= Integer.parseInt(action);
                switch (chosen_action){
                    case 1:
                    addBook();
                    break;

                    case 2:
                    updateBookStatus();
                    break;

                    case 3:
                    showBooks();
                    break;

                    case 4:
                    generateReport();
                    break;

                    case 5:
                    Exit();
                    return;

                    default:
                    System.out.println("\n!!!!!!Invalid. Please enter a correct number.!!!!!!\n");
                
                    }
                }catch (NumberFormatException e){
                    System.out.println("\n!!!!!Invalid input. Please try again with a correct input.!!!!!\n");

                }

        
        }

    }
    public static void addBook(){
        filledindex=0;
        while(true){
            for (i=0;i < books.length; i++)
        {
        if (books[i] !=null) {filledindex++;
        
        
        }
    }
if(filledindex == books.length) {
            System.out.println("The bookshelf is currently full. Taking you back to the main menu");
            return;
        }
    System.out.println("----------------------------------------------------");
    System.out.println("|                   ADD BOOKS                      |");
    System.out.print("| How many books do you want to add? (Max. of 5): ");
   
    
try{
    String additional = scnr.nextLine();
        adding = Integer.parseInt(additional);
        bookcount+=adding;
        if (bookcount >books.length)
        {
            System.out.println("\nYou have exceeded the limit of the bookshelf");
            System.out.println("\nBookshelf Status:" + (bookcount-adding) + "/5");
            bookcount-=adding;
            System.out.println("\nOnly " + (books.length - bookcount) + " remaining");
            return;
        }
        if(adding > 5 || adding <=0){
            System.out.println("Invalid input. Please enter a number between 1-5");
        } else{
            break;
        }
    }  catch (NumberFormatException e){
        System.out.println("Invalid input. Please enter a number");
    }
    }
    System.out.println("\nPlease enter the title of the books you want to add: ");
    for(i=0; i < adding; i++){
        for (int j=0; j< books.length; j++){
            if(books[j] == null){
                System.out.print((i+1) + ".");
                books[j] = scnr.nextLine();
                do { 
                  newnum = rand.nextInt(9999);
                  exists=false;
                  
                for(int k= 0; k<j;k++){
                    if(booknumber[k] == newnum){
                        exists = true;
                        break;
                    
                    }
                }
                } while (exists);
                booknumber[j] = newnum;
                isavailable[j]= true;
                break;
            }
        }
    }
                System.out.println("\n--------------------------------------------");
                System.out.println("Books Stored: \n");
                for(i=0;i<books.length; i++)
                {
                    if(books[i] !=null){
                        System.out.println((i+1) + "." + books[i] + " #" + booknumber[i] + " -" + (isavailable[i]? "Available":"Borrowed"));
                        System.out.println("------------------------------------");
                    }
                }
                System.out.println("\nYou have successfully added books. Bringing back to main menu. \n");
            }
            public static void updateBookStatus(){
                while (true){
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("|                      UPDATE BOOK STATUS                       |");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Books stored:");
                    for (i=0; i< books.length; i++){
                        if(books[i] !=null){
                            System.out.println((i+1) + "." + books[i] + " #" + booknumber[i] + " -" + (isavailable[i]? "Available" : "Borrowed"));
                            notempty =true;
                            System.out.println("-----------------------------------------------------------------");

                        }

                    }if(!notempty){
                        System.out.println("No books in the shelves yet. Going back to main menu");
                        return;

                    }System.out.print("\nPlease enter the serial number of the book you want to update: #");
                    String bookS = scnr.nextLine();
                    try {
                        int bookSinput = Integer.parseInt(bookS);
                        int foundindex =-1;
                        foundnumber=false;
                        for(i=0;i<booknumber.length; i++){
                            
                            if (booknumber[i] == bookSinput){
                                foundindex=i;
                                foundnumber=true;
                            
                                    
                                    if(!isavailable[i]){
                                        isavailable[i] = true;
                                        System.out.println("\n-----------------------------------------------------------------");
                                        System.out.println("\nThe book - " + books[i] + " is now marked as Available\n");
                                        System.out.println("-----------------------------------------------------------------\n");
                                        System.out.println("\n Books Stored:\n");
                                        for (i=0; i<books.length;i++){
                                            
                                            if(books[i] != null){
                                                System.out.println((i+1) + "." + books[i] + " #" + booknumber[i] + " -" + (isavailable[i]? "Available":"Borrowed")); 
                                                System.out.println("-----------------------------------------------------------------");
                                                
                                            }
                                            }return;
                                    }
                                    else if (isavailable[i]){
                                        isavailable[i] = false;
                                        System.out.println("-----------------------------------------------------------------");
                                        System.out.println("\nThe book - " + books[i] + " is now marked as Borrowed\n");
                                        System.out.println("-----------------------------------------------------------------");
                                        System.out.println("\n Books Stored:\n");
                                        for (i=0; i<books.length;i++){
                                            if(books[i] != null){
                                                System.out.println((i+1) + "." + books[i] + " #" + booknumber[i] + " -" + (isavailable[i]? "Available":"Borrowed"));
                                                System.out.println("-----------------------------------------------------------------"); 
                                                
                                            }
                                        }
                                    
                                        
                                        

                                        return;
                                        }if(!notempty){
                                            System.out.println("\nNo books stored yet. \nGoing back to the main menu.");
                                            return;
                                        }
                            }
                        
                        }   
                                    
                                    
                            
                            if(!foundnumber){
                                System.out.println("\n!!!! Invalid input!! Please try again");
                            }
                                }catch (NumberFormatException e){
                        System.out.println("\nInvalid input!! Please try again with a valid number\n");
                                }
                            }
                        
                      
                    

                
            
            }public static void showBooks(){
                System.out.println("-----------------------------------------------------------------");
                System.out.println("|                         SHOW ALL BOOKS                        |");
                System.out.println("-----------------------------------------------------------------");
                    System.out.println("Books Stored");
                    for (i=0; i<books.length;i++){
                         if(books[i]!=null){
                            System.out.println((i+1) + "." +  books[i] + "#" + booknumber[i] + "-" + (isavailable[i] ? "Available" : "Borrowed"));
                            System.out.println("-----------------------------------------------------------------");
                            notempty= true;

                         } 
                        }
                    
                        if (!notempty){
                            System.out.println("No books in the shelves yet. Going back to the main menu");
                            return;
                        
                        }
                        
                    
                    
                    }public static void generateReport(){
                        availablebooks =0;
                        borrowedbooks =0;
                        numbook =0;
                        for (i=0;i<books.length; i++){
                            if (books[i] !=null){
                                numbook++;
                                notempty=true;
                                if(isavailable[i]){
                                    availablebooks++;
                                }else{
                                    borrowedbooks++;
                                }
                            }
                        }
                        if(notempty){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("|                        GENERATE REPORT                   |");
                            System.out.println("|            Total number of books registered: " + numbook +  "           |");
                            System.out.println("|----------------------------------------------------------|");
                            System.out.println("|            Total number of available books: " + availablebooks + "            |");
                            System.out.println("|----------------------------------------------------------|");
                            System.out.println("|            Total number of Borrowed books: " + borrowedbooks + "             |");
                            System.out.println("------------------------------------------------------------");
                        }
                        if (!notempty){
                            System.out.print("There are no books in the shelves at this moment.Going back to the main menu.");
                        }
                    }
                public static void Exit(){
                System.out.println("\nThank you for using the Library Book Management System. We hope to see you again!!! ");
                
                }
            }
        
    
            
        
        

                
                        