package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// combnation of filter and map
// stream --> filter (20k) --> map

class Employee {
    int empId;
    String empName;
    int empSalary;

    
    public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
    }
    
}

public class MapDemo4 {
    public static void main(String[] args) {
            List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Kristei", 10000),
                new Employee(102, "Denny", 20000),
                new Employee(103, "Matt", 30000),
                new Employee(104, "Christie", 40000),
                new Employee(105, "Sarah", 50000)
            );
        
            List<Integer> employeeSalaryList = employeeList
                                                            .stream()
                                                            .filter(emp -> emp.getEmpSalary() > 25000)
                                                            .map(emp -> emp.getEmpSalary())
                                                            .collect(Collectors.toList());
            System.out.println(employeeSalaryList);
    }
}
