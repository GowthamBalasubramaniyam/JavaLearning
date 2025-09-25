package example.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// filling arrays using loops
		int[] marks = new int[6];
		int val = 95;
		for (int i = 0; i < marks.length; i++, val++) {
			marks[i] = val;
		}

		// loop through array
		for (int j = 0; j < marks.length; j++) {
			System.out.println(marks[j]);
		}

		// finding maximum
		int max = marks[0];
		for (int k = 0; k < marks.length; k++) {
			if (marks[k] > max) {
				max = marks[k];
			}
		}
		System.out.println("maximum mark is " + max);

		
		
	}

}
