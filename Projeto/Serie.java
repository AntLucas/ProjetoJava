package Projeto;

public class Serie extends Midia{
	private int temporada;
	private int episodio;
	private float duracaoMedia;
	
	public Serie(String titulo, String genero, String autor, String sinopse, float nota, int ano, int temporada,
			int episodio, float duracaoMedia) {
		super(titulo, genero, autor, sinopse, nota, ano);
		this.temporada = temporada;
		this.episodio = episodio;
		this.duracaoMedia = duracaoMedia;
	}
	
	
	
	
	
}