public class Cat extends Animal implements HuntingStyle{
    @Override
    public void voice() {
        System.out.println("мяу");
    }

    @Override
    public void hunt() {
        System.out.println("кошка охотится на корм");
    }

    @Override
    public void hello() {

    }
}
