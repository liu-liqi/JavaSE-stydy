/*面板组件的基本用法*/
import java.awt.*;
import javax.swing.*;
public class Example4_3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("面板组件演示");
        f.setLayout(new FlowLayout());
        f.setSize(500,300);
        f.setVisible(true);
        f.setLocation(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        JPanel panel = new JPanel();
        f.add(panel);
        panel.add(new JButton("按钮1"));
        panel.add(new JButton("按钮2"));
        panel.add(new JButton("按钮3"));
        panel.add(new JButton("按钮4"));
        scrollPane.setViewportView(panel);
        f.add(scrollPane,BorderLayout.CENTER);
        f.validate();
    }
}
