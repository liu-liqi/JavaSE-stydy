abstract class Pet{
    abstract void say();
}
class Cat extends Pet{
    void say(){
        System.out.println("喵喵");
    }
}

public class Example5_13 {
    public static void main(String[] args) {
        Pet p = new Cat();
        p.say();
    }
}
