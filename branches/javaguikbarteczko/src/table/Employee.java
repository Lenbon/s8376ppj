package table;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Employee implements Serializable, Comparable<Employee> {

    private String name;
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    private Address address;
    private Date birthDate;
    private Integer salary;

    public Employee(String name, Address a, Date birthDate, Integer salary) {
        super();
        this.name = name;
        address = a;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public Employee() {
    }

    // gettery i setery, np:

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    // standardowe implementacje metod hashCode() i equals()
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    // Naturalny porządek
    public int compareTo(Employee o) {
        return 0;
    }

    public static List<Employee> generate(int i) {
        // TODO Auto-generated method stub
        return null;
    }

}
