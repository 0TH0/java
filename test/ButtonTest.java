import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

class ButtonTest {
    public static void main(String[] args){
        JFrame f = new JFrame();    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,200);
        
        //パネルボード
        Container c = f.getContentPane();
        //配置クラスの設定
        c.setLayout(new GridLayout());
        
        //配置クラスの他クラス
        //GridLayout, BorferLayout, 
        
        JButton btn1 = new JButton("push1");
        JButton btn2 = new JButton("push2");
        JButton btn3 = new JButton("push3");
        
        c.setLayout(new BorderLayout());
        
        JButton btn4 = new JButton("push4");
        JButton btn5 = new JButton("push5");
        
        //コンテナに追加
        c.add(btn1);
        c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		
        //表示
        f.setVisible(true);
    }
}