package Collections;

import java.util.Date;

public class Employee implements Comparable<Employee>{
    String firstName;
    String lastName;
    Date joinDate;

    public Employee(String firstName, String lastName, Date joinDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        int compareValue = this.firstName.compareTo(emp.firstName);
        /*if (compareValue == 0){
            return this.lastName.compareTo(emp.lastName);
        }*/
        return compareValue;
    }
}
