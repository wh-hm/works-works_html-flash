package flash;

import java.io.BufferedReader;
import java.io.FileReader;

public class Question {
	int num ;
	public Question(int num) {
		this.num = num;
	}
	public String question() {
		try{
			BufferedReader reader = new BufferedReader(new FileReader("question.txt"));
			String[] q = new String[10];
			String line;
			int a = 0;
			while((line = reader.readLine()) != null) {
				q[a] = line;
				a ++;
				
			}
			reader.close();
			return q[num];
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return e.getMessage();
		}
		
	}
}
