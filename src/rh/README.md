# Sistema de Gestão de Funcionários


Imagine que você está desenvolvendo um sistema de gestão de funcionários para uma empresa. Neste sistema, os funcionários podem ser de diferentes tipos, como funcionários regulares, gerentes e diretores. Cada tipo de funcionário possui informações específicas e comportamentos distintos.

- Crie uma classe Funcionario que represente um funcionário genérico. Esta classe deve conter atributos como nome, idade, salário e métodos para acesso e modificação desses atributos;
- Implemente herança para os diferentes tipos de funcionários: FuncionarioRegular, Gerente e Diretor. Cada uma dessas classes deve herdar da classe Funcionario e adicionar atributos e métodos específicos de acordo com o cargo;- Encapsule os atributos: Garanta que os atributos da classe Funcionario e suas subclasses sejam encapsulados, ou seja, acessados apenas por métodos da própria classe;
- Utilize o polimorfismo: Crie um método na classe Funcionario chamado calcularSalario que calcule o salário do funcionário com base em seu cargo específico. Esse método deve ser sobrescrito nas subclasses FuncionarioRegular, Gerente e Diretor, implementando a lógica de cálculo de salário de acordo com as regras de cada cargo;- Crie um programa principal: No método main, crie instâncias de diferentes tipos de funcionários e demonstre o polimorfismo chamando o método calcularSalario para cada funcionário, mostrando o salário calculado corretamente de acordo com o cargo de cada um.Observações:
Você pode adicionar outros atributos e métodos às classes se achar necessário para tornar o sistema mais completo.
Pense em cenários adicionais para enriquecer o exercício: e se os funcionários pudessesm ser promovidos, se houvesse um cálculo de bônus?
Lembre-se: escrever um software é como escrever uma boa história. Mantenha os nomes mais claros possíveis, use reutilize código quando necessário e aplique boas práticas de programação