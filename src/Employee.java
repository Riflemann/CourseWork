public class Employee {
    private int salary;
    private String name;
    private int department;
    private int employeesID;
    private static int meterID;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public int getDepartment() {
        return department;
    }
    public static int getMeterID() {
        return meterID;
    }
    public int getEmployeesID() {
        return employeesID;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmployeesID(int employeesID) {
        this.employeesID = employeesID;
    }

    @Override
    public String toString() {
        return "Name: " + name +" Salary: " + salary + " Department: " + department + " ID: " + employeesID;
    }

    public Employee(int salary, String name, int department) {
        this.salary = salary;
        this.name = name;
        this.department = department;
        meterID += 1;
        this.employeesID = getMeterID();
    }
}
