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
	
	// �R���X�g���N�^
	public DrawTest(){
		mainFrame = new JFrame("�}�E�X�C�x���g");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(400, 300);
		//��ʒ����ɃE�B���h�E�\��
		mainFrame.setLocationRelativeTo(null);
		//�t���[������̃R���e�i�擾
		container = mainFrame.getContentPane();
		container.add(new myPanel());
		
		//Jframe
		
		//���C���t���[���̉���
		mainFrame.setVisible(true);
	}
	
	// �A�v���P�[�V�����̋N��
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