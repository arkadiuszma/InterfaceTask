public class Truck extends Vehicle {
    public Truck(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("I'm truck, my max speed is: " + getMaxSpeed());
    }
}
