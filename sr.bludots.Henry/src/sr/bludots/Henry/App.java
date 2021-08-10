package sr.bludots.Henry;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		
		String [] arr = new String [10];
		Assignment1 class1 = new Assignment1();
        class1.sameName(arr, "Juscelino");
        class1.changeRecords("Lino", "Bert", "Ernie");
        class1.duration("Lino");
        
        HashMap <Long, String> list = new HashMap <> ();
        Assignment2 class2 = new Assignment2();
        class2.recordsInfo(list,  100L, "Juscelino");

        
        
	}

}
