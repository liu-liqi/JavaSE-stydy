class Human2{
    public String meal;
    Human2(String meal){
        this.meal = meal;
        System.out.println("Human eat " + meal);
    }
}
class Sportsman2 extends Human2{
    Sportsman2(String meal){
        super(meal);
        System.out.println("Sportsman eat others");
    }
}
public class Example5_5 {
    public static void main(String[] args) {
        Sportsman2 sp = new Sportsman2("breakfast");
    }
}
