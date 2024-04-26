package SistemaDeGestao;

public class Company {
    public static void main(String[] args) {
       RegularEmployee employee = new RegularEmployee("Gabriel",20,1440.60,30,1,"Julião","Clt","estagiario");
       RegularEmployee employee2 = new RegularEmployee("Henrique",22,3079.58,44,5,"Jess","PJ","Enhenheiro Junior");

       Manager manager = new Manager("Jess",28,8887.58,40,5,"Desenvolvimento");
       Manager manager2 = new Manager("Julião",26,5860.58,40,1,"Desenvolvimento");

       Director director = new Director("José",32,10.858,40,20,"Negocios");
       Director director2 = new Director("Aline",39,10.858,40,45,"RH");


        // Mostrando os funcionários
        System.out.println("Detalhes dos Funcionários:");
        System.out.println("--------------------------");

        System.out.println("Funcionário Regular 1:");
        System.out.println(employee);
        System.out.println();

        System.out.println("Funcionário Regular 2:");
        System.out.println(employee2);
        System.out.println();

        System.out.println("Gerente 1:");
        System.out.println(manager);
        System.out.println();

        System.out.println("Gerente 2:");
        System.out.println(manager2);
        System.out.println();

        System.out.println("Diretor 1:");
        System.out.println(director);
        System.out.println();

        System.out.println("Diretor 2:");
        System.out.println(director2);

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Cauculo de salario de dos funcionarios regulares:");
        employee.calSalary();
        employee2.calSalary();
        System.out.println();

        System.out.println("Cauculo de salario de dos gerentes:");
        manager.calSalary();
        manager2.calSalary();
        System.out.println();

        System.out.println("Cauculo de salario de dos diretores:");
        director.calSalary();
        director2.calSalary();
        System.out.println();

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Troca de contrato:");
        manager.changeContract(employee2,"Clt");
        employee2.calSalary();
        System.out.println();

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Função de promover funcionario:");
        director2.promoteEmployee(employee2);
        System.out.println(employee2);
        System.out.println();






    }
}
