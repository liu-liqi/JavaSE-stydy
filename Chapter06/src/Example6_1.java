import java.lang.Thread;

public class Example6_1 {
    public static void main(String[] args) {
        RuntimeExpection e1 = new RuntimeException("e1的自定义原因");
        System.out.println("------e1.getmessage()------");
        System.out.println(e1.getmessage());
        System.out.println("------e1.getCause()------");
        System.out.println(e1.getCause());

        System.out.println("------e1.printStackTrace()------");
        e1.printStackTrace(System.out);

        RuntimeException e2 = new RuntimeException("e2的自定义原因",e1);
        System.out.println("------e2.getCause()------");
        System.out.println(e2.getCause());
        System.out.println("------e2.printStackTrace()------");
        e2.printStackTrace(System.out);
    }
}
