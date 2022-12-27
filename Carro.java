package pxt.api.estoqueprodutos;

public class Carro {

    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;

    public Carro(String nome){
        this.nome = nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false ;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getLigado() {
		return ligado;
	}

	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}

	public Boolean getDestruido() {
		return destruido;
	}

	public void setDestruido(Boolean destruido) {
		this.destruido = destruido;
	}

	public int getBlindagem() {
		return blindagem;
	}

	public void setBlindagem(int blindagem) {
		this.blindagem = blindagem;
	}

	public Boolean getArmamento() {
		return armamento;
	}

	public void setArmamento(Boolean armamento) {
		this.armamento = armamento;
	}
	
}
