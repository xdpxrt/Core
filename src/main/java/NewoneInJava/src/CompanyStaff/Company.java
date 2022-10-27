package NewoneInJava.src.CompanyStaff;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private int companyIncome = 0;

    List<Employee> employeeList = new ArrayList<>();

    public void hire(Employee employee) {
        if (employee instanceof Operator) {
            employee.setSalary();
            employeeList.add(employee);
        }
        if (employee instanceof Manager) {
            employee.setSalary();
            employeeList.add(employee);
        }
        if (employee instanceof TopManager) {
            employee.setSalary();
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
                ((Manager) employee).setIncome();
                companyIncome += ((Manager) employee).getIncome();
            }
        }
    }

    public static int getCompanyIncome() {
        return companyIncome;
    }

}

