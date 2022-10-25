package NewoneInJava.src.CompanyStaff;

import lombok.Data;

@Data
public abstract class Employee {
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

    public void setSalary() {
    }

}
