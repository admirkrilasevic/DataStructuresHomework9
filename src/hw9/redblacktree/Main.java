package hw9.redblacktree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import hw9.Student;

public class Main {

	public static void main(String[] args) throws IOException {
		Student[] students = new Student[1000000];
		int i = 0;
		
		BufferedReader csvReader = new BufferedReader(new FileReader("src/globaluniversitystudents.csv"));
		while (i < students.length) {

			String row = csvReader.readLine();

		    String[] rowSplit = row.split(";");

		    students[i] = new Student(Integer.parseInt(rowSplit[0]), rowSplit[1], rowSplit[2], rowSplit[3], 
		    		rowSplit[4], rowSplit[5], Integer.parseInt(rowSplit[6]));
		    i++;
	
		}

		csvReader.close();
		
		RedBlackTree<Integer, Student> rbt = new RedBlackTree<Integer, Student>();
		
		for (int j = 0; j < students.length; j++) {
			rbt.put(students[j].getStudentID(), students[j]);
		}
		
		System.out.println("Enter the ID of the student you want to retrieve: ");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		scan.close();
		Student student = rbt.get(id);
		if (student != null) {
			System.out.println(student);
			System.out.println("The student was retrieved from BST in " + rbt.getSteps() + " steps");
		} else {
			System.out.println("The student with the given ID does not exist");
			System.out.println("The search was completed in " + rbt.getSteps() + " steps");
		}
		

	}

}
