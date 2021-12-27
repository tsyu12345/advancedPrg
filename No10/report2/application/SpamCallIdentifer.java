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
    private JudgeSpam identifer;
    private Thread background;

    /**
     * ウィンドウ生成時の初期化処理
     */
    SpamCallIdentifer(String title) {
        setBounds(100, 100, 600, 200);
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
        this.identifer = new JudgeSpam();
    }

    private JPanel loadingAnimation() {
        //ローディングアニメーションの描画
        ImageIcon loadingIcon = new ImageIcon("icon_loader_f_ww_01_s1.gif");
        JLabel gifLabel = new JLabel("searching...", loadingIcon, JLabel.CENTER);
        gifLabel.setFont(new Font("Arial",Font.PLAIN, 30));
        JPanel loadingPanel = new JPanel();
        loadingPanel.add(gifLabel);
        return loadingPanel;
    }

    public void actionPerformed(ActionEvent e) {
        /**
         * ボタンのクリックイベントをリスンする。
         */
        String input = this.textBox.getText();
        //別スレッドで検索処理をよびだす。
        if(input.length() > 0 && this.background == null) {
            this.identifer.inputNumber(input);
            this.background = new Thread(this.identifer);
            background.start();
            System.out.println(input);
            JPanel loadGif = loadingAnimation();
            Container contentPane = getContentPane();
            contentPane.add(loadGif, BorderLayout.SOUTH);
            setVisible(true);
            Thread moniter = new Thread(new EndCatcher(this.background, loadGif, this.identifer));
            moniter.start();
        }
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

class EndCatcher extends JFrame implements Runnable {
    boolean isend = false;
    Thread backend;
    JPanel window;
    JudgeSpam identifer;
    
    EndCatcher(Thread backend, JPanel window, JudgeSpam identifer) {
        setBounds(100, 100, 600, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.backend = backend;
        this.window = window;
        this.identifer = identifer;
    }
    public void run() {
        while(isend == false) {
            if(this.backend.isAlive() == false) {
                this.isend = true;
                break;
            }
        }
        System.out.print(this.window.getComponentCount());
        this.window.remove(0);
        this.window.repaint();
        String isSpam = this.identifer.isSpam ? "スパムの可能性が高いです。" : "この番号は安全です。";
        JLabel resutLabel = new JLabel("結果：" + isSpam);
        resutLabel.setFont(new Font("Arial",Font.PLAIN, 30));
        JPanel pannel = new JPanel();
        pannel.add(resutLabel);

        Container contentPane = getContentPane();
        contentPane.add(pannel, BorderLayout.PAGE_START);
        setVisible(true);
        
    }
}
