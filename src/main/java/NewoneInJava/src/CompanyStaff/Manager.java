package NewoneInJava.src.CompanyStaff;

import java.util.concurrent.ThreadLocalRandom;

public class Manager extends Employee implements EmployeeService {
    private int income;

    public Manager(int indexOfClerk) {
        super(indexOfClerk);
    }

    public int getIncome() {
        return income;
    }

    public void setIncome() {
        this.income = ThreadLocalRandom.current().nextInt(100, 400) * 1000;
    }

    public void setSalary() {
        this.setSalary(ThreadLocalRandom.current().nextInt(60, 70) * 1000);
    }

    public int getMonthSalary() {
        return this.getSalary() + this.getIncome() * 5 / 100;
    }

    public String toString() {
        return "Manager_id" + this.getIndexOfClerk() + ". income = " + getIncome() + ". salary = " + this.getSalary() + ". monthSalary = " + getMonthSalary();
    }
}
