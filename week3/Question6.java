package week3;

class Lamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("The lamp is now on. Status: " + isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("The lamp is now off. Status: " + isOn);
    }
}

public class Question6 {

    public static void main(String[] args) {
        
        Lamp l1 = new Lamp();
        
        l1.turnOn();
        l1.turnOff();

    }

}