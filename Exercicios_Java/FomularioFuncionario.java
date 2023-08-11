//Esse código cria um objeto da classe Funcionario, define os atributos ao mesmo 
//e imprime as informações na saída do console.

package exercicios;

class Funcionario {
    String nome;
    String email;
    String CPF;
}
public class Exercicios {
    public static void main(String[] args) {
            
        Funcionario func1;
        func1 = new Funcionario();
        func1.nome = "Matheus";
        func1.email = "Mth@gmail.com";
        func1.CPF = "123456";
        
        System.out.println("Nome: " + func1.nome);
        System.out.println("Email: " + func1.email);
        System.out.println("CPF: " + func1.CPF);
       
    }
    
}
