package Employee_Example;

public class Employee {
    private int id;
    private int salary;
    private String name;
    private String address;

    public Employee(){
        id = 0;
        salary = 0;
        name = null;
        address = null;
    }

    public Employee(int id, int salary, String name, String address) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
