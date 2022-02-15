package academy.mindswap;

public class Employee {

    private String name;
    private int age;
    private double salary;
    private int entryYear;



    public Employee(String name, int age, double salary, int year) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.entryYear = year;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", entryYear=" + entryYear +
                '}';
    }
}
