import java.awt.Container;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

class MouseEventTest implements MouseListener {
	private JFrame mainFrame;
	private Container container;
	
	// コンストラクタ
	public MouseEventTest(){
		mainFrame = new JFrame("マウスイベント");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(400, 300);
		//画面中央にウィンドウ表示
		mainFrame.setLocationRelativeTo(null);
		//フレームからのコンテナ取得
		container = mainFrame.getContentPane();
		
		//フレームクラスへのマウスリスナー
		mainFrame.addMouseListener(this);
		
		//メインフレームの可視化
		mainFrame.setVisible(true);
	}
	
	// マウス
	public void mousePressed(MouseEvent event){
		
	}
	public void mouseClicked(MouseEvent event){
		
	}
	public void mouseReleased(MouseEvent event){
		
	}
	public void mousemMoved(MouseEvent event){
		
	}
	public void mouseEntered(MouseEvent event){
		container.setBackground(Color.white);
	}
	// アプリケーションの起動
	public static void main(String[] args) {
		new MouseEventTest();
	}
}