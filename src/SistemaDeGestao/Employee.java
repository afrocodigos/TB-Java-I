package SistemaDeGestao;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private int timeWork;
    private int timeInCompany;

    public Employee(String name, int age, double salary, int timeWork, int timeInCompany) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.timeWork = timeWork;
        this.timeInCompany = timeInCompany;
    }

    public void calSalary(){
        System.out.println("Esse e o Salario base= R$" + getSalary());
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }

    public int getTimeInCompany() {
        return timeInCompany;
    }

    public void setTimeInCompany(int timeInCompany) {
        this.timeInCompany = timeInCompany;
    }

}
