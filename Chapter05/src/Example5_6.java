class Human3{
    String name = "人类";
    void eat(){
        System.out.println("人类吃东西");
    }
}
class Sportsman3 extends Human3{
    String name = "一个人";
    void eat(){
        super.eat();
    }
    void printName(){
        System.out.println("name = "+super.name);
    }
}


public class Example5_6 {
    public static void main(String[] args) {
        Sportsman3 sp = new Sportsman3();
        sp.eat();
        sp.printName();
    }}
