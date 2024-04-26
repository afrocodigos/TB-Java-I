package SistemaDeGestao;

import java.util.Objects;

public class RegularEmployee extends Employee {

    private String contractType;
    private String manager;
    private String cargo;

    public RegularEmployee(String name, int age, double salary, int timeWork, int timeInCompany, String manager, String contractType, String cargo) {
        super(name, age, salary, timeWork, timeInCompany);
        this.manager = manager;
        this.contractType = contractType;
        this.cargo = cargo;
    }

    @Override
    public void calSalary(){
        int salaryTime= 150;

        if (Objects.equals(getContractType(), "Clt")){
               System.out.println("O salario do funcionario e de R$" + getSalary());}

        if(Objects.equals(getContractType(), "PJ")){
                System.out.println("O salario desse contrinuidor e de R$" + getTimeWork() * salaryTime );}

    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String toString() {
        return "RegularEmployee{" +
                "nome='" + getName() + '\'' +
                ", idade= " + getAge() +
                ", salario= " + getSalary() +
                ", horas Semanais= " + getTimeWork() +
                ", tempo de compania= " + getTimeInCompany() +
                ", supervisor=' " + getManager() + '\'' +
                ", tipoContrato=' " + getContractType() + '\'' +
                ", Cargo='" + getCargo() + '\'' +
                '}';
    }
}
