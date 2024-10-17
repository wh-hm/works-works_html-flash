package flash;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Finish {
	int player;
	int totalPlayer;
	int point;
	int mode;
	public Finish(int player, int totalPlayer, int point,int mode) {
		this.player = player;
		this.totalPlayer = totalPlayer;
		this.point = point;
		this.mode = mode;
	}
	
	public void finish() {
		
		JFrame frame = new JFrame("フラッシュカード");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(520,600);
		frame.setLayout(null);
		frame.setVisible(true);
		JLabel label = new JLabel("プレイヤーの順位");
		
		label.setLocation(60,50);
		label.setSize(400,60);
		label.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.BOLD, 50));
		frame.add(label);

		JLabel label2 = new JLabel("/" + Integer.toString(this.totalPlayer) + "位");
		label2.setLocation(300,300);
		label2.setSize(220,60);
		label2.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.BOLD, 40));
		frame.add(label2);
		
		JLabel label3 = new JLabel(Integer.toString(this.player),SwingConstants.RIGHT);
		label3.setLocation(0,200);
		label3.setSize(300,200);
		label3.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.BOLD, 100));
		frame.add(label3);
		
		JLabel label4 = new JLabel("得点:" + Integer.toString(this.point) +"/10");
		label4.setLocation(200,100);
		label4.setSize(250,100);
		label4.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.BOLD, 40));
		frame.add(label4);
		
		JButton btn = new JButton("もう一度");
		btn.setLocation(40,450);
		btn.setSize(120,60);
		btn.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 20));
		frame.add(btn);
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				frame.setVisible(false);
				Flash2 flash = new Flash2();
				flash.flash();
				if(mode == 1) {
					Q_1 q1 = new Q_1(0,0);
					q1.q1();
					}
				else {
					Q_2 q2 = new Q_2(0,0);
					q2.q();
				}
				}
		
		});
		
		JButton btn2 = new JButton("ホーム");
		btn2.setLocation(200,450);
		btn2.setSize(120,60);
		btn2.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 20));
		frame.add(btn2);
		btn2.addActionListener(new ActionListener() {
			
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent ae) {
				frame.setVisible(false);
				Topmain main = new Topmain();
				String[] args = {"a"};
				main.main(args);
			}
		
		});
		
		JButton btn3 = new JButton("終了");
		btn3.setLocation(360,450);
		btn3.setSize(120,60);
		btn3.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 20));
		frame.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.setVisible(false);
				
			}
		
		});
	}
		
	}

	

