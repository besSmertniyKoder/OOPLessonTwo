import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Capybara capybara = new Capybara();
        Owl owl = new Owl();
        cat.voice();
        cat.hunt();
        capybara.voice();
        capybara.hunt();
        owl.voice();
        owl.hunt();
        capybara.hello();
        owl.hello();
        owl.hello("barsik");
        LinkedList linkedList = new LinkedList<>();
        linkedList.add(7);
        System.out.println(linkedList);
        linkedList.add(0,10);
        System.out.println(linkedList);
    }
}
