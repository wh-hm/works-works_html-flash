package flash;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Play {
	public void play() {
		JFrame frame = new JFrame("フラッシュカードの遊び方");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(520,600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		String rule = "rule.txt";
		try {
			BufferedReader reader1 = new BufferedReader(new FileReader(rule));
			
			String line = reader1.readLine();
			
			
			int tate = 0;
			int yoko = 40;
			for(int a = 0; a < 13; a ++) {
				tate = tate + 30;

				JLabel label = new JLabel(line);
				label.setSize(400,60);
				label.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.BOLD, 15));
				label.setLocation(yoko,tate);
				line = reader1.readLine();
				frame.add(label);
			
			}
			
			/*説明文を行間を等間隔にするためにfor文で+30ずつしている。
			 while文で書くならば
			  while(line != null) {
				tate = tate + 30;

				JLabel label = new JLabel(line);
				label.setSize(400,60);
				label.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.BOLD, 15));
				label.setLocation(yoko,tate);
				line = reader1.readLine();
				frame.add(label);
			
			}
			
			改行を含んでいるため途中でwhile文を抜ける可能性がある
			 */
			reader1.close();
		}
		
		
        catch (IOException e) {
			
			System.out.println("実行に失敗しました:" + e.getMessage());
			
		}
		
		JButton btn = new JButton("戻る");
		btn.setLocation(200,450);
		btn.setSize(100,50);
		btn.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体", Font.ITALIC, 20));
		frame.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.setVisible(false);
			}
		});
	}
}
