package flash;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mode {
	public void mode() {
		JFrame frame = new JFrame("モード選択");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(520,600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JLabel label = new JLabel("モード選択");
		label.setLocation(120,100);
		label.setSize(450,60);
		label.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.BOLD, 60));
		frame.add(label);
		
		JButton btn = new JButton("モード1");
		btn.setLocation(170,250);
		btn.setSize(170,100);
		btn.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 40));
		frame.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.setVisible(false);
				Flash2 f = new Flash2();
				f.flash();

				Q_1 q1 = new Q_1(0,0);
				q1.q1();
			}
		});
		
		
		JButton btn2 = new JButton("モード2");
		btn2.setLocation(170,400);
		btn2.setSize(170,100);
		btn2.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 40));
		frame.add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				frame.setVisible(false);
				Flash2 f = new Flash2();
				f.flash();

				Q_2 q1 = new Q_2(0,0);
				q1.q();
			}
		});
		
		/*
		 0,0を引数に持たせているのはQ_1,Q_2のコンストラクタで問題の番号と得点を受け取るため
		 問題を配列に入れているため0番目が最初になるので0,0になっている
		 
		 */
		
		JButton btn3 = new JButton("戻る");
		btn3.setLocation(20,500);
		btn3.setSize(90,40);
		btn3.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 15));
		frame.add(btn3);
		btn3.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent ae) {
				frame.setVisible(false);
				Topmain main = new Topmain();
				
				String[] args = {"a"};
				main.main(args);
			}
	        	        
		});
		/*
		 Topmain はmainメソッドなのでインスタンスの生成するのはよくなさそうだが必要なので
		 @SuppressWarnings("static-access")
		 でエラーを回避している。
		 また、mainメソッドは
		 public static void main(String[] args)
		 (String型の配列を引数に持っているので、（多分）
		 String[] args = {"a"};
				main.main(args);
		 辻褄合わせを行うことによって処理が実行される。
		 "a"でなくてなんでもいい。
		 */
	}
}
