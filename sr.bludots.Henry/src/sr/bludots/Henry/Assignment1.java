package sr.bludots.Henry;

import java.util.Arrays;

public class Assignment1 {

	public String[] arr;
	public Long t0;
	public Long t1;

	public void sameName(String[] arr, String name) {

		// vul een array met 1 miljoen records (allemaal zelfde naam)

		this.arr = arr;
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = name;

		}

		System.out.println(Arrays.toString(arr));

	}

	public void changeRecords(String firstName, String midName, String lastName) {
		
		// wijzig steeds van 1 record (de laatste, de middelste en de eerste) de naam
		
		int firstIndex = 0;
		int lastIndex = arr.length - 1;
		int midIndex = lastIndex / 2;

		arr[firstIndex] = firstName;
		arr[lastIndex] = lastName;
		arr[midIndex] = midName;

		System.out.println(Arrays.toString(arr));

	}

	public void duration(String searchName) {
		
		// zoek naar dit record en laat zien hoe lang dit duurt.

		t0 = System.currentTimeMillis();

		for (int i = 0; i <= arr.length - 1; i++) {
			if (searchName.equals(arr[i])) {

			}
		}
		t1 = System.currentTimeMillis();

		System.out.println("duration: " + (t1 - t0) + " milliseconds");
	}

}
