package academy.mindswap;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Employee> employeeList = Arrays.asList(new Employee("John Rock",23, 690.50, 2010),
                new Employee("John Mendes",23, 690.50, 2010), new Employee("Mary Lou",44, 990.50, 1998),
                new Employee("Louis Armstrong",78, 1600.50, 1995), new Employee("Zubaida Mikelina",55, 9690.50, 1990),
                new Employee("Quim Roscas",30, 590.50, 2022), new Employee("Ze Manel",34, 900.50, 2018),
                new Employee("Vivian Leigh",35, 1690.50, 2010), new Employee("Carlota Joaquina",44, 1000.50, 2010));

        List<Employee> employeeList2 = Arrays.asList(new Employee("Manelsvsky Vivichnko",23, 100690.50, 2010),
                new Employee("Jonhosvsky Putin",23, 100690.50, 2010), new Employee("Mary Kasparov",44, 100990.50, 1998),
                new Employee("Louisosvsky Karpov",78, 1001600.50, 1995), new Employee("Zubaidosvsky Lenin",55, 1009690.50, 1990),
                new Employee("Quim Romanov",30, 100590.50, 2022), new Employee("Ze Kateesperosvky",34, 100900.50, 2018),
                new Employee("Vivanosvsky Gugarin",35, 1001690.50, 2010), new Employee("Ivan Carlotosvsky",44, 1001000.50, 2010));

        /*
        System.out.println("Employees List - Departament 1:");
        employeeList.forEach(System.out::println);

        System.out.println("Employees List - Departament 2:");
        employeeList2.forEach(System.out::println);


         */
        System.out.println("-----------------\n1. Count the number of employees that having been\n" +
                "working at that department for more than n years");
        System.out.println(EmployeeAnalyser.countNumberOfEmployeesWorkingSince(10, employeeList));

        System.out.println("-----------------\n2.Find the name of the employees that have a salary over n: ");
        //System.out.println(EmployeeAnalyser.nameOfEmployeesWithSalaryAboveN(1000, employeeList));
        EmployeeAnalyser.nameOfEmployeesWithSalaryAboveN(1000, employeeList).forEach(System.out::println);

        System.out.println("-----------------\n3.Get the oldest n employees:");
        EmployeeAnalyser.oldestEmployees(40, employeeList).forEach(System.out::println);

        System.out.println("-----------------\n4.Find the first employee older than n:");
        System.out.println(EmployeeAnalyser.firstOlderEmployee(25, employeeList));

        System.out.println("-----------------\n5.Find the average salary in a department: ");
        System.out.println(EmployeeAnalyser.averageSalaryInDepartment(employeeList));

        System.out.println("-----------------\n6.Finding common first names between the employees of two departments");
        System.out.println(EmployeeAnalyser.findFirstCommonNames(employeeList, employeeList2));

    }
}
