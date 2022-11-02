import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employeeGen;
    private static int meterEmployeeFromDepartment;

    public EmployeeBook(Employee[] employeeGen) {
        this.employeeGen = employeeGen;
    }

    public Employee[] getEmployeeGen() {
        return employeeGen;
    }

    public void setEmployeeGen(Employee[] employeeGen) {
        this.employeeGen = employeeGen;
    }

    public static int getMeterEmployeeFromDepartment() {
        return meterEmployeeFromDepartment;
    }

    public static void setMeterEmployeeFromDepartment(int meterEmployeeFromDepartment) {
        EmployeeBook.meterEmployeeFromDepartment = meterEmployeeFromDepartment;
    }

    public void putInFreeIndex(Employee employee) {
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] == null) {
                employeeGen[i] = employee;
                return;
            }
            if (i == this.employeeGen.length - 1) {
                System.out.println("Не удалось добавить всех сторудников. В массиве нет места для новвых сотрудников");
                return;
            }
            continue;
        }
    }

    public void printAllEmployee() {
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                System.out.println(this.employeeGen[i]);
            }
        }
    }

    public int calcSumSalary() {
        int sum = 0;
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                sum += this.employeeGen[i].getSalary();
            }
        }
        return sum;
    }

    public int calcMinSalary(int sumSal) {
        int indexMinSalary = 0;
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                if (this.employeeGen[i].getSalary() < sumSal) {
                    sumSal = this.employeeGen[i].getSalary();
                    indexMinSalary = i;
                }
            }
        }
        return indexMinSalary;
    }

    public int calcMaxSalary() {
        int maxSalary = 0;
        int indexMaxSalary = 0;
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                if (this.employeeGen[i].getSalary() > maxSalary) {
                    maxSalary = this.employeeGen[i].getSalary();
                    indexMaxSalary = i;
                }
            }
        }
        return indexMaxSalary;
    }

    public String[] deriveAllNameEmployee() {
        String[] allNameEmployee = new String[Employee.getMeterID()];
        for (int i = 0; i < Employee.getMeterID(); i++) {
            if (this.employeeGen[i] != null) {
                allNameEmployee[i] = this.employeeGen[i].getName();
            }
        }
        return allNameEmployee;
    }

    public void toIndexSalary(int per) {
        int a = 0;
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                a = this.employeeGen[i].getSalary() / 100 * per;
                this.employeeGen[i].setSalary(a + this.employeeGen[i].getSalary());
            }
        }

    }

    public void deriveDepartment(int numDepart) {

        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                if (this.employeeGen[i].getDepartment() != numDepart) {
                    this.employeeGen[i] = null;
                }
            }
        }
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                EmployeeBook.meterEmployeeFromDepartment += 1;
            }
        }
    }

    public void printWithoutDepartment() {
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                System.out.print("Name: " + this.employeeGen[i].getName() + " Salary: " + this.employeeGen[i].getSalary() + " ID: " + this.employeeGen[i].getEmployeesID());
                System.out.println();
            }
        }
    }

    public void findLessSalary(int lessSalary) {
        ArrayList<Employee> b = new ArrayList<Employee>();
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                if (this.employeeGen[i].getSalary() < lessSalary) {
                    b.add(this.employeeGen[i]);
                }
            }
        }
        for (int i = 0; i < b.size(); i++) {
            System.out.print("Name: " + b.get(i).getName() + " Salary: " + b.get(i).getSalary() + " ID: " + b.get(i).getEmployeesID());
            System.out.println();
        }

    }

    public void findMoreSalary(int moreSalary) {
        ArrayList<Employee> b = new ArrayList<Employee>();
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                if (this.employeeGen[i].getSalary() > moreSalary) {
                    b.add(this.employeeGen[i]);
                }
            }
        }
        for (int i = 0; i < b.size(); i++) {
            System.out.print("Name: " + b.get(i).getName() + " Salary: " + b.get(i).getSalary() + " ID: " + b.get(i).getEmployeesID());
            System.out.println();
        }
    }

    public void deleteEmployee(int iD) {
        int a = 0;
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                if (this.employeeGen[i].getEmployeesID() == iD) {
                    this.employeeGen[i] = null;
                }
            }
            a++;
            if (a == this.employeeGen.length - 1) {
                System.out.println("Работник не найден");
            }
        }
    }

    public void deleteEmployee(String name) {
        int a = 0;
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                if (this.employeeGen[i].getName() == name) {
                    this.employeeGen = null;
                }
            }
            a++;
            if (a == this.employeeGen.length - 1) {
                System.out.println("Работник не найден");
            }
        }
    }

    public void deleteEmployee(String name, int iD) {
        int a = 0;
        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                if (this.employeeGen[i].getEmployeesID() == iD && this.employeeGen[i].getName() == name) {
                    this.employeeGen = null;
                }
            }
            a++;
            if (a == this.employeeGen.length - 1) {
                System.out.println("Работник не найден");
            }
        }
    }

    public void changeSalaryAndDepartment(String name, int newSalary, int newDepartment) {
        for (int i = 0; i < this.employeeGen.length; i++) {
            int a = 0;
            if (this.employeeGen[i] != null && this.employeeGen[i].getName() == name) {
                if (newDepartment == 0) {
                    this.employeeGen[i].setSalary(newSalary);
                } else if (newSalary == 0) {
                    this.employeeGen[i].setDepartment(newDepartment);
                } else {
                    this.employeeGen[i].setSalary(newSalary);
                    this.employeeGen[i].setDepartment(newDepartment);
                }
            }
            a++;
            if (a == this.employeeGen.length - 1) {
                System.out.println("Работник не найден");
            }
        }
    }

    public void printAllEmployeePerDepartment() {
        ArrayList<Employee> depOne = new ArrayList<Employee>();
        ArrayList<Employee> depTwo = new ArrayList<Employee>();
        ArrayList<Employee> depThree = new ArrayList<Employee>();
        ArrayList<Employee> depFour = new ArrayList<Employee>();
        ArrayList<Employee> depFive = new ArrayList<Employee>();

        for (int i = 0; i < this.employeeGen.length; i++) {
            if (this.employeeGen[i] != null) {
                if (this.employeeGen[i].getDepartment() == 1) {
                    depOne.add(this.employeeGen[i]);
                }
                if (this.employeeGen[i].getDepartment() == 2) {
                    depTwo.add(this.employeeGen[i]);
                }
                if (this.employeeGen[i].getDepartment() == 3) {
                    depThree.add(this.employeeGen[i]);
                }
                if (this.employeeGen[i].getDepartment() == 4) {
                    depFour.add(this.employeeGen[i]);
                }
                if (this.employeeGen[i].getDepartment() == 5) {
                    depFive.add(this.employeeGen[i]);
                }
            }
        }
        System.out.println("Список сотрудник отдала №1:");
        System.out.println(depOne);
        System.out.println("Список сотрудник отдала №2:");
        System.out.println(depTwo);
        System.out.println("Список сотрудник отдала №3:");
        System.out.println(depThree);
        System.out.println("Список сотрудник отдала №4:");
        System.out.println(depFour);
        System.out.println("Список сотрудник отдала №5:");
        System.out.println(depFive);
    }
}