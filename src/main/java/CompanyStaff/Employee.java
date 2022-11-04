package CompanyStaff;

import java.math.BigDecimal;

public abstract class Employee implements EmployeeService {
    private int indexOfClerk;
    private int salary;

    public Employee(int indexOfClerk) {
        this.indexOfClerk = indexOfClerk;
    }

    public int getIndexOfClerk() {
        return indexOfClerk;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee(indexOfClerk=" + this.getIndexOfClerk() + ", salary=" + this.getSalary() + ")";
    }
}
