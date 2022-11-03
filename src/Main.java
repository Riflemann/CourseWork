import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee fEmployee = new Employee(136548, "Ivanov Ivan", 1);
        Employee sEmployee = new Employee(126941, "Ivanova Natasha", 3);
        Employee trEmployee = new Employee(216481, "Kazakov Petr", 2);
        Employee foEmployee = new Employee(365915, "Karpov Denis", 5);
        Employee fiEmployee = new Employee(25885, "Sazonov Ivan", 4);
        Employee siEmployee = new Employee(96255, "Petrunin Dima", 2);
        Employee sevEmployee = new Employee(35622, "Telegin Ivan", 1);
        Employee eEmployee = new Employee(100554, "Zotova Nina", 4);
        Employee nEmployee = new Employee(216485, "Chernets Dima", 4);
        Employee teEmployee = new Employee(326548, "Nugaev Stepan", 5);

        EmployeeBook listOfAllEmployee = new EmployeeBook(new Employee[20]);
        listOfAllEmployee.putInFreeIndex(fEmployee);
        listOfAllEmployee.putInFreeIndex(sEmployee);
        listOfAllEmployee.putInFreeIndex(trEmployee);
        listOfAllEmployee.putInFreeIndex(foEmployee);
        listOfAllEmployee.putInFreeIndex(fiEmployee);
        listOfAllEmployee.putInFreeIndex(siEmployee);
        listOfAllEmployee.putInFreeIndex(sevEmployee);
        listOfAllEmployee.putInFreeIndex(eEmployee);
        listOfAllEmployee.putInFreeIndex(nEmployee);
        listOfAllEmployee.putInFreeIndex(teEmployee);

        listOfAllEmployee.printAllEmployee();

        int sumSalary = listOfAllEmployee.calcSumSalary();

        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary);
        System.out.println("Сотрудник с минимальной зарплатой " + listOfAllEmployee.calcMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой " + listOfAllEmployee.getEmployeeGen()[listOfAllEmployee.calcMaxSalary()]);
        int averageSalary = listOfAllEmployee.calcSumSalary() / Employee.getMeterID();
        System.out.println("Среднее значение зарплат: " + averageSalary);
        String[] nameAllEmployee = new String[Employee.getMeterID()];
        nameAllEmployee = listOfAllEmployee.deriveAllNameEmployee();
        System.out.println("Список всех сотрудников: " + Arrays.toString(nameAllEmployee));
        listOfAllEmployee.toIndexSalary(20);
        System.out.println("Сумма затрат на зарплаты после индексации на 20% в месяц: " + listOfAllEmployee.calcSumSalary());

        EmployeeBook listOfDepartment = new EmployeeBook(new Employee[20]);
        listOfDepartment=listOfAllEmployee.deriveDepartment(4);


        listOfDepartment.printAllEmployee();
        int sumInDepartment = listOfDepartment.calcSumSalary();
        System.out.println("Сумма затрат на зарплаты в месяц по отделу: " + sumInDepartment);
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + listOfDepartment.calcMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + listOfDepartment.getEmployeeGen()[listOfDepartment.calcMaxSalary()]);
        averageSalary = listOfDepartment.calcSumSalary() / EmployeeBook.getMeterEmployeeFromDepartment();
        System.out.println("Среднее значение зарплат в отделе: " + averageSalary);
        listOfDepartment.toIndexSalary(20);
        System.out.println("Сумма затрат на зарплаты в отделе после индексации на 20% в месяц: " + listOfDepartment.calcSumSalary());


        listOfDepartment.printWithoutDepartment();
        System.out.println("==================");
        int numForSearch = 60000;
        listOfAllEmployee.findLessSalary(numForSearch);
        System.out.println("==================");
        listOfAllEmployee.findMoreSalary(numForSearch);

        System.out.println("==================");
        listOfAllEmployee.changeSalaryAndDepartment("Ivanov Ivan", 0, 5);

        Employee elEmployee = new Employee(10000000, "Mr Smith", 5);
        listOfAllEmployee.deleteEmployee(1);
        listOfAllEmployee.putInFreeIndex(elEmployee);

        listOfAllEmployee.changeSalaryAndDepartment("Ivanov Ivan", 0, 5);
        listOfAllEmployee.printAllEmployee();

        listOfAllEmployee.printAllEmployeePerDepartment();


    }
}


