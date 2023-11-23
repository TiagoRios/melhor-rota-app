package br.com.faculdade.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.faculdade.modelos.Grafo;
import br.com.faculdade.modelos.ModeloGrafo;
import br.com.faculdade.modelos.Vertice;
import br.com.faculdade.servicos.*;

public class TestMelhorRota {

	public static void main(String[] args) {

		Grafo grafo = ModeloGrafo.criarGrafoCidades();
		List<Vertice> menorRota = new ArrayList<Vertice>();
		CalcularRotaGrafo algoritmoDijkstra = new CalcularRotaGrafo();
		ServicoImpressao i = new ServicoImpressao();

		menorRota = algoritmoDijkstra.MelhorRotaPorKm(grafo, "sudoeste", "taguatinga");
		i.imprimirMelhorRota(menorRota);

		System.out.println("alguma coisa");
	}
}
