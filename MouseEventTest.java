import java.awt.Container;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

class MouseEventTest implements MouseListener {
	private JFrame mainFrame;
	private Container container;
	
	// �R���X�g���N�^
	public MouseEventTest(){
		mainFrame = new JFrame("�}�E�X�C�x���g");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(400, 300);
		//��ʒ����ɃE�B���h�E�\��
		mainFrame.setLocationRelativeTo(null);
		//�t���[������̃R���e�i�擾
		container = mainFrame.getContentPane();
		
		//�t���[���N���X�ւ̃}�E�X���X�i�[
		mainFrame.addMouseListener(this);
		
		//���C���t���[���̉���
		mainFrame.setVisible(true);
	}
	
	// �}�E�X
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
	// �A�v���P�[�V�����̋N��
	public static void main(String[] args) {
		new MouseEventTest();
	}
}