import javax.swing.*;
import java.awt.*;

public class SpamCallIdentifer extends JFrame{
   
    private JPanel panel;
    private JLabel label;
    private JTextField textBox;
    private JButton OkBtn;

    /**
     * ウィンドウ生成時の初期化処理
     */
    SpamCallIdentifer(String title) {
        setBounds(100, 100, 600, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        this.panel = new JPanel();
        this.label = new JLabel("電話番号");
        this.label.setFont(new Font("Arial",Font.PLAIN, 30));
        this.textBox = new JTextField(15);
        this.textBox.setPreferredSize(new Dimension(400,50));
        this.textBox.setFont(new Font("Arial",Font.PLAIN, 20));
        this.OkBtn = new JButton("判定開始");


    }

    public void display() {
        this.panel.add(this.label);
        this.panel.add(this.textBox);
        this.panel.add(this.OkBtn);

        Container contentPane = getContentPane();
        contentPane.add(this.panel, BorderLayout.CENTER);

        setVisible(true);
    }
}
