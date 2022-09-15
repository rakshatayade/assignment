package assignment6aug;
import java.util.Scanner;
public class Student {

	

		public Student(int studentId, String studentName, String studentAddress) {
		// TODO Auto-generated constructor stub
	}

		public Student(int studentId, String studentName, String studentAddress, String collegename) {
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) {
			
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Student ID: ");
			int studentId=sc.nextInt();
			
			System.out.println("Enter Student Name: ");
			String studentName=sc.next();
			
			System.out.println("Enter Student Address: ");
			String studentAddress=sc.next();
			
			
			while(true)
			{
				System.out.println("Is Student Is From NIT? Yes/No");
				String ans=sc.next();
				
				if(ans.equalsIgnoreCase("yes"))
		         {
		             Student s = new Student(studentId, studentName, studentAddress);
		             
		            System.out.println("Student ID: "+s.getstudentId());
		            System.out.println("Student Name: "+s.getstudentName());
		            System.out.println("Student Address: "+s.getstudentAddress());
		            System.out.println("College Name: "+s.getcollegeName());	      
		             break;
		         } 
				
		             else if(ans.equalsIgnoreCase("no"))
		            	 
		             { 
		            	 System.out.println("Enter College Name: ");
		             	String collegename =sc.next();
		             	
		             	Student s1=new Student(studentId, studentName, studentAddress,collegename);
		             	
		            	System.out.println("Student ID: "+s1.getstudentName());
			            System.out.println("Student Name: "+s1.getstudentName());
			            System.out.println("Student Address: "+s1.getstudentAddress());
			            System.out.println("College Name: "+s1.getcollegeName());	 
		             }	 
		             
		             else {
		            	 System.out.println("Invalid Answer");
		            	 }
			}
		}

		private String getcollegeName() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getstudentAddress() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getstudentName() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getstudentId() {
			// TODO Auto-generated method stub
			return null;
		}

	}

/* Create a class Student with the private attributes

int studentId

String studentName, studentAddress, collegeName. 

Include appropriate getter methods.

Assume most of the students are from “NIT” college. So user has to give input whether the student is from NIT or not. 

    If student belongs to NIT, give input as 'yes/YES' and  skip input for the attribute collegeName  and create student object with 3-argument constructor to initilze the values for studentId, studentName and studentAddress and  collegeName as “NIT”.
    If student belongs to other college, give input as 'no/NO' and get college name from the user and create student object with 4-argument constructor to initialize all the values. 
    Instead of Yes / No, if user enters different input then display 'Wrong Input' and get the input again.

Based on the above assumptions write the necessary constructors in the Student class.

Write a class StudentMain with the main method and test the application.


*/
