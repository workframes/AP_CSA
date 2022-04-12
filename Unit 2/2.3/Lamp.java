public class Lamp {
    private boolean isOn;

    public void turnOn(){
        isOn = true;
        System.out.println("The lamp is on.");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("The lamp is off.");
    }

    public static void main(String[] args){
        Lamp lamp1 = new Lamp();
        lamp1.turnOn();
        Lamp lamp2 = new Lamp();
        lamp2.turnOn();
        lamp1.turnOff();
    }
}
