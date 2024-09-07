class Human{
    void eat(){
        System.out.println("Human eat");
    }

    public void showName() {
    }
}
class Sportsman extends Human{

    void eat(){
        System.out.println("Sportsman eat");
    }
}
public class Example5_4 {
    public static void main(String[] args) {
        Sportsman sp = new Sportsman();
        sp.eat();
    }
}
