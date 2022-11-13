package CompanyStaff;

import java.util.concurrent.ThreadLocalRandom;

public class TopManager extends Employee implements EmployeeService {
    private final Company bigCompany;

    public TopManager(int indexOfClerk, Company bigCompany) {
        super(indexOfClerk);
        this.bigCompany=bigCompany;
    }

    public void setSalary() {
        this.setSalary(ThreadLocalRandom.current().nextInt(100, 130) * 1000);
    }

    public int getMonthSalary() {
        if (this.bigCompany.getCompanyIncome() >= 10000000) {
            return this.getSalary() + this.getSalary() * 3 / 2;
        } else return this.getSalary();
    }

    @Override
    public void setZeroSalary() {
        this.setSalary(0);
    }

    public String toString() {
        return "TopManager_id" + this.getIndexOfClerk() + ". salary = " + this.getSalary() + ". monthSalary = " + getMonthSalary();
    }
}