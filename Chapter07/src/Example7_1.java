interface Flyable{
    String F = "I have wings";
    void takeoff();
    void fly();
}
interface Glidable extends Flyable{
    void glide();
}
class Bird implements Glidable{
    public void takeoff(){
        System.out.println("我要起飞了！");
    }
    public void glide(){
        System.out.println(F+"我在天空中滑翔！");
    }
    public void fly(){
        System.out.println("我飞不了那么高！");
    }
}
public class Example7_1 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.takeoff();
        b.glide();
        b.fly();
    }
}
