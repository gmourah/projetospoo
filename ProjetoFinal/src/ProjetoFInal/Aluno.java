package ProjetoFInal;

public class Aluno {
	private String matricula;
	public String nome; 
	public String sexo; 
	public String idade;
	public int aingresso;
	
	public Aluno(String m, String n, String s, String idd, int a ) {
	this.matricula = m;	
	this.nome = n;
	this.sexo = s;
	this.idade = idd;
	this.aingresso = a;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	public void setMatricula(String m) {
		this.matricula = m;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String s) {
		this.sexo = s;
	}
	public String getIdade() {
		return this.idade;
	}
	public void setIdade(String idd) {
		this.idade = idd;
	}
	public int getAingresso() {
		return this.aingresso;
	}
	public void setAingresso(int a) {
		this.aingresso = a;
	}
	
	}
	