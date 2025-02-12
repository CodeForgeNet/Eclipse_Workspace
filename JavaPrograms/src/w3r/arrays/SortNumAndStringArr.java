package w3r.arrays;

//Write a Java program to sort a numeric array and a string array.

public class SortNumAndStringArr {

	public static void main(String[] args) {
		int[] numArr = { 22, 3, 8, 9, 2, 11 };

		for (int i = 0; i < numArr.length - 1; i++) {
			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) {
					int tempArr = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = tempArr;
				}
			}
		}

		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
			if(i<numArr.length-1) {
				System.out.print(", ");
			}
		}

	}
	
	

}
