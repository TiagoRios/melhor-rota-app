package br.com.faculdade.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe modelo de V�rtice (n� do grafo). Esta classe implementa a interface
 * Comparable.
 * 
 * @author Tiago R.
 * @version 1.3
 * @see Comparable<E>
 */
public class Vertice implements Comparable<Vertice> {

	private String descricao;
	private int tempo;
	private Float CustoDistancia;
	private Float distancia;
	private boolean visitado = false;
	private Vertice pai; // N� de origem utilizado pelo Algoritmo
	private List<Aresta> arestas = new ArrayList<Aresta>();

	/**
	 * Contrutor da classe com 1 paramentro recebe o nome do n�
	 * 
	 * @param nome
	 */
	public Vertice(String nome) {
		this.descricao = nome;
	}

	/**
	 * M�todo que pega o nome do n�
	 * 
	 * @return String
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * M�todo que pega o tempo em minutos
	 * 
	 * @return int
	 */
	public int getTempo() {
		return tempo;
	}

	/**
	 * M�todo que modifica tempo em minutos
	 * 
	 * @param tempo
	 */
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	/**
	 * M�todo que pega o custo da Dist�ncia
	 * 
	 * @return Float
	 */
	public Float getCustoDistancia() {
		return CustoDistancia;
	}

	/**
	 * M�todo que modifica o custo da Dist�ncia
	 * 
	 * @param distancia
	 */
	public void setCustoDistancia(Float distancia) {
		this.CustoDistancia = distancia;
	}

	/**
	 * M�todo que pega a Dist�ncia
	 * @return Float
	 */
	public Float getDistancia() {
		return distancia;
	}

	/**
	 * M�todo que modifica a dist�ncia
	 * @param distancia
	 */
	public void setDistancia(Float distancia) {
		this.distancia = distancia;
	}
	/**
	 * M�todo verifica se foi visitado ou n�o o n�
	 * 
	 * @return boolean
	 */
	public boolean isVisitado() {
		return visitado;
	}

	/**
	 * M�todo modifica o estado de visitado false para true
	 */
	public void visitar() {
		this.visitado = true;
	}

	/**
	 * Pega o n� de origem
	 * 
	 * @return Vertice
	 */
	public Vertice getPai() {
		return pai;
	}

	/**
	 * M�todo que modifica o N� de origem.
	 * 
	 * @param pai
	 * 
	 */
	public void setPai(Vertice pai) {
		this.pai = pai;
	}

	/**
	 * M�todo usado para pegar a lista de aresta.
	 * 
	 * @return List<Aresta>
	 */
	public List<Aresta> getArestas() {
		return arestas;
	}

	/**
	 * M�todo que adiciona arestas na lista (caminhos).
	 * 
	 * @param aresta
	 */
	public void setArestas(Aresta aresta) {
		this.arestas.add(aresta);
	}

	/**
	 * Implementa��o do M�toda da interface comparable. Utlizada como crit�rio
	 * para ordenar a Lista com o M�tode sort da classe collections.
	 * 
	 */
	@Override
	public int compareTo(Vertice vertice) {
		if (this.getCustoDistancia() < vertice.getCustoDistancia()) {
			return -1;
		} else if (this.getCustoDistancia() == vertice.getCustoDistancia()) {
			return 0;
		}
		return 1;
	}
}
