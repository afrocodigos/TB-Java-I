package funcionario;
// Old - Teste
//public class TesteEncapsulamento {

//	public static void main(String[] args) {
		
//		// Criando instâncias de diferentes tipos de funcionários
//        FuncionarioRegular funcionarioRegular = new FuncionarioRegular("João", 30, 3000);
//        Gerente gerente = new Gerente("Maria", 35, 5000, 1000);
//        Diretor diretor = new Diretor("Carlos", 45, 10000, 2000);

        // Chamando o método calcularSalario() para cada funcionário
//        System.out.println("Salário do Funcionário Regular: " + (funcionarioRegular).calcularSalario());
//       System.out.println("Salário do Gerente: " + gerente.calcularSalario());
 //       System.out.println("Salário do Diretor: " + diretor.calcularSalario());

//	}

//}

public class TesteEncapsulamento {
    public static void main(String[] args) {
        // Criando uma instância de Funcionario
        Funcionario funcionario = new Funcionario("João", 30, 3000);
        
        // Tentando acessar diretamente os atributos privados da classe Funcionario
        // Isso deve resultar em erros de compilação
        // funcionario.nome = "Novo Nome"; // Erro: nome has private access in Funcionario
        // funcionario.idade = 35; // Erro: idade has private access in Funcionario
        // funcionario.salario = 3500; // Erro: salario has private access in Funcionario

        // Criando uma instância de Gerente
        Gerente gerente = new Gerente("Maria", 35, 5000, 1000);
        
        // Tentando acessar diretamente os atributos privados da classe Gerente
        // Isso deve resultar em erros de compilação
        // gerente.nome = "Novo Nome"; // Erro: nome has private access in Funcionario
        // gerente.idade = 40; // Erro: idade has private access in Funcionario
        // gerente.salario = 5500; // Erro: salario has private access in Funcionario
        // gerente.nivel = 2; // Erro: nivel has private access in Gerente

        // Criando uma instância de Diretor
        Diretor diretor = new Diretor("Carlos", 45, 10000, 2000);
        
        // Tentando acessar diretamente os atributos privados da classe Diretor
        // Isso deve resultar em erros de compilação
        // diretor.nome = "Novo Nome"; // Erro: nome has private access in Funcionario
        // diretor.idade = 50; // Erro: idade has private access in Funcionario
        // diretor.salario = 10500; // Erro: salario has private access in Funcionario
        // diretor.participacaoLucros = 2500; // Erro: participacaoLucros has private access in Diretor
    }
}

