interface Shoutable{
    void shout(String s);
}
class Dog implements Shoutable{
    public void shout(String s){
        System.out.println(s);
    }
}
class Cat implements Shoutable{
    public void shout(String s){
        System.out.println(s);
    }
}
public class Example7_2 {
    public static void main(String[] args) {
        Shoutable wangcai;
        wangcai = new Dog();
        wangcai.shout("旺财汪汪叫！");
        wangcai = new Cat();
        wangcai.shout("旺财喵喵叫！");
    }
}
