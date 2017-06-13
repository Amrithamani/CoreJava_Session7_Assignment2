package session7;

//importing Scanner package outside

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initializing String variable name

		String name = "Amritha Kaushik";

		// initializing scanner input using object

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the substring");
		// prints Enter the substring

		String subName = s.nextLine();// getting String input

		s.close();// closing Scanner object

		// initialize integer variable using inbuilt function

		int match = name.indexOf(subName);

		// checks match value greater than zero

		if (match > 0) {

			System.out.println("substring found");
			// prints substring found

		} else {

			System.out.println("substring not found");
			// prints substring not found

		}
	}

}
