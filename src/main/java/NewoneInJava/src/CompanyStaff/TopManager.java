package NewoneInJava.src.CompanyStaff;

import java.util.concurrent.ThreadLocalRandom;

public class TopManager extends Employee implements EmployeeService {
    private Company bigCompany;

    public TopManager(int indexOfClerk) {
        super(indexOfClerk);
    }

    public void setSalary() {
        this.setSalary(ThreadLocalRandom.current().nextInt(100, 130) * 1000);
    }

    public int getMonthSalary() {
        if (this.bigCompany.getCompanyIncome() >= 1000000) {
            return this.getSalary() + this.getSalary() * 3 / 2;
        }
         else return this.getSalary();
    }
}