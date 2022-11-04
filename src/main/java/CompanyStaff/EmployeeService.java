package CompanyStaff;

interface EmployeeService extends Comparable<Employee> {
    int getMonthSalary();

    void setZeroSalary();

    void setSalary();

    default int compareTo(Employee employee) {
        return Integer.compare(getMonthSalary(), employee.getMonthSalary());
    }




}


