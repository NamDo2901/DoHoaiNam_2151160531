package Service;

import Model.Employee;

import java.util.*;


public class AddAndDelete {

	public static List<Employee> employeeList;
    public static void showEmployee(){
        System.out.println("id"+" "+"      Name  |"+" "+"Age|"+" "+"Department|"+" "+"     Code|"+" "+"Salary Rate" );
        for (Employee a: employeeList){
            System.out.println(a.getId()+"| "+a.getName()+"| "+a.getAge()+"| "+a.getDepartment()
            +"| "+a.getCode()+"| "+a.getSalaryRate());}
    }
    public static List<Employee> createEmploy() {
        Employee employee = new Employee();
        List<String> departmentList = new ArrayList<>();
        departmentList.addAll(Arrays.asList("department 1", "department 2", "department 3"));
         ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        for (int i = 1; i <= 10; i++) {
            String name = "Tran Van " + (char) ('A' + (2*i + 1));
        	//String name = UUID.randomUUID().toString();
            Random randomAge = new Random();
            long age = 20 + randomAge.nextLong(10);
            String code = "1"+(char) ('A' + i)+"2" + (char) ('Z' - i);
            Double salaryRate = (double) (i * 10000);
            Random random = new Random();
            int index = random.nextInt(departmentList.size());
            String department = departmentList.get(index);
            listEmployee.add(new Employee(i, name, age, department, code, salaryRate));
        }
        employeeList = listEmployee;
        return employeeList;
    }
    public static void newEmployee(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");String name =scan.nextLine();
        System.out.println("Enter age: ");long age =scan.nextLong(); scan.nextLine();
        System.out.println("Enter department: ");String department=scan.nextLine();
        System.out.println("Enter code ");String code =scan.nextLine();
        System.out.println("Enter salary rate ");int salaryRate=scan.nextInt();
        Employee lastEmployee = employeeList.get(employeeList.size()-1);
        employeeList.add(new Employee(lastEmployee.getId()+1,name,age,department,code,(double)salaryRate));
    }
    public static void DeleteEmployee(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter id Employee you want to delete:" );
        int empId=scan.nextInt();
        boolean found = false;
        for (int i = employeeList.size() - 1; i >= 0; i--) {
            if (employeeList.get(i).getId() == empId) {
                employeeList.remove(i);
                System.out.println("Delete sucessfully Employee with id "+empId);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Can't find Employee with id "+empId);
        }
        }
    }
