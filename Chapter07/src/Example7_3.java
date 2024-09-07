interface Flyable2{
    public void fly();
}
class Bird2 implements Flyable2{
    String species;
    public void fly(){
        System.out.println(species + "在飞翔");
    }
    public void glide(){
        System.out.println(species + "在滑翔");
    }
}
public class Example7_3 {
    public static void main(String[] args) {
        Bird2 s = new Bird2();
        s.species = "金丝雀";
        Flyable2 p = s;
        p.fly();
        Bird2 bird = (Bird2) p;
        bird.glide();
    }
}
