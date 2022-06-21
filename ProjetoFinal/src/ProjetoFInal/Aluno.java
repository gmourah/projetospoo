package ProjetoFInal;

public class Aluno {
	private int matricula;
	public String nome; 
	public char sexo; 
	public int idade;
	public int aingresso;
	public String cidade;
	public String estado;
        public Curso curso;
	
	public Aluno(int m, String n, char s, int idd, int a, String ci, String es, Curso curso ) {
	this.matricula = m;	
	this.nome = n;
	this.sexo = s;
	this.idade = idd;
	this.aingresso = a;
	this.cidade = ci;
	this.estado = es;
        this.curso = curso;
	}
	
	   //metodos especiais 

        public void matricular(){
        System.out.println("Aluno(a): "+getNome()+ " Matriculado(a) com sucesso!");
        }
        
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int m) {
		this.matricula = m;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public char getSexo() {
		return this.sexo;
	}
	public void setSexo(char s) {
		this.sexo = s;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idd) {
		this.idade = idd;
	}
	public String getCidade() {
		return this.cidade;
	}
	public void setCidade(String ci) {
		this.cidade = ci;
	 }
	public String getEstado() {
		return this.estado;
	}
	public void setEstado(String es) {
		this.estado = es;
	 }
	public int getAingresso(){
                return this.aingresso;
        }
        
        public void setAingresso(int a){
                this.aingresso = a;
        }
        
        public Curso getCurso(){
            return this.curso;
        }
        
        public void setCurso(Curso curso){
            this.curso = curso;
        }
        
        @Override
        public String toString() {
        return "------------------ \nALUNO(A): " + getNome() + "\nMATRICULA: "+ getMatricula() + "\nIDADE: "+ getIdade() + "\nSEXO: " + getSexo()+
                "\nANO-INGRESSO: " + getAingresso() + "\nESTADO: " + getEstado()+"\nCIDADE: " + getCidade() +"\n" + getCurso();
    }
        
	}