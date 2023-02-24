public class Human implements Mobile, Talkable {

    @Override
    public void move() {
        System.out.println("I'm human I can run with 13 km/h");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello, nice to meet you: " + name);
    }
}
