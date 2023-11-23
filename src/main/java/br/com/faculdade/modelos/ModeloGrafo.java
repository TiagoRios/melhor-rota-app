package br.com.faculdade.modelos;

/**
 * Classe que possui o Grafo modelo com os valores pr�-definidos
 * 
 * @author Tiago R.
 * @version 1.3
 */
public class ModeloGrafo {

	/**
	 * M�todo da classe que cria e inicializa o grafo
	 * 
	 * @return modeloGrafo
	 */
	public static Grafo criarGrafoCidades() {

		Grafo modeloGrafoCidade = new Grafo();

		Vertice s = new Vertice("sudoeste");
		modeloGrafoCidade.setVertice(s);
		Vertice g = new Vertice("guara");
		modeloGrafoCidade.setVertice(g);
		Vertice n = new Vertice("nucleo bandeirante");
		modeloGrafoCidade.setVertice(n);
		Vertice a = new Vertice("aguas claras");
		modeloGrafoCidade.setVertice(a);
		Vertice v = new Vertice("vicente pires");
		modeloGrafoCidade.setVertice(v);
		Vertice r = new Vertice("riacho fundo");
		modeloGrafoCidade.setVertice(r);
		Vertice t = new Vertice("taguatinga");
		modeloGrafoCidade.setVertice(t);

		s.setArestas(new Aresta(s, g, 9.8f, 16, 5f));
		s.setArestas(new Aresta(s, n, 17.9f, 22, 12.81f));

		g.setArestas(new Aresta(g, s, 9.8f, 16, 5f));
		g.setArestas(new Aresta(g, n, 16.6f, 19, 9.74f));
		g.setArestas(new Aresta(g, t, 13.4f, 19, 10.09f));
		g.setArestas(new Aresta(g, a, 9.5f, 15, 6.55f));
		g.setArestas(new Aresta(g, v, 7.6f, 13, 5f));

		n.setArestas(new Aresta(n, s, 17.9f, 22, 12.81f));
		n.setArestas(new Aresta(n, g, 16.6f, 19, 9.74f));
		n.setArestas(new Aresta(n, r, 12.8f, 22, 3.77f));

		a.setArestas(new Aresta(a, g, 9.5f, 15, 6.55f));
		a.setArestas(new Aresta(a, t, 6.8f, 14, 5.21f));

		v.setArestas(new Aresta(v, g, 7.6f, 13, 5f));
		v.setArestas(new Aresta(v, t, 9.2f, 15, 5.22f));

		r.setArestas(new Aresta(r, n, 12.8f, 22, 3.77f));
		r.setArestas(new Aresta(r, t, 11.7f, 23, 9.84f));

		t.setArestas(new Aresta(t, r, 11.7f, 23, 9.84f));
		t.setArestas(new Aresta(t, g, 13.4f, 19, 10.09f));
		t.setArestas(new Aresta(t, a, 6.8f, 14, 5.55f));
		t.setArestas(new Aresta(t, v, 9.2f, 15, 5.22f));

		/*
		 * //rotas partindo de Sudoeste
		 * s.setArestas(new Aresta(s, g, 7, 7));
		 * s.setArestas(new Aresta(s, n, 15, 8));
		 * 
		 * //rotas partindo de Guar�
		 * g.setArestas(new Aresta(g, n, 11, 8));
		 * g.setArestas(new Aresta(g, t, 10, 0));
		 * g.setArestas(new Aresta(g, a, 7, 2));
		 * g.setArestas(new Aresta(g, v, 4, 4));
		 * 
		 * //rotas partindo de N�cleo bandeirante
		 * n.setArestas(new Aresta(n, r, 2, 4));
		 * 
		 * //rotas partindo de �guas Claras
		 * a.setArestas(new Aresta(a, t, 3, 0));
		 * 
		 * //rotas partindo de Vicente Pires
		 * v.setArestas(new Aresta(v, t, 5, 0));
		 * 
		 * //rotas partindo de Riacho Fundo
		 * r.setArestas(new Aresta(r, t, 5, 0));
		 * 
		 */

		modeloGrafoCidade.setAresta();

		return modeloGrafoCidade;
	}

}
