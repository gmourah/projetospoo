package ProjetoFInal;

public class Universidade {

	public String nome;
	public String cidade;
	public String estado;
	
	 //Métodos Especiais
    public Universidade(String nome, String cidade, String estado) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String c) {
        this.cidade = c;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String e) {
        this.estado = e;
    }
    
}