package ProjetoFInal;

public class Curso extends Universidade {
	public String cnome;
	private int ID;

	 //construtor
    public Curso(String cnome, int ID, String unome, String cidade, String estado) {
        super(unome, cidade, estado);
        this.cnome = cnome;
        this.ID = ID;
    }

    public String getCNome() {
        return cnome;
    }

    public void setCNome(String nome) {
        this.cnome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    @Override
        public String toString() {
        return "\nUNIVERSIDADE: " + getUNome() + "\nCURSO:" + getCNome() + "\nID: " + getID() + "\nESTADO: " + getEstado()+ "\nCIDADE: " + getCidade();
    }
    
}