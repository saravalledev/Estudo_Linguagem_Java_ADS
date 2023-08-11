//Esse código define uma estrutura básica para representar um aluno com informações como nome, 
//código de matrícula (cdm), CPF, sexo e três notas (n1, n2, n3). O construtor permite criar
//um objeto Aluno com essas informações específicas.

package Exercicio1;
public class Aluno {
    
    public String nome;
    public int cdm;
    public String cpf;
    public char sexo;
    public float n1;
    public float n2;
    public float n3;
    
    public Aluno(String nome, int cdm, String cpf, char sexo, float n1, float n2, float n3){
        
        this.nome = nome;
        this.cdm = cdm;
        this.cpf = cpf;
        this.sexo = sexo;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        
                
    }
}
