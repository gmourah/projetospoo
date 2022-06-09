package ProjetoFInal;

public class Aluno{

	//Atributos
    private int matricula;

    //Métodos Personalizados
    public void matricular(){
        System.out.println("Aluno(a): " +getNome()+ " Matriculado(a) com sucesso!");
    }
    
    //Métodos Especiais
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
                "\nNº DO CPF: " + getCpf()+ "\nNº DE MATRÍCULA: " + getMatricula()+ "Ano Ingresso: "+ getAingresso() +"\n";
    }
}