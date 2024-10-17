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

public class Q_2 {
	int point ;
	int mondai ;
	
	public Q_2(int point,int mondai) {
		this.point = point;
		this.mondai = mondai;
	}
	public void q() {
		
		JLabel label = new JLabel();
		Question q = new Question(mondai);
		String answer = q.question();
		
		JFrame frame4 = new JFrame("第" + (mondai + 1) + "問");
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.setSize(520,600);
		frame4.setLayout(new GridLayout(1,1));
		JButton btn1 = new JButton("第" + (mondai + 1) + "問");
		btn1.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 60));
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
		
		char[] qnum = new char[answer.length()];
		for(int num = 0; num < answer.length(); num++) {
			qnum[num] = answer.charAt(num);
			
		}
		
	
			
		String[] result = {"7","4","1","A","8","5","2","0","9","6","3","A","0"};
		
				int a = 0;
				int b = 0;
				int c = -1;
			
		for(int i=0;i<3;i++) {
			a = a + 100;
			b = 25;
			for(int m=0;m<4;m++) {
				b = b + 100;
				
				c  = c + 1;
				if(m == 3 && (i == 0 || i ==2)) {
					
					continue;
				}
				
				JButton btn = new JButton(result[c]);
				btn.setLocation(a,b);
				btn.setSize(100,100);
				btn.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 45));
				if(i == 2 && m == 2){
					a = 200;
				}
				
				Thread tr = new Thread() {
					 public void run() {
					       
					        try {
					        	int time = 1500;
								if(mondai >= 3) {
									time = 1000;
								}
					        	frame.add(btn);
					            Thread.sleep(time); // 10秒(10000ms)間、今のスレッドを停止させる
					      
				
				
				
				btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {

							
						
						 if(label.getText().indexOf("正解") != -1 || label.getText().indexOf("不正解") != -1) {
							
								
						}
						else {	
						
							 label.setText(label.getText()+btn.getText());
							
								 	
								 	if(label.getText().length() == answer.length() && qnum[answer.length() - 1] == label.getText().charAt(answer.length() - 1)) {
								 		
								
								Timer timer4 = new Timer();
								TimerTask task4 = new TimerTask() {
								public void run() {
			
									
									label.setText("正解");
								
									point ++;
								}
								};
								timer4.schedule(task4, 10);
								
								
								Timer timer3 = new Timer();
								TimerTask task3 = new TimerTask() {
									public void run() {
										if(mondai == 9) {
											Result result = new Result(2);
											result.result(point);
													frame.setVisible(false);
										}else {
											Q_1 q = new Q_1(point,mondai + 1);
											q.q1();
											frame.setVisible(false);	
										}}
									
								};timer3.schedule(task3,1000);
								
													
													
													
													
						
								 	}else if(label.getText().length() < answer.length() && qnum[label.getText().length() - 1] == label.getText().charAt(label.getText().length() - 1)) {
								
								 	}else {
						 		
						
					
								 		Timer timer4 = new Timer();
								 		TimerTask task4 = new TimerTask() {
								 			public void run() {
								 				label.setText("不正解");
						
								 			}
								 		};
								 			timer4.schedule(task4, 10);
						
						
								 			Timer timer3 = new Timer();
								 			TimerTask task3 = new TimerTask() {
								 				public void run() {
								 					if(mondai == 9) {
														Result result = new Result(2);
														result.result(point);
																frame.setVisible(false);
													}else {
														Q_1 q = new Q_1(point,mondai + 1);
														q.q1();
														frame.setVisible(false);	
													}
								 				}
							
						 		};timer3.schedule(task3,1500);
						
											
						
						 	}
					
						}};
					
				});
				
			}
					  catch (InterruptedException e) {
				        }

				    
				    }
				};tr.start();
		};
		
			
			
		

		frame.setVisible(true);
				 
		
			
		}
			}});
	
	}
	}

		
	
