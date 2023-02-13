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
	//�{�[���̕`����W(�����l�̓X�^�[�g�ʒu)
	int x = 30, y = 20;
	//�ړ��́u�����v�����肷��(1�F�v���X�����A-1�F�}�C�i�X����)
	int directionX = 1, directionY = 1;
	//�p�h���̍��W
	int padY = 55;
	//�p�h���̈ړ���(�㉺�L�[�������Ɉړ��ʌv�Z)
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
		//�ǂ̕`��
		g.fillRect(30, 0, width, 5);
		g.fillRect(width -20, 0, 5, hight);
		g.fillRect(30, hight-5, width, 5);
		//�{�[���̕`��
		g.fillOval(x , y , 10, 10);
		//�p�h���̕`��
		g.fillRect(20, padY, 8, 30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//�p�b�h�̍��W�X�V
		if (padY < 0) {
		
		} else if (padY > hight - 30) {
		
		}
		
		padY += pd;
		
		//x���W�̍X�V
		x += (10 * directionX);
		//y���W�̍X�V
		y += (10 * directionY);
		
		//�ړ��ʂ͐����ŌŒ�ɂȂ��Ă���̂ŉ��Z�X�V�ł́u�����v�ɂ��Ή����K�v
		//�ړ������̍X�V
		//��ō��W�̈ړ��ʂ��X�V���Ă���̂Łu�ړ������v���ύX�ɂȂ�ꍇ��
		//�摜�̌��؂�ɑΉ����K�v
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

	//�{������A�N�V�������Ȃ��p�l���փL�[������s�����߂̐ݒ�
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
		//��ʂ̃��T�C�Y�֎~
		frame.setResizable(false);
		Container contentPane = frame.getContentPane();
		gamePanel p = new gamePanel(300, 150);

		contentPane.add(p, "Center");
		p.start();

		frame.setVisible(true);
	}
}
