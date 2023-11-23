package br.com.faculdade.servicos;

import java.util.List;

import br.com.faculdade.modelos.Vertice;

/**
 * Classe que imprime a rota de uma Lista preenchida
 * 
 * @author Tiago R.
 * @version 1.1
 */
public class ServicoImpressao {

	/**
	 * M�todo que imprime a rota
	 * 
	 * @param menorCaminho
	 */
	public String imprimirMelhorRota(List<Vertice> menorCaminho) {
		int i;
		String caminho = "Melhor rota = ";
		for (i = 0; i < menorCaminho.size(); i++) {
			if (i == menorCaminho.size() - 1) {
				caminho += menorCaminho.get(i).getDescricao();
			} else {
				caminho += menorCaminho.get(i).getDescricao() + " --> ";
			}
		}
		return caminho += "\nEsta rota possui : "
				+ menorCaminho.get(i - 1).getDistancia() + "KM" + "\nEsta rota � feita em : "
						+ menorCaminho.get(i - 1).getTempo() + " Minutos";
		 /*Custo de: "+ menorCaminho.get(i - 1).getCustoDistancia()*/
	}
		
		/*
		System.out.println("Esta rota possui : "
				+ menorCaminho.get(i - 1).getDistancia() + "KM");
		System.out.println("Esta rota � feita em : "
				+ menorCaminho.get(i - 1).getTempo() + " Minutos\n");
*/
	
	
	/* original
	public void imprimirMelhorRota(List<Vertice> menorCaminho) {
		int i;
		for (i = 0; i < menorCaminho.size(); i++) {
			if (i == menorCaminho.size() - 1) {
				System.out.println(menorCaminho.get(i).getDescricao());
			} else {
				System.out.print(menorCaminho.get(i).getDescricao() + " --> ");
			}
		}
		System.out.println("Esta rota possui : "
				+ menorCaminho.get(i - 1).getDistancia() + "KM");
		System.out.println("Esta rota � feita em : "
				+ menorCaminho.get(i - 1).getTempo() + " Minutos\n");

	}
	*/	
}
