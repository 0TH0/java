import java.awt.Container;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

class DrawTest{
	private JFrame mainFrame;
	private Container container;
	
	// コンストラクタ
	public DrawTest(){
		mainFrame = new JFrame("マウスイベント");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(400, 300);
		//画面中央にウィンドウ表示
		mainFrame.setLocationRelativeTo(null);
		//フレームからのコンテナ取得
		container = mainFrame.getContentPane();
		container.add(new myPanel());
		
		//Jframe
		
		//メインフレームの可視化
		mainFrame.setVisible(true);
	}
	
	// アプリケーションの起動
	public static void main(String[] args) {
		new DrawTest();
	}
}

class myPanel extends JPanel {
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("hello", 150, 100);
	}
}