import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class DrawSmile {
	private JFrame mainFrame;
	private Container contentPane;
	
	// �R���X�g���N�^
	public DrawSmile(){
		mainFrame = new JFrame("�X�}�C���`��");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(400, 300);
		mainFrame.setLocationRelativeTo(null);
		
		contentPane = mainFrame.getContentPane();
		contentPane.add(new canvasPanel());
	    mainFrame.setVisible(true);
	}
	
	// �A�v���P�[�V�����̋N��
	public static void main(String[] args) {
		new DrawSmile();
	}
}

class canvasPanel extends JPanel {
	@Override
	public void paintComponent( Graphics g ) {
		super.paintComponent(g);
		g.drawArc(75, 50, 100, 100,  0, 360);
		g.drawArc(90, 65, 70, 70, 0, -180);
		g.drawArc(105, 85, 10, 10, 0, 360);
		g.drawArc(135, 85, 10, 10, 0, 360);
	}
}
