package ProjetoFInal;

public class Aluno{

	//Atributos
    private int matricula;

    //M�todos Personalizados
    public void matricular(){
        System.out.println("Aluno(a): " +getNome()+ " Matriculado(a) com sucesso!");
    }
    
    //M�todos Especiais
    public Aluno(int matricula, String nome, String sexo, int idade, String cpf, int aingresso) {
        super(nome, sexo, idade, cpf, aingresso);
        this.matricula = matricula;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "------------------ \nALUNO(A): " + getNome() + "\nIDADE: "+ getIdade() + "\nSEXO: " + getSexo()+
                "\nN� DO CPF: " + getCpf()+ "\nN� DE MATR�CULA: " + getMatricula()+ "Ano Ingresso: "+ getAingresso() +"\n";
    }
}