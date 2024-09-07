class Human8{
    public int a = 60;
    public void humName(){
        System.out.println("我是人类！");
    }
}
class Sportsman8 extends Human8{
    public int b = 20;
    public void sportsName(){
        System.out.println("我是运动员！");
    }
}
public class Example5_12 {
    public static void main(String[] args) {
        Human8 h1 = new Human8();
        h1.humName();
        Sportsman8 sp = new Sportsman8();
        sp.sportsName();

        Human8 h2 = new Sportsman8();
        /*System.out.println(h2.b);*/
        /*h2.sportsName();*/
        System.out.println(h2.a);
        h2.humName();
    }
}
