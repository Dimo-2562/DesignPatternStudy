package creation.prototypepattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Team implements Cloneable {
    String teamName;
    List<Employee> employees;

    public Team(String teamName) {
        this.teamName = teamName;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Team that = (Team) obj;
        return Objects.equals(teamName, that.teamName) && Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName, employees);
    }
}
