package NewoneInJava.src.CompanyStaff;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private int companyIncome;

    List<Employee> employeeList = new ArrayList<>();

    public void hire(Employee employee) {
        if (employee instanceof Operator) {
            employee.setSalary();
            employeeList.add(employee);
        }
        if (employee instanceof Manager) {
            employee.setSalary();
            ((Manager) employee).getMonthSalary();
            ((Manager) employee).setIncome();
            employeeList.add(employee);
        }
    }

    public void hireAll(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            hire(employee);
        }
    }

    public void countCompanyIncome() {
        for (Employee employee : employeeList) {
            if (employee instanceof Manager) {
                companyIncome = companyIncome + ((Manager) employee).getIncome();
            }
        }
    }

    public int getCompanyIncome() {
        return companyIncome;
    }
}
