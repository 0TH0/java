import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.Color;
import java.awt.enemt.ActionListener;
import java.awt.enemt.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

class FrameDrive{
	public static void main(String[] args){
		EventTest et = new EventTest();
		et.setVisible(true);
	}
}

class EventTest extends JFrame implements ActionListener{
	JButton white, black;
	Container container;
	
	public EventTest(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Event Test");
		setSize(400,300);
		
		container = getContentPane();
		white = new JButton("white");
		black = new JButton("black");
		
		//ボタンへのイベント処理追加
		white.addActionListener(this);
		black.addActionListener(this);
		
		container.setLayout(new FlowLayout());
		container.add(white);
		container.add(black);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		Color c;
		if( e.getSource() == white){
			c = Color.white;
		}
		else{
			c = Color.black;
		}	
		
		container.setBackground(c);
		repaint();
		
	}
}