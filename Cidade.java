package pxt.api.estoqueprodutos;

public class Cidade {
	private String cidadesOndeEntrega;
	private String nomeCidades;
	private double freteCidades;
	
	
	public String getCidadesOndeEntrega() {
		return cidadesOndeEntrega;
	}
	public void setCidadesOndeEntrega(String cidadesOndeSeEntrega) {
		cidadesOndeEntrega = cidadesOndeSeEntrega;
	}
	public String getNomeCidades() {
		return nomeCidades;
	}
	public void setNomeCidades(String nomeDeCidades) {
		nomeCidades = nomeDeCidades;
	}
	public double getFreteCidades() {
		return freteCidades;
	}
	public void setFreteCidades(double freteDasCidades) {
		freteCidades = freteDasCidades;
	}
	@Override
	public String toString() {
		return nomeCidades;
	}
}