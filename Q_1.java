package flash;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Q_1 {
	
	int point;
	int mondai;
	
	public Q_1(int point,int mondai) {
		this.point = point;
		this.mondai = mondai;
	}
	
	public void q1() {
		JLabel label = new JLabel();
		Question q = new Question(mondai);
		String answer = q.question();
		
		JFrame frame4 = new JFrame("第" + (mondai + 1) + "問");
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.setSize(520,600);
		frame4.setLayout(new GridLayout(1,1));
		JButton btn1 = new JButton("第" + (mondai + 1) + "問");
		btn1.setSize(520,600);
		btn1.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.BOLD, 60));
		frame4.setVisible(true);
		frame4.add(btn1);
		
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				int time = 1500;
				if(mondai >= 3) {
					time = 1000;
				}
				frame4.setVisible(false);
				Timer timer = new Timer();
				TimerTask task = new TimerTask() {
					public void run() {
						label.setText(answer);
					}
				};
				timer.schedule(task,500);
				Timer timer2 = new Timer();
				TimerTask task2 = new TimerTask() {
					public void run() {
						label.setText("");
					}
				};
				timer2.schedule(task2,time);
			
					

			JFrame frame = new JFrame("フラッシュカード");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(520,600);
			frame.setLayout(null);
		
			LineBorder line = new LineBorder(Color.BLUE,2,true);
			label.setBorder(line);
			label.setLocation(110,30);
			label.setSize(280,60);
			label.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.BOLD, 40));
			
			frame.setVisible(true);
			frame.add(label);
		
			for(int x = 0; x < 10; x ++) {
				
				String[] result = {"7","4","1","B","8","5","2","0","9","6","3","A","0"};
				
				int a = 0;
				int b = 0;
				int c = 0;
		
					for(int i=0;i<3;i++) {
						a = a + 100;
						b = 25;
						for(int m=0;m<4;m++) {
							b = b + 100;
							JButton btn = new JButton(result[c++]);
							btn.setLocation(a,b);
							btn.setSize(100,100);
							btn.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 45));
				
							Thread tr = new Thread() {
								public void run() {
					     
									try {
										int time = 1500;
										if(mondai >= 3) {
											time = 1000;
										}
										frame.add(btn);		
										Thread.sleep(time);
					       
							
				
				
										btn.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent ae) {
												if(btn.getText().equals("A")){
													if(answer.equals(label.getText())) {
														label.setText("正解");
														point  = point  + 1;
														Timer timer3 = new Timer();
														TimerTask task3 = new TimerTask() {
															public void run() {
																if(mondai == 9) {
																	Result result = new Result(1);
																	result.result(point);
																	frame.setVisible(false);
																}else {
																	Q_1 q = new Q_1(point,mondai + 1);
																	q.q1();
																	frame.setVisible(false);	
																}
								
														}};

														timer3.schedule(task3,1000);		
								
													}else if(label.getText().equals("正解") || label.getText().equals("不正解")){
								
													}else {
														label.setText("不正解");
							
							
														Timer timer3 = new Timer();
														TimerTask task3 = new TimerTask() {
															public void run() {
																if(mondai == 9) {
																	Result result = new Result(1);
																	result.result(point);
																	frame.setVisible(false);
																}else {
																	Q_1 q = new Q_1(point,mondai + 1);
																	q.q1();
																	frame.setVisible(false);	
																}									
															}
														};

														timer3.schedule(task3,1000);												
													}		
												}else if(btn.getText().equals("B")){
													if(label.getText().equals("正解")){
								
													}else if(label.getText().equals("不正解")) {
							
													}else {
														String hg = "";
														for(int w=0;w<label.getText().length() -1;w++) {
															hg = hg + String.valueOf(label.getText().charAt(w));
														}
														label.setText(hg);
													}
							
												}else if(label.getText().indexOf("正解") != -1 || label.getText().indexOf("不正解") != -1) {
							
												}
												else {
													label.setText(label.getText()+btn.getText());
												}
					
											}
					
										});
				
					        }catch (InterruptedException e) {
					        }}};
					       tr.start();


						}
					}
			}

			frame.setVisible(true);
		
		}});	
		
	}

		
	}
