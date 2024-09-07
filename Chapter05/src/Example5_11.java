class Human7{
    public void showName(){
        System.out.println("我是人类！");
    }
}
class Sportsman7 extends Human7{
    @Override
    public void showName(){
        System.out.println("我是运动员！");
    }
}
class Postman extends Human7{
    @Override
    public void showName(){
        System.out.println("我是邮递员！");
    }
}
public class Example5_11 {
    static void humanName(Human7 a){
        a.showName();
    }
    public static void main(String[] args) {
        Human7 a = new Human7();
        humanName(a);
        Sportsman7 s = new Sportsman7();
        humanName(s);
        Human7 p = new Postman();
        humanName(p);
    }


}
