import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;

class gamePanel extends JPanel implements ActionListener, KeyListener {
	//ボールの描画座標(初期値はスタート位置)
	int x = 30, y = 20;
	//移動の「向き」を決定する(1：プラス方向、-1：マイナス方向)
	int directionX = 1, directionY = 1;
	//パドルの座標
	int padY = 55;
	//パドルの移動量(上下キー押下時に移動量計算)
	int pd = 0;
	Timer timer;
	final int width, hight;

	public gamePanel(int w, int h) {
		width = w;
		hight = h;
		setPreferredSize(new Dimension(w, h));
		setBackground(Color.black);
		timer = new Timer(100, this);
		addKeyListener(this);
	}

	public void start() {
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.white);
		//壁の描画
		g.fillRect(30, 0, width, 5);
		g.fillRect(width -20, 0, 5, hight);
		g.fillRect(30, hight-5, width, 5);
		//ボールの描画
		g.fillOval(x , y , 10, 10);
		//パドルの描画
		g.fillRect(20, padY, 8, 30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//パッドの座標更新
		if (padY < 0) {
		
		} else if (padY > hight - 30) {
		
		}
		
		padY += pd;
		
		//x座標の更新
		x += (10 * directionX);
		//y座標の更新
		y += (10 * directionY);
		
		//移動量は正数で固定になっているので加算更新では「方向」にも対応が必要
		//移動方向の更新
		//上で座標の移動量を更新しているので「移動方向」が変更になる場合は
		//画像の見切れに対応が必要
		if (x > width - 40) {
			directionX = -1;
		}
		if (y < 5) {
			directionY = 1;
		} else if	(y > hight - 15) {
			directionY = -1;
		}

		if (x < 30) {
			if ((y >= padY) && (y <= padY+30)) {
				directionX = 1;
			}
		}
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
			pd = -12;
			break;
			case KeyEvent.VK_DOWN:
			pd = 12;
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
			case KeyEvent.VK_DOWN:
			pd = 0;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) { }

	//本来操作アクションがないパネルへキー操作を行うための設定
	@Override
	public boolean isFocusable() {
		return true;
	}
}

class SquashRacket {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(300, 200);
		frame.setTitle("SquashRacket");
		//画面のリサイズ禁止
		frame.setResizable(false);
		Container contentPane = frame.getContentPane();
		gamePanel p = new gamePanel(300, 150);

		contentPane.add(p, "Center");
		p.start();

		frame.setVisible(true);
	}
}
