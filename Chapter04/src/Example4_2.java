/*使用JDialog类创建依赖窗口的模式对话框*/
import javax.swing.*;
public class Example4_2 {
    public static void main(String[] args) {
        JFrame myframe = new JFrame("测试窗口");
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setBounds(100, 100, 450, 300);
        myframe.setVisible(true);
        JDialog mydialog = new JDialog(myframe,"测试对话框",true);
        mydialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        mydialog.setBounds(100, 100, 450, 300);
        mydialog.setVisible(true);
    }
}



