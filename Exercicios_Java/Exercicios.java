package exercicios;
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
