import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class DrawTest {
	private JFrame mainFrame;
	private Container contentPane;
	
	// コンストラクタ
	public DrawTest(){
		mainFrame = new JFrame("描画テスト");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(400, 300);
		mainFrame.setLocationRelativeTo(null);
		
		contentPane = mainFrame.getContentPane();
		contentPane.add(new myPanel());
	    mainFrame.setVisible(true);
	}
	
	// アプリケーションの起動
	public static void main(String[] args) {
		new DrawTest();
	}
}

class myPanel extends JPanel {
	@Override
	public void paintComponent( Graphics g ) {
		super.paintComponent(g);
		g.drawString("Hello Graphics!", 150, 100);
		//文字列を描画する位置に指定した座標に直線を描画
		g.drawLine(150, 100, 235, 100);
		//文字列を描画する位置として指定した座標は文字列のベースラインとして使われている
	}
}
