package application;

import entities.Employee;
import entities.services.EmployeeService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Comparator<String> stringComparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

        System.out.print("File Path: ");
        String path = scanner.nextLine();

        System.out.print("Enter Salary: ");
        Double salaryFilter = scanner.nextDouble();

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bufferedReader.readLine();
            }

            List<String> filteredEmails = employees.stream().filter(x -> x.getSalary() > salaryFilter).map(Employee::getEmail).sorted(stringComparator).toList();
            System.out.println("Email of people whose salary is more than " + salaryFilter);
            filteredEmails.forEach(System.out::println);

            EmployeeService employeeService = new EmployeeService();
            double sum = employeeService.filteredSum(employees, x -> x.getName().charAt(0) == 'M');
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}