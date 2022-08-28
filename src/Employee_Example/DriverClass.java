package Employee_Example;

public class DriverClass {
    public static void main(String[] args) {
        Employee emp = new Employee(181500368,33700,"Jeremy", "Indonesia");
        System.out.println("Employee id is : " + emp.getId());
        System.out.println("Employee salary is : " + emp.getSalary());
        System.out.println("Employee name is : " + emp.getName());
        System.out.println("Employee address is : " + emp.getAddress());
    }
}
