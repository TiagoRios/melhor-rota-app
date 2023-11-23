package br.com.faculdade.modelos;

/**
 * Esta classe define as aresta. As arestas s�o as liga��es. Ex: ponto A --> B possui X dist�ncia e Y tempo
 * 
 * @author Tiago
 * @version 1.2
 */
public class Aresta { 

	private Vertice origem;
	private Vertice destino;
	private int minuto;
	private float distancia;
	private float distanciaDireta;

	/**
	 * Construtor da classe Aresta 
	 * @param origem inicia o valor de origem
	 * @param destino inicia o valor de destino
	 * @param distancia incia a dist�ncia em Km
	 * @param minuto inicia o tempo em minutos
	 */
	public Aresta(Vertice origem, Vertice destino, float distancia, int minuto, float distanciaDireta){
		this.origem = origem;
		this.destino = destino;
		this.distancia = distancia;
		this.minuto = minuto;
		this.distanciaDireta = distanciaDireta;
	}
	
	/**
	 * Este m�todo � utilizado para pegar o valor de origem 
	 * @return Vertice
	 */
	public Vertice getOrigem() {
		return origem;
	}

	/**
	 * Este m�todo � utilizado para pegar o valor de destino
	 * @return Vertice
	 */
	public Vertice getDestino() {
		return destino;
	}
	
	/**
	 * Este m�todo � utilizado para pegar o valor em minutos
	 * @return int
	 */
	public int getMinuto() {
		return minuto;
	}
	
	/**
	 * Este m�todo � utilizado para pegar a dist�ncia em Km
	 * @return float
	 */
	public float getDistancia() {
		return distancia;
	}

	/**
	 * Este m�todo � utilizado para pegar a dist�ncia direta em Km
	 * @return float
	 */
	public float getDistanciaDireta(){
		return distanciaDireta;
	}
}
