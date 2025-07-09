package Miniproject;
import java.util.*;

public class Mini_Project {

	public static void main(String[] args) {
		 int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
	        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
	        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
	        char[] desigCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
	        String[] dept = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
	        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
	        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
	        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Employee ID: ");
	        int inputId = sc.nextInt();
	        boolean found = false;

	        for (int i = 0; i < empNo.length; i++) {
	            if (empNo[i] == inputId) {
	                String designation = "";
	                int da = 0;

	                switch (desigCode[i]) {
	                    case 'e':
	                        designation = "Engineer";
	                        da = 20000;
	                        break;
	                    case 'c':
	                        designation = "Consultant";
	                        da = 32000;
	                        break;
	                    case 'k':
	                        designation = "Clerk";
	                        da = 12000;
	                        break;
	                    case 'r':
	                        designation = "Receptionist";
	                        da = 15000;
	                        break;
	                    case 'm':
	                        designation = "Manager";
	                        da = 40000;
	                        break;
	                }

	                int salary = basic[i] + hra[i] + da - it[i];

	                // Properly aligned table output
	                System.out.printf("%-10s%-12s%-15s%-15s%-10s\n", "Emp No.", "Emp Name", "Department", "Designation", "Salary");
	                System.out.printf("%-10d%-12s%-15s%-15s%-10d\n", empNo[i], empName[i], dept[i], designation, salary);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("There is no employee with empid : " + inputId);
	        }

	        sc.close();
	    }
	

	}


