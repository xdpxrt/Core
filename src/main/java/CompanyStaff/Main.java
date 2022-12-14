package CompanyStaff;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company bigCompany = new Company();

        List<Employee> operatorList = new ArrayList<>();
        List<Employee> managerList = new ArrayList<>();
        List<Employee> topManagerList = new ArrayList<>();

        for (int i = 0; i < 270; i++) {
            if (i < 180) {
                operatorList.add(new Operator(i));
            }
            if (i >= 180 && i < 260) {
                managerList.add(new Manager(i));
            }
            if (i >= 260) {
                topManagerList.add(new TopManager(i, bigCompany));
            }
        }
        bigCompany.hireAll(operatorList);
        bigCompany.hireAll(managerList);
        bigCompany.hireAll(topManagerList);
        bigCompany.countCompanyIncome();
        System.out.println(bigCompany.getCompanyIncome());
        bigCompany.fire(2);
        System.out.println(operatorList);
        bigCompany.printTopSalary(10);
        bigCompany.printBottomSalary(10);

    }
}
