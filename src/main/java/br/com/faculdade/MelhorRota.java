package br.com.faculdade;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.com.faculdade.servicos.CalcularRotaGrafo;
import br.com.faculdade.servicos.ServicoImpressao;
import br.com.faculdade.modelos.ModeloGrafo;
import br.com.faculdade.modelos.Grafo;
import br.com.faculdade.modelos.Vertice;

import javax.swing.JTextArea;

/**
 * Tela principal do programa gerada com o Plugin instalado no eclipse chamado
 * WindowBuilder (ferramenta que auxilia na cria��o de de interfaces gr�ficas)
 * 
 * @author Tiago
 * @version 1.2
 * 
 */
public class MelhorRota extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldOrigem;
	private JTextField textFieldDestino;

	/**
	 * M�todo principal que inicia a aplica��o.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MelhorRota frame = new MelhorRota();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Cria a tela com suas dimens�es e seus componetes. c�digo dos componentes
	 * criados automaticamente pelo Plugin WindowBuilder.
	 */
	public MelhorRota() {
		setType(Type.POPUP);
		setTitle("Programa Melhor Rota v.1.2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 307);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);

		JLabel lblNewLabel = new JLabel("Origem: ");

		final JTextArea textArea = new JTextArea();

		textFieldOrigem = new JTextField();
		textFieldOrigem
				.setToolTipText("Insira uma das cidades acima sem acentos gr\u00E1ficos");
		textFieldOrigem.setColumns(10);

		textFieldDestino = new JTextField();
		textFieldDestino
				.setToolTipText("Insira uma das cidades acima sem acentos gr\u00E1ficos");
		textFieldDestino.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Destino: ");

		// Implementa��o do bot�o calcular
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setToolTipText("Calcula a rota em Km");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String origem = textFieldOrigem.getText();
				String destino = textFieldDestino.getText();

				Grafo grafo = ModeloGrafo.criarGrafoCidades();
				List<Vertice> menorRota = new ArrayList<Vertice>();
				CalcularRotaGrafo algoritmoDijkstra = new CalcularRotaGrafo();
				ServicoImpressao impr = new ServicoImpressao();

				menorRota = algoritmoDijkstra.MelhorRotaPorKm(grafo, origem,
						destino);
				// System.out.println(impr.imprimirMelhorRota(menorRota));
				textArea.setText(impr.imprimirMelhorRota(menorRota));
			}
		});

		JButton btnNewButton = new JButton("Sair");
		// implementa��o do bot�o sair
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		JLabel lblSudoeste = new JLabel("Cidades:");

		JTextPane txtpnAsdf = new JTextPane();
		txtpnAsdf.setToolTipText("cidades com rotas armazenas.");
		txtpnAsdf.setEditable(false);
		txtpnAsdf
				.setText(
						"Sudoeste, Guar\u00E1, N\u00FAcleo Bandeirante, Riacho Fundo, \u00C1guas Claras, Vicente Pires, Taguatinga");

		JLabel lblCopirightTiagoRios = new JLabel("Copyright \u00A9 Tiago Rios");

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
												.addGap(123)
												.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblNewLabel)
														.addComponent(lblNewLabel_1))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
														.addGroup(gl_panel.createSequentialGroup()
																.addGap(10)
																.addComponent(btnCalcular)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnNewButton))
														.addComponent(textFieldDestino, GroupLayout.DEFAULT_SIZE, 129,
																Short.MAX_VALUE)
														.addComponent(textFieldOrigem)))
										.addGroup(gl_panel.createSequentialGroup()
												.addGap(20)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 393,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_panel.createSequentialGroup()
																.addComponent(lblSudoeste)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(txtpnAsdf, GroupLayout.PREFERRED_SIZE,
																		326, GroupLayout.PREFERRED_SIZE)))))
								.addContainerGap(22, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
								.addContainerGap(313, Short.MAX_VALUE)
								.addComponent(lblCopirightTiagoRios)
								.addContainerGap()));
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSudoeste)
										.addComponent(txtpnAsdf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(38)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel)
										.addComponent(textFieldOrigem, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(textFieldDestino, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnCalcular)
										.addComponent(btnNewButton))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblCopirightTiagoRios)
								.addContainerGap()));
		panel.setLayout(gl_panel);
	}
}
