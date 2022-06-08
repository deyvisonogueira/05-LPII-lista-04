# 05-LPII-lista-04
Escreva um programa para simular o RH de uma escola. Na escola há três tipos de Funcionários: Docentes, Técnicos e Terceirizados. Todos os funcionários possuem CPF, nome, endereço, data de admissão, titulação e salário base. Os Docentes e Técnicos possuem SIAPE. Os docentes ainda possuem a área a qual estão vinculados. Os Técnicos possuem o departamento onde trabalham. Os terceirizados possuem uma data de fim de contrato e a função que irá exercer quando foram contratados. A classe funcionário, além do construtor e métodos set e get, deve possuir um método calculaSalario. O método calculaSalario da classe funcionário retorna apenas o salário base. As classes Docente e Técnicos devem sobreescrever o método calculaSalario para realizar um cálculo específico sobre do salário do funcionário. Para a classe Docente, o salário é o salário base mais (+) 20% do salário base caso o docente seja ‘Mestre’ ou 40% do salário base caso o docente seja ‘Doutor’. Para a classe Técnico, o salário é o salário base mais (+) 15% do salário base caso o docente seja ‘Mestre’ ou 30% do salário base caso o docente seja ‘Doutor’. Terceiros tem um bônus, somado ao salário base, de R$500 caso seja professor (sua função) ‘Mestre’ ou R$1000 caso seja ‘Doutor’. Terceiros que não sejam professores não tem bônus. 

O programa deve dar as seguintes opções ao usuário: 
*1.Cadastrar um novo funcionário (Docente, Técnico ou Terceiro); 
*2.Pesquisar por um funcionário e retornar todos os seus dados; 
*3.Listar todos os funcionário com todos os seus dados; 

Observações: Deve haver uma classe para guardar os funcionários cadastrados, pode chamar essa classe de RH. Faça uma classe para exibir o menu e as saídas do programa. Faça uma classe para controlar o fluxo de execução do programa.
