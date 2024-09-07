public class Example6_2 {
    public static void main(String[] args) {
        try{
            Class cs = Class.forName("chapter6.Circle");
            Circle circle = (Circle)cs.newInstance();
            circle.setRadius(100);
            System.out.println("circle的面积"+circle.getArea());
            System.out.println("circle的周长"+circle.getLength());
            Class cs2 = Class.forName("Rect");
            System.out.println("异常后面的代码");
        }catch (Exception e){
            System.out.println("不能加载Rect类："+e.getMessage());
        }finally{
            System.out.println("finally中的代码一定会被执行");
        }
    }
}
