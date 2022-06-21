package ProjetoFInal;

public class Universidade {

	public String unome;
	public String cidade;
	public String estado;
	
	 //construtor
    public Universidade(String nome, String cidade, String estado) {
        this.unome = nome;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getUNome() {
        return unome;
    }

    public void setUNome(String nome) {
        this.unome = nome;
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
