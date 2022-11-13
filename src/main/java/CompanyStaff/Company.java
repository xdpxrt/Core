package CompanyStaff;

import java.util.ArrayList;
import java.util.Collections;
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
            employeeList.add(employee);
        }
        if (employee instanceof TopManager) {
            employee.setSalary();
            employeeList.add(employee);
        }
    }

    public void hireAll(List<Employee> employeeList) {
        employeeList.forEach(this::hire);
    }

    public void countCompanyIncome() {
        employeeList.stream().filter(employee -> employee instanceof Manager).forEach(employee -> {
            ((Manager) employee).setIncome();
            companyIncome += ((Manager) employee).getIncome();
        });
    }

    public void fire(int indexOfClerk) {
        employeeList.stream().filter(employee -> employee.getIndexOfClerk()==indexOfClerk).forEach(EmployeeService::setZeroSalary);
    }

    public int getCompanyIncome() {
        return this.companyIncome;
    }

    void printTopSalary(int count) {
        Collections.sort(this.employeeList);
        Collections.reverse(employeeList);
        System.out.println("Top month salary: ");
        for (int i = 0; i < count; i++) {
            System.out.println(employeeList.get(i));
        }
    }

    void printBottomSalary(int count) {
        Collections.sort(this.employeeList);
        System.out.println("Bottom month salary: ");
        for (int i = 0; i < count; i++) {
            if (employeeList.get(i).getMonthSalary() == 0) {
                count++;
            } else System.out.println(employeeList.get(i));
        }
    }

}

