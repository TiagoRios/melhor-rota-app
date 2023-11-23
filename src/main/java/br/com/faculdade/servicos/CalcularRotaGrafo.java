package br.com.faculdade.servicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.faculdade.modelos.Grafo;
import br.com.faculdade.modelos.Vertice;

/**
 * Esta Classe possui o algoritmo para calcular o caminho de custo m�nimo do
 * Dijkstra.
 * 
 * @author Tiago R.
 * @version 1.5
 */
public class CalcularRotaGrafo {

	List<Vertice> menorCaminho = new ArrayList<Vertice>();
	Vertice caminho = new Vertice("caminho");
	Vertice atual = new Vertice("atual");
	Vertice vizinho = new Vertice("vizinho");
	List<Vertice> naoVisitados = new ArrayList<Vertice>();

	/*
	 * Este M�todo calcula a rota que possui menor tempo em minutos
	 * 
	 * @param grafo
	 * 
	 * @param origem
	 * 
	 * @param destino
	 * 
	 * @return List<Vertice>
	 */
	/*
	 * public List<Vertice> MelhorRotaPorTempo(Grafo grafo, String origem,
	 * String destino) {
	 * 
	 * Vertice v1 = grafo.encontrarVertice(origem.toLowerCase()); Vertice v2 =
	 * grafo.encontrarVertice(destino.toLowerCase()); menorCaminho.add(v1);
	 * 
	 * /** coloca o tempo inicial da oriem em 0 zero e as demais com um valor
	 * bem alto 9999 (infinito)
	 */
	/*
	 * for (int i = 0; i < grafo.getListaVertices().size(); i++) { if
	 * (grafo.getListaVertices().get(i).getDescricao()
	 * .equals(v1.getDescricao())) grafo.getListaVertices().get(i).setTempo(0);
	 * else grafo.getListaVertices().get(i).setTempo(9999);
	 * this.naoVisitados.add(grafo.getListaVertices().get(i)); }
	 * Collections.sort(naoVisitados);
	 * 
	 * // para quando tiver vazio // o algoritmo continua ate que o vertice seja
	 * visitado while (!this.naoVisitados.isEmpty()) { // toma-se sempre o
	 * vertice com menor distancia que eh o primeiro da // lista atual =
	 * this.naoVisitados.get(0); // para cada vizinho (cada aresta), calcula-se
	 * a sua possivel // distancia do // vertice atual com o da aresta
	 * correspondente. se essa distancia // for menor // que a distancia do
	 * vizinho, esta � atualizada. for (int i = 0; i <
	 * atual.getArestas().size(); i++) { vizinho =
	 * atual.getArestas().get(i).getDestino(); if (!vizinho.isVisitado()) { //
	 * calculando a distancia em minutos int tempo = atual.getTempo() +
	 * atual.getArestas().get(i).getMinuto(); float distancia =
	 * atual.getDistancia() + atual.getArestas().get(i).getDistancia(); //
	 * comparando o tempo do vizinho com a possivel distancia if
	 * (vizinho.getTempo() > tempo) { vizinho.setTempo(tempo); // linha para ir
	 * incrementando a distancia tbm vizinho.setDistancia(distancia);
	 * vizinho.setPai(atual); if (vizinho == v2) { menorCaminho.clear(); caminho
	 * = vizinho; menorCaminho.add(vizinho); while (caminho.getPai() != null) {
	 * menorCaminho.add(caminho.getPai()); caminho = caminho.getPai(); }
	 * Collections.sort(menorCaminho); } } } } atual.visitar();
	 * this.naoVisitados.remove(atual); Collections.sort(naoVisitados); } return
	 * menorCaminho; }
	 */

	/**
	 * M�todo que faz o calculo da melhor rota seguindo o cr�terio de KM
	 * 
	 * @param grafo
	 *                contem os v�rtices com suas arestas
	 * @param origem
	 *                n� de origem
	 * @param destino
	 *                n� de destino
	 * @return List<Cidade>
	 */
	public List<Vertice> MelhorRotaPorKm(Grafo grafo, String origem,
			String destino) {

		Vertice v1 = grafo.encontrarVertice(origem.toLowerCase());
		Vertice v2 = grafo.encontrarVertice(destino.toLowerCase());
		menorCaminho.add(v1);

		// coloca a dist�ncia inicial da origem em 0 zero e as demais com um
		// valor bem alto 9999 (ou infinito).
		for (int i = 0; i < grafo.getListaVertices().size(); i++) {
			if (grafo.getListaVertices().get(i).getDescricao()
					.equals(v1.getDescricao())) {
				grafo.getListaVertices().get(i).setCustoDistancia(0.0f);
				grafo.getListaVertices().get(i).setDistancia(0.0f);
			} else
				grafo.getListaVertices().get(i).setCustoDistancia(9999.9f);
			this.naoVisitados.add(grafo.getListaVertices().get(i));
		}
		Collections.sort(naoVisitados);

		// para quando tiver vazio
		// o algoritmo continua ate que o vertice seja visitado
		while (!this.naoVisitados.isEmpty()) {
			// toma-se sempre o vertice com menor distancia que eh o primeiro da
			// lista
			atual = this.naoVisitados.get(0);
			// para cada vizinho (cada aresta), calcula-se a sua possivel
			// dist�ncia do v�rtice atual com o da aresta correspondente. se
			// essa dist�ncia for menor que a dist�ncia do vizinho, esta �
			// atualizada.
			for (int i = 0; i < atual.getArestas().size(); i++) {
				vizinho = atual.getArestas().get(i).getDestino();
				if (!vizinho.isVisitado()) {
					// calculando a dist�ncia em Km
					float distanciaAtual = atual.getDistancia() + atual.getArestas().get(i).getDistancia();

					// calculando o custo da melhor rota somando a Distancia +
					// distanciaDireta;
					float custoDistanciaAtual = atual.getCustoDistancia()
							+ atual.getArestas().get(i).getDistancia()
							+ atual.getArestas().get(i).getDistanciaDireta();

					// calculando o Tempo em minutos
					int tempoAtual = atual.getTempo()
							+ atual.getArestas().get(i).getMinuto();
					// comparando a dist�ncia do vizinho com a possivel
					// dist�ncia
					if (vizinho.getCustoDistancia() > custoDistanciaAtual) {
						vizinho.setCustoDistancia(custoDistanciaAtual);
						vizinho.setDistancia(distanciaAtual);
						vizinho.setTempo(tempoAtual);
						vizinho.setPai(atual);
						if (vizinho == v2) {
							menorCaminho.clear();
							caminho = vizinho;
							menorCaminho.add(vizinho);
							while (caminho.getPai() != null) {
								menorCaminho.add(caminho.getPai());
								caminho = caminho.getPai();
							}
							Collections.sort(menorCaminho);
						}
					}
				}
			}
			atual.visitar();
			this.naoVisitados.remove(atual);
			Collections.sort(naoVisitados);
		}
		return menorCaminho;
	}
}
