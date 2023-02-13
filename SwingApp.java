import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingApp implements ActionListener {
	private JFrame mainFrame;
	private Container container;
	private JTextField textField;
	private JTextArea textArea;
	private JScrollPane scroll;
	private JPanel buttonPanel;
	private JButton addButton;
	private JButton clearButton;
	// �R���X�g���N�^
	SwingApp(){
		mainFrame = new JFrame("���X�i�[�����ۑ�");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(400, 300);
		//��ʒ����ɃE�B���h�E�\��
		mainFrame.setLocationRelativeTo(null);
		//�t���[������̃R���e�i�擾
		container = mainFrame.getContentPane();
		//�e�L�X�g�t�B�[���h�̃C���X�^���X����
		textField = new JTextField("");
		//�e�L�X�g�G���A�̃C���X�^���X����
		textArea = new JTextArea("");
		//�e�L�X�g�G���A�ւ̃X�N���[���o�[�C���X�^���X����
		scroll = new JScrollPane(textArea ,
			      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
			      JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//�ǉ��{�^���̃C���X�^���X����
		addButton = new JButton("�ǉ�");
		//�����{�^���̃C���X�^���X����
		clearButton = new JButton("����");
		//�u�ǉ��v�{�^���ƃA�N�V�����E���X�i�[�̊֘A�t��
		addButton.addActionListener(this);
		//�u�����v�{�^���ƃA�N�V�����E���X�i�[�̊֘A�t��
		clearButton.addActionListener(this);
		//�{�^�������̃p�l���쐬
		buttonPanel = new JPanel();
		//�{�^�������̃p�l���ւ̒ǉ��{�^���̓o�^
		buttonPanel.add(addButton);
		//�{�^�������̃p�l���ւ̏����{�^���̓o�^
		buttonPanel.add(clearButton);
		//�R���e�i�փe�L�X�g�t�B�[���h�ǉ�(���C�A�E�g��BorderLayout)
		mainFrame.add(textField, BorderLayout.PAGE_START);
		//�R���e�i�փe�L�X�g�G���A�ǉ�(���C�A�E�g��BorderLayout)
		mainFrame.add(scroll, BorderLayout.CENTER);
		//�R���e�i�փ{�^���p�l���ǉ�(���C�A�E�g��BorderLayout)
		mainFrame.add(buttonPanel, BorderLayout.PAGE_END);
		//���C���t���[���̉���
		mainFrame.setVisible(true);
	}
	
	// ���p�҂̑���ɉ���������������
	public void actionPerformed(ActionEvent event){
		// ����Ώۂ̃I�u�W�F�N�g�ŕ���
		 String cmd = event.getActionCommand();

		    if (cmd.equals("�ǉ�")){
			// �ǉ��{�^���̏ꍇ
			// �e�L�X�g�t�B�[���h�ɓ��͂��ꂽ��������e�L�X�g�G���A�֒ǉ�
			String str = textField.getText();
			textArea.append(str);
		    } else if (cmd.equals("����")){
			// �폜�{�^���̏ꍇ
		    // �e�L�X�g�G���A�̕������S����
			textArea.setText("");
		    }
	}
	// �A�v���P�[�V�����̋N��
	public static void main(String[] args) {
		new SwingApp();
	}
}