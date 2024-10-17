package flash;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Flash2 {

	public void flash() {
		

		
		String prepare = "prepare.txt";
		String question = "question.txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(prepare));
			BufferedWriter writer = new BufferedWriter(new FileWriter(question));
			
			String line = reader.readLine();
			
			String q = "";
			int e;
			
			while(line != null) {
				
				e = Integer.parseInt(line);
				q = "";
				
				for(int a = 0; a < e; a ++) {
					
					
					int  c = (int)(Math.random() * 10);
				
					q = q + Integer.toString(c);
				}
				
				writer.write(q);
				writer.newLine();
				line = reader.readLine();
				
			}
			

			
				
			reader.close();
			writer.close();
				
			/*ここでは問題を作成している
			 *
			 */
			
		} catch (IOException e) {
			
			System.out.println("実行に失敗しました:" + e.getMessage());
		}
		
		

	}

}
