package SistemaDeGestao;


import java.util.Objects;

public class Director extends Employee {

    private String department;
    double profitSharing = 900;


    public Director(String name, int age, double salary, int timeWork, int timeInCompany, String department) {
        super(name, age, salary, timeWork, timeInCompany);
        this.department = department;
    }

    @Override
    public void calSalary(){
        double calFinal;
        if (getAge() >= 35){
            calFinal= super.getSalary() + profitSharing;
            System.out.println("O salario deste gerente e de R$" + calFinal );
        }else{super.calSalary();}

    }

    public void promoteEmployee(RegularEmployee employee){
        if (employee.getTimeInCompany() >= 5){
            employee.setCargo("Gestor");
            employee.setSalary(5860.58);
            employee.setTimeWork(40);
            System.out.println("Esse usuario está promovido, ele contribuiu por " + employee.getTimeInCompany() + " anos");
            System.out.println("Foi promovido a "+ employee.getCargo());
        }
    }

    public String getDepartment() {
        return department;}

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "RegularEmployee{" +
                "nome='" + getName() + '\'' +
                ", idade=" + getAge() +
                ", salario=" + getSalary() +
                ", Horas Semanais=" + getTimeWork() +
                ", Departamento='" + getDepartment() + '\'' +
                ", Tempo de compania='" + getTimeInCompany() + '\'' +
                '}';
    }


}
