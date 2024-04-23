package SistemaDeGestao;


import java.util.Objects;

public class Manager extends Employee {

    private String sector;
    double bonus= 600;

    public Manager(String name, int age, double salary, int timeWork, int timeInCompany, String sector) {
        super(name, age, salary, timeWork, timeInCompany);

        this.sector = sector;
    }

    @Override
    public void calSalary(){
        double calFinal;
        if (getTimeInCompany() >= 2){
            calFinal= getSalary() + bonus;
            System.out.println("O salario deste gerente e de R$" + calFinal );
        }else{super.calSalary();}

    }
    public void changeContract(RegularEmployee employee, String contract){
        if(Objects.equals(employee.getContractType(), contract)){
            System.out.println("Esse já e o contrato do trabalhador");
        }else {
            employee.setContractType(contract);
            System.out.println("O contrato do trabalhador foi alterado para: " + contract);
        }

    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String toString() {
        return "RegularEmployee{" +
                "nome='" + getName() + '\'' +
                ", idade=" + getAge() +
                ", salario=" + getSalary() +
                ", horasSemanais=" + getTimeWork() +
                ", setor='" + getSector() + '\'' +
                ", Tempo de compania='" + getTimeInCompany() + '\'' +
                '}';
    }


}
