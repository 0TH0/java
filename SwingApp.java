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
	// コンストラクタ
	SwingApp(){
		mainFrame = new JFrame("リスナー実装課題");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(400, 300);
		//画面中央にウィンドウ表示
		mainFrame.setLocationRelativeTo(null);
		//フレームからのコンテナ取得
		container = mainFrame.getContentPane();
		//テキストフィールドのインスタンス生成
		textField = new JTextField("");
		//テキストエリアのインスタンス生成
		textArea = new JTextArea("");
		//テキストエリアへのスクロールバーインスタンス生成
		scroll = new JScrollPane(textArea ,
			      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
			      JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//追加ボタンのインスタンス生成
		addButton = new JButton("追加");
		//消去ボタンのインスタンス生成
		clearButton = new JButton("消去");
		//「追加」ボタンとアクション・リスナーの関連付け
		addButton.addActionListener(this);
		//「消去」ボタンとアクション・リスナーの関連付け
		clearButton.addActionListener(this);
		//ボタン部分のパネル作成
		buttonPanel = new JPanel();
		//ボタン部分のパネルへの追加ボタンの登録
		buttonPanel.add(addButton);
		//ボタン部分のパネルへの消去ボタンの登録
		buttonPanel.add(clearButton);
		//コンテナへテキストフィールド追加(レイアウトはBorderLayout)
		mainFrame.add(textField, BorderLayout.PAGE_START);
		//コンテナへテキストエリア追加(レイアウトはBorderLayout)
		mainFrame.add(scroll, BorderLayout.CENTER);
		//コンテナへボタンパネル追加(レイアウトはBorderLayout)
		mainFrame.add(buttonPanel, BorderLayout.PAGE_END);
		//メインフレームの可視化
		mainFrame.setVisible(true);
	}
	
	// 利用者の操作に応じた処理を実装
	public void actionPerformed(ActionEvent event){
		// 操作対象のオブジェクトで分岐
		 String cmd = event.getActionCommand();

		    if (cmd.equals("追加")){
			// 追加ボタンの場合
			// テキストフィールドに入力された文字列をテキストエリアへ追加
			String str = textField.getText();
			textArea.append(str);
		    } else if (cmd.equals("消去")){
			// 削除ボタンの場合
		    // テキストエリアの文字列を全消去
			textArea.setText("");
		    }
	}
	// アプリケーションの起動
	public static void main(String[] args) {
		new SwingApp();
	}
}