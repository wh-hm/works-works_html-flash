package flash;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Result {
	
	int mode;
	
	public Result(int mode) {
		this.mode = mode;
	}

	public void result(int point) {

		String result1 = "rank1.txt";
		String result2 = "rank2.txt";
		
		
		int a = 0;
		int totalPlayer = 0;
		int player = 0;
		
		try {
			
			BufferedReader reader1 = new BufferedReader(new FileReader(result1));
			
			BufferedWriter writer2 = new BufferedWriter(new FileWriter(result2));
			
			String line = reader1.readLine();
			do {
				totalPlayer ++;
			if(point > Integer.parseInt(line) && a == 0) {
				
				writer2.write(Integer.toString(point));
				writer2.newLine();
				player = totalPlayer;
				a = 1;
			}
			
			writer2.write(line);
			writer2.newLine();
		}	while((line = reader1.readLine()) != null);	
			
			
			reader1.close();
			writer2.close();
			ResultWriter rw = new ResultWriter();
			rw.resultwriter();
			Finish finish = new Finish(player, totalPlayer,point,mode);
				finish.finish();
			
		} catch (IOException e) {
			
			System.out.println("実行に失敗しました:" + e.getMessage());
			
		}
		
		
		

	}

}
