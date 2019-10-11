package scripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class delimeter {

	public static void main(String[] args) {
		String unitNos = "AT1,AT2,AT3";

		 // \\s* means 0 or more repetitions of any whitespace character 
		 // fish is the pattern to find
		 
		  //Get Unit nos
		  Scanner s = new Scanner(unitNos).useDelimiter(",");
		  List<String> unitNo = new ArrayList<String>() ;
		  int unitCount = 0;
			 while(s.hasNext()){
					unitCount++;
					unitNo.add(s.next());
				}
		  
			 System.out.println(unitCount);
			 System.out.println(unitNo);
		 // don't forget to close the scanner!!
		 s.close();  
	}

}
