package pm.irctc.testcases.datasheet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class printcurrentdttime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("YYYY_MM_DD_HH_MM_SS");
		
		LocalDateTime current = LocalDateTime.now();
		
		String currentdaytime = (String) dtf.format(current);
		
		System.out.println(currentdaytime);

	}

}
