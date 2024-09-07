/*使用JFrame类创建两个测试窗口*/
import java.awt.*;
import javax.swing.*;
public class Example4_1 {
    public static void main(String[] args) {
        JFrame window1 = new JFrame("第一个测试窗口");
        JFrame window2 = new JFrame("第二个测试窗口");
        Container con = window1.getContentPane();
        con.setBackground(Color.red);
        window1.setBounds(50,100,300,200);
        window2.setBounds(100,100,300,200);

        window1.setVisible(true);
        window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        window2.setVisible(true);
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
