
    import java.util.*;


class Device {
    private boolean isOn;

    public void turnOn() { isOn = true; }
    public void turnOff() { isOn = false; }
    public boolean isOn() { return isOn; }

    public void showStatus() {
        System.out.println("Device is " + (isOn ? "ON" : "OFF"));
    }

 
    public static void toggleAll(List<Device> devices, boolean turnOn) {
        for (Device d : devices) {
            if (turnOn) d.turnOn();
            else d.turnOff();
            d.showStatus();
        }
    }

    public static int countPoweredOn(List<Device> devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.isOn()) count++;
        }
        return count;
    }
}


class AirConditioner extends Device {
    private int fanSpeed;
    private int temperature;

    public AirConditioner(int fanSpeed, int temperature) {
        this.fanSpeed = fanSpeed;
        this.temperature = temperature;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        showStatus();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }

    @Override
    public void showStatus() {
        System.out.println("AirConditioner is " + (isOn() ? "ON" : "OFF")
            + " | Fan Speed: " + fanSpeed
            + " | Temperature: " + temperature + "°C");
    }
}

class LampShade extends Device {
    private int brightness;
    private String color;

    public LampShade(int brightness, String color) {
        this.brightness = brightness;
        this.color = color;
    }


    public LampShade(LampShade original) {
        this.brightness = original.brightness;
        this.color = original.color;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        showStatus();
    }

    public void setColor(String color) {
        this.color = color;
        showStatus();
    }

    @Override
    public void showStatus() {
        System.out.println("LampShade is " + (isOn() ? "ON" : "OFF")
            + " | Brightness: " + brightness + "%"
            + " | Color: " + color);
    }
}


class Television extends Device {
    private int channel;
    private int volume;

    public Television(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        showStatus();
    }

    public void setVolume(int volume) {
        this.volume = volume;
        showStatus();
    }

    @Override
    public void showStatus() {
        System.out.println("Television is " + (isOn() ? "ON" : "OFF")
            + " | Channel: " + channel
            + " | Volume: " + volume + "%");
    }
}


class Microwave extends Device {
    private int timer = 0;
    private int temperature = 0;

    public Microwave() {}

    public void setTimer(int timer) {
        this.timer = timer;
        showStatus();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }

    @Override
    public void showStatus() {
        System.out.println("Microwave is " + (isOn() ? "ON" : "OFF")
            + " | Timer: " + timer
            + " | Temperature: " + temperature);
    }
}


public class SmartHomeControlSystem {
    public static void main(String[] args) {

     
        AirConditioner ac = new AirConditioner(3, 24);

        LampShade lamp1 = new LampShade(100, "Yellow");
        LampShade lamp2 = new LampShade(lamp1); 

        Television tv = new Television(1, 10);
        Microwave mw = new Microwave();

      
        List<Device> devices = Arrays.asList(ac, lamp1, lamp2, tv, mw);

    
        System.out.println("\n--- Turning All Devices ON ---");
        Device.toggleAll(devices, true);

  
        System.out.println("\nDevices that are currently ON: " + Device.countPoweredOn(devices));

     
        System.out.println("\n--- Adjusting Devices ---");
        
        ac.setTemperature(16);

        tv.setChannel(59);
       
        lamp1.setColor("Red");

     
        System.out.println("\n--- Turning All Devices OFF ---");
        Device.toggleAll(devices, false);

        System.out.println("\nDevices currently ON: " + Device.countPoweredOn(devices));
    }
}


