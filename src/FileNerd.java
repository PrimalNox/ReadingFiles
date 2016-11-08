import java.io.*;
import java.util.*;
import java.lang.Math;

public class FileNerd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sf = new Scanner(new File("F:\\Workspace\\ReadingFiles\\NerdData.txt"));
		String nD[] = new String [1000];
		int j = -1;
		while (sf.hasNext()) {
			j++;
			nD[j] = sf.nextLine();
		}
		sf.close();
		
		
		for (int h = 0; h<=j;h++){
			//String sJ = nD[h];
			if(nD[h].substring(0,3).equals("The")){
				System.out.println(nD[h]);
		}
		
		}
			
	}
}
