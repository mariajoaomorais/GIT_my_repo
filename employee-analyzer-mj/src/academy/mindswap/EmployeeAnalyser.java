package academy.mindswap;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeAnalyser {

    //1.Count the number of employees that having been
    public static long countNumberOfEmployeesWorkingSince(int yearsInCompany, List<Employee> employeeList){
        return employeeList.stream()
                .filter(emp -> 2022 - emp.getEntryYear() > yearsInCompany)
                .count();
    }


    //2.Find the name of the employees that have a salary over n

    public static List <String> nameOfEmployeesWithSalaryAboveN (double salaryToCompare, List<Employee> employeeList){
        return employeeList.stream()
                .filter(emp -> emp.getSalary() > salaryToCompare)
                .map(Employee::getName)   //igual a .map (emp -> emp.getName())
                .collect(Collectors.toList()); // se o método fosse devolver uma String teriamos de fazer
                                                // .collect(Collectors.joinning("\n")
    }

    //3.Get the oldest n employees

    public static List<String> oldestEmployees(int age, List<Employee> employeeList){
        return employeeList.stream().filter(emp -> emp.getAge()>age)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    //4.Find the first employee older than n

    public static String firstOlderEmployee(int age, List<Employee> employeeList){
        return employeeList.stream().filter(emp -> emp.getAge() > age)
                .findFirst().map(emp -> emp.getName()).stream().collect(Collectors.joining());
    }

    //5.Find the average salary in a department

    public static double averageSalaryInDepartment (List<Employee> employeeList){
        return Math.floor(employeeList.stream()              //O Math.floor serve para arredondar o valor
                .map(emp -> emp.getSalary())
                .reduce(0.0, Double::sum)/employeeList.size());   //reduce(0.0, (acc, actual) -> (acc+actual))/employeeList.size());
    }

    //6.Finding common first names between the employees of two departments

    public static List<String> findFirstCommonNames (List<Employee> employeeList, List<Employee> employeeList2){
        return employeeList.stream()
                .filter(emp -> employeeList2.stream().map(emp1 -> emp1.getName().split(" ")[0])
                                .collect(Collectors.joining(" "))
                                .contains(emp.getName()
                                .split(" ")[0]))
                .map(emp1 -> emp1.getName().split(" ")[0]).collect(Collectors.toList());


    }




}
