import java.io.Serializable;

public class Cat extends Animal implements HuntingStyle, Serializable {
    public Cat(String color){
        this.color = color;
    }

    public Cat() {
    }

    @Override
    public void voice() {
        System.out.println("мяу");
    }

    @Override
    public void hunt() {
        System.out.println("кошка охотится на корм");
    }



    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}
