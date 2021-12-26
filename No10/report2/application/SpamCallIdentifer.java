import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * SpamCallIdentifer本体構成クラス。
 * このクラスはフロントエンド（インタフェース部分）の制御を担当。
 * 加えて、バック処理の呼び出し。
 */
public class SpamCallIdentifer extends JFrame implements  ActionListener{
    
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
        this.OkBtn.addActionListener(this);



    }

    /**
     * OKボタンのクリックでコールバックする関数
     */
    private void btnCallback() {
        ImageIcon loadingIcon = new ImageIcon("icon_loader_f_ww_01_s1.gif");
        JLabel gifLabel = new JLabel("searching...", loadingIcon, JLabel.CENTER);
        gifLabel.setFont(new Font("Arial",Font.PLAIN, 30));
        JPanel loadingPanel = new JPanel();
        loadingPanel.add(gifLabel);
        Container contentPane = getContentPane();
        contentPane.add(loadingPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        btnCallback();
    }


    public void display() {
        this.panel.add(this.label);
        this.panel.add(this.textBox);
        this.panel.add(this.OkBtn);

        Container contentPane = getContentPane();
        contentPane.add(this.panel, BorderLayout.PAGE_START);

        setVisible(true);
    }
}
