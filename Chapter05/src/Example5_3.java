class FatherClass{
    public int age = 60;
}
class Sonclass extends FatherClass{
    public int age = 25;
}
public class Example5_3 {
    public static void main(String[] args) {
        FatherClass obj1 = new Sonclass();
        System.out.println(obj1.age);
        Sonclass obj2 = new Sonclass();
        System.out.println(obj2.age);
        System.out.println(((FatherClass)obj1).age);
    }

}
