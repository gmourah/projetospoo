package ProjetoFInal;

public class ProjetoFinal {

    public static void main(String[] args){
        
        Curso curso = new Curso(" Sistemas de Informacao", 1, "UFC", "Quixada", "CE");
        
        Aluno aluno = new Aluno(511520, "Jose Matheus Carlos Gustavo", 'M', 18, 2021, "Quixeramobim", "CE", curso);
        
        
        
        System.out.println(aluno);
        
    }  

}
