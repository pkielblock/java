package entities.services;

import entities.Employee;

import java.util.List;
import java.util.function.Predicate;

public class EmployeeService {
    public double filteredSum(List<Employee> list, Predicate<Employee> criteria) {
        double sum = 0.0;
        for (Employee p : list) {
            if (criteria.test(p)) {
                sum += p.getSalary();
            }
        }
        return sum;
    }
}
