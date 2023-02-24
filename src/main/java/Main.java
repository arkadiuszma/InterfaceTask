import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var slowTruck = new Truck(20);
        var fastTruck = new Truck(50);
        var slowBoat = new Boat(5);
        var fastBoat = new Boat(20);
        var john = new Human();
        var henry = new Human();
        var differentBoat = new Boat(350) {
            @Override
            public void move() {
                System.out.println("I'm super truck I can drive: " + getMaxSpeed());
            }
        };
        List<Mobile> mobiles = List.of(slowBoat, fastBoat, slowTruck, fastTruck, john, henry, differentBoat);
        var randomObject = getRandomObject(mobiles);
        randomObject.move();
        print(() -> System.out.println("I cannot run at all"));
        introduce((name) -> System.out.println("Hello: " + name));
    }

    public static void print(Mobile mobile) {
        mobile.move();
    }

    public static void introduce(Talkable talkable) {
        talkable.sayHello("Mateusz");
    }

    public static <T extends Mobile> T getRandomObject(List<T> mobiles) {
        for (Mobile mobile : mobiles) {
            System.out.println(mobile instanceof Vehicle ? "This is vehicle: " + ((Vehicle) mobile).getMaxSpeed() : "This isn't vehicle");
        }
        return mobiles.get(new Random().nextInt(mobiles.size()));
    }
}

