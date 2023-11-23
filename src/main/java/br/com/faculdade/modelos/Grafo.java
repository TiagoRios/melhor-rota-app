package br.com.faculdade.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe faz realiza opera��es com o grafo criado
 * 
 * @author Tiago
 * @version 1.0
 */
public class Grafo {

	private List<Vertice> vertices = new ArrayList<Vertice>();
	private List<Aresta> arestas = new ArrayList<Aresta>();

	/**
	 * M�todo que adiciona v�rtices no grafo
	 * 
	 * @param novoVertice
	 */
	public void setVertice(Vertice novoVertice) {
		this.vertices.add(novoVertice);
	}

	/**
	 * M�todo Pega a lista de v�rtices
	 * 
	 * @return List<Vertice>
	 */
	public List<Vertice> getListaVertices() {
		return this.vertices;
	}

	/**
	 * Este m�todo percorre todas a lista de v�rtices. a procura do v�rtice (n�s)
	 * 
	 * @param nome
	 *            v�rtice que deseja procurar
	 * @return Vertice
	 */
	public Vertice encontrarVertice(String nome) {
		for (int i = 0; i < this.getListaVertices().size(); i++) {
			if (nome.equalsIgnoreCase(this.getListaVertices().get(i)
					.getDescricao())) {
				return this.getListaVertices().get(i);
			}
		}
		return null;
	}

	/**
	 *M�todo adiciona arestas dentro de uma lista
	 */
	public void setAresta() {
		for (int i = 0; i < this.getListaVertices().size(); i++) {
			for (int j = 0; j < this.getListaVertices().get(i).getArestas()
					.size(); j++) {
				this.arestas.add(this.getListaVertices().get(i).getArestas()
						.get(j));
			}
		}
	}
	
	/**
	 * M�todo que retorna uma aresta a partir dos v�rtices de origem e destino
	 * @param origem
	 * @param destino
	 * @return
	 */
	public Aresta encontrarAresta(Vertice origem, Vertice destino) {
		for (int i = 0; i < this.arestas.size(); i++) {
			if ((arestas.get(i).getOrigem() == origem)
					&& (arestas.get(i).getDestino() == destino))
				return arestas.get(i);
		}
		return null;
	}

}
