package flash;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ResultWriter {
	
	String result1 = "rank1.txt";
	String result2 = "rank2.txt";
	
	
public void resultwriter() {
	try {	
	
	BufferedWriter writer1 = new BufferedWriter(new FileWriter(result1));
	BufferedReader reader2 = new BufferedReader(new FileReader(result2));
	String line;
	
	while((line = reader2.readLine()) != null) {
		
			writer1.write(line);
			writer1.newLine();
			
	}
	
	writer1.close();
	reader2.close();
	
	}catch(Exception e) {
		
	
		System.out.println("実行に失敗しました:" + e.getMessage());
	
	}
}

}
