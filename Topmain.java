package flash;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import hosokawa.Play;

public class Topmain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("フラッシュカード");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(520,600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JLabel label = new JLabel("フラッシュカード");

		label.setLocation(50,100);
		label.setSize(450,60);
		label.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.BOLD, 60));
		frame.add(label);
		
		JButton btn = new JButton("スタート");
		btn.setLocation(150,250);
		btn.setSize(200,100);
		btn.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 40));
		frame.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Mode mode = new Mode();
				mode.mode();
				frame.setVisible(false);
			}
		});
		JButton btn2 = new JButton("遊び方");
		btn2.setLocation(125,400);
		btn2.setSize(100,50);
		btn2.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 20));
		frame.add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Play play = new Play();
				play.play();
				
			}
		});
		
		JButton btn3 = new JButton("終了");
		btn3.setLocation(275,400);
		btn3.setSize(100,50);
		btn3.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 20));
		frame.add(btn3);
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.setVisible(false);
				
			}
		});
		
		/*メモ
		 クラスが変わるたびにフレームが新しくできているためフレーム作成を含んでいるクラスを呼ぶときに
		 frame.setVisible(false);
		 を入れて元居た場所のフレームを見えないようにしている。
		
		 */
	}

}
