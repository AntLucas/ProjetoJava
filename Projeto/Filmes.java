package Projeto;
import java.util.Scanner;
public class Filmes extends Midia implements Menus{
	Scanner ler = new Scanner(System.in);
	
	private String duracao;

	public Filmes(String titulo, String genero, String autor, String sinopse, float nota, int ano, String duracao) {
		super(titulo, genero, autor, sinopse, nota, ano);
		this.duracao = duracao;
	}
	
	@Override
	public int menuIni() {
		int decisao;
		System.out.println("\tFilmes");
		
		do {
		System.out.println("\nDigite o n�mero de acordo com o que voc� deseja fazer"
				+ ":\n1-Escolhe g�nero\n2-Voltar");
		decisao = ler.nextInt();
		
		if(decisao == 2) {
			System.out.println("Retornou");
			return decisao;
		}
		else if(decisao != 1 && decisao !=2) {
			System.out.println("N�mero digitado incorreto!");
		}
		
		} while(decisao != 1 && decisao !=2);
		return decisao;
	}
	
}
