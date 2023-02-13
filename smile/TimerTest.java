import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerTest implements ActionListener{

	private JFrame frame;
	private Timer timer;
	private JLabel label;
	private int sec;

	public static void main(String[] args){
		new TimerTest();
	}

	TimerTest(){
		frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10, 10, 300, 200);
		frame.setTitle("タイマー");
		frame.setVisible(true);
		
		sec = 0;
		label = new JLabel();

		JPanel labelPanel = new JPanel();
		labelPanel.add(label);

		timer = new Timer(1000 , this);

		frame.getContentPane().add(labelPanel, BorderLayout.CENTER);

		timer.start();
	}
	
	final int dir = 10;
	Timer repaintTimer;
	final int width, hight;
	
	public smilePanel(int w, int h) {
		width = w;
		hight = h;
		repaintTimer = new Timer(100, this);
	}
	
	public void actionPerformed(ActionEvent e){
		label.setText(sec + " sec");

		if (sec >= 30){
			timer.stop();
		}else{
			sec++;
		}
	}
}