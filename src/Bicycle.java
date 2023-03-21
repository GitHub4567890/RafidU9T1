public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle(String name, int wheels, int gears) {
        super(name, wheels);
        gearCount = gears;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public void ringBell() {
        System.out.println("noot noot");
    }


}