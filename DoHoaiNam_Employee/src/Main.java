import Model.Employee;
import Service.AddAndDelete;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		AddAndDelete.createEmploy();
		AddAndDelete.showEmployee();
	      while(true){
	      try {
	              System.out.println("--------------------");
	              System.out.println("1-Add new");
	              System.out.println("2-Delete");
	              System.out.println("3-Exit");
	              System.out.println("--------------------");
	              System.out.print("Your option: ");
	              int choose =scan.nextInt();
	              if (choose>3){
	                  System.out.println("Please choose agian!");;
	              }
	              if (choose==1){
	            	  AddAndDelete.newEmployee();
	            	  AddAndDelete.showEmployee();
	              }
	              if (choose==2){
	            	  AddAndDelete.DeleteEmployee();
	            	  AddAndDelete.showEmployee();
	              }
	              if (choose==3){
	                  System.out.println("Thank you");
	                  break;
	              }
	          } catch (Exception e) {
	              System.out.println("Please choose agian!");
	              scan.nextLine();
	          }
	      }

	}

}
