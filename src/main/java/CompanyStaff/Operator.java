package CompanyStaff;

import java.util.concurrent.ThreadLocalRandom;

public class Operator extends Employee implements EmployeeService {

    public Operator(int indexOfClerk) {
        super(indexOfClerk);
    }

    public void setSalary() {
        this.setSalary(ThreadLocalRandom.current().nextInt(50, 61) * 1000);
    }

    public int getMonthSalary() {
        return this.getSalary();
    }

    @Override
    public void setZeroSalary() {
        this.setSalary(0);
    }

    public String toString() {
        return "Operator_id" + this.getIndexOfClerk() + " Salary = " + this.getMonthSalary();
    }

}