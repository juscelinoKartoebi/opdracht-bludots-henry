package sr.bludots.Henry;

import java.util.HashMap;

public class Assignment2 {
	

	// assignments 2:
	// vul een hashmap met 1 miljoen records, gebruik elke keer een unieke id, de naam mag steeds hetzelfde
	// zijn of mag je veranderen als je dat voor elkaar krijgt
	// meet hoe lang het duurt om een record op te vragen
	// maak 1 record met een andere naam,
	// meet ook hoe lang het duurt om dit record via zijn key op te vragen...

	private HashMap<Long, String> myHashMap;
//	private Long totalRecords;
//	private Long t1;
//	private Long t0;

	public void recordsInfo(HashMap<Long, String> HashMap, Long totalRecords, String name) {

		this.myHashMap = HashMap;
		Long uniqueID = 1L;
		for (int i = 0; i <= totalRecords - 1; i++) {
			myHashMap.put(uniqueID++, name);
		}

		System.out.println(myHashMap);

	}

//	public void durationSearchRecord(Long myRecord) {    //zit even vast hiermee
//
//		t0 = System.currentTimeMillis();
//
//		for (Long i = 1L; i <= totalRecords - 1; i++) {
//			if (myHashMap.containsKey(totalRecords));
//
//			t1 = System.currentTimeMillis();
//
//			System.out.println("Duration" + (t1 - t0) + " Milliseconds");
//		}
//
//	}
}
