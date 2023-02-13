import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class DrawTest {
	private JFrame mainFrame;
	private Container contentPane;
	
	// �R���X�g���N�^
	public DrawTest(){
		mainFrame = new JFrame("�`��e�X�g");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(400, 300);
		mainFrame.setLocationRelativeTo(null);
		
		contentPane = mainFrame.getContentPane();
		contentPane.add(new myPanel());
	    mainFrame.setVisible(true);
	}
	
	// �A�v���P�[�V�����̋N��
	public static void main(String[] args) {
		new DrawTest();
	}
}

class myPanel extends JPanel {
	@Override
	public void paintComponent( Graphics g ) {
		super.paintComponent(g);
		g.drawString("Hello Graphics!", 150, 100);
		//�������`�悷��ʒu�Ɏw�肵�����W�ɒ�����`��
		g.drawLine(150, 100, 235, 100);
		//�������`�悷��ʒu�Ƃ��Ďw�肵�����W�͕�����̃x�[�X���C���Ƃ��Ďg���Ă���
	}
}
