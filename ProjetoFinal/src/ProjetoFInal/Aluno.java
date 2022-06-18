package ProjetoFInal;

public class Aluno {
	private String matricula;
	public String nome; 
	public String sexo; 
	public String idade;
	public int aingresso;
	public String cidade;
	public String estado;
	
	public Aluno(String m, String n, String s, String idd, int a, String ci, String es ) {
	this.matricula = m;	
	this.nome = n;
	this.sexo = s;
	this.idade = idd;
	this.aingresso = a;
	this.cidade = ci;
	this.estado = es;
	}
	
	   //metodos especiais 
    public void alunoStatus(){
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
        
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
	
	}

		

	