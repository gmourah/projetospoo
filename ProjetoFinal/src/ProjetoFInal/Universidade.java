package ProjetoFInal;

public class Universidade {

	public String nome;
	public String endere�o;
	
	 //M�todos Especiais
    public Universidade(String nome, String endere�o) {
        this.nome = nome;
        this.endere�o = endere�o;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndere�o() {
        return endere�o;
    }

    public void setEndere�o(String endere�o) {
        this.endere�o = endere�o;
    }
    
}