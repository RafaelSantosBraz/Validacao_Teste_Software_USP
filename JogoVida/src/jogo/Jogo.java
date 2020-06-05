/**
 * Autores: Rafael dos Santos Braz; Gustavo Oliveira Dias.
 */

package jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static final int n = 6;
	public static final int m = 6;

	public int[][] gerarTabuleiroAleatorio() {
		int[][] tabuleiro = new int[n][m];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				tabuleiro[i][j] = random.nextInt(2);
			}
		}
		return tabuleiro;
	}

	public int[][] gerarProximaGeracao(int[][] tabuleiroAnterior) {
		if (!tabuleiroValoresValidos(tabuleiroAnterior)) {
			return null;
		}
		int[][] tabuleiroAtual = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int[] vizinhos = getVizinhos(tabuleiroAnterior, i, j);
				int celulasVivas = getQuantidadeCelulasVivas(vizinhos);
				if (tabuleiroAnterior[i][j] == 1) {
					if (celulasVivas == 2 || celulasVivas == 3) {
						tabuleiroAtual[i][j] = 1;
					}
				} else {
					if (celulasVivas == 3) {
						tabuleiroAtual[i][j] = 1;
					}
				}
			}
		}
		return tabuleiroAtual;

	}

	public int[] getVizinhos(int[][] tabuleiro, int i, int j) {
		int[] vizinhos = new int[8];
		try {
			vizinhos[0] = tabuleiro[i - 1][j - 1];
		} catch (Exception e) {
		}
		try {
			vizinhos[1] = tabuleiro[i - 1][j];
		} catch (Exception e) {
		}
		try {
			vizinhos[2] = tabuleiro[i - 1][j + 1];
		} catch (Exception e) {
		}
		try {
			vizinhos[3] = tabuleiro[i][j + 1];
		} catch (Exception e) {
		}
		try {
			vizinhos[4] = tabuleiro[i + 1][j + 1];
		} catch (Exception e) {
		}
		try {
			vizinhos[5] = tabuleiro[i + 1][j];
		} catch (Exception e) {
		}
		try {
			vizinhos[6] = tabuleiro[i + 1][j - 1];
		} catch (Exception e) {
		}
		try {
			vizinhos[7] = tabuleiro[i][j - 1];
		} catch (Exception e) {
		}
		return vizinhos;
	}

	public int getQuantidadeCelulasVivas(int[] vizinhos) {
		int count = 0;
		for (int i = 0; i < vizinhos.length; i++) {
			count += vizinhos[i];
		}
		return count;
	}

	public boolean jogar() {
		int[][] tabuleiroAnterior = gerarTabuleiroAleatorio();
		while (true) {
			printTabuleiro(tabuleiroAnterior);
			int[][] tabuleiroAtual = gerarProximaGeracao(tabuleiroAnterior);
			printTabuleiro(tabuleiroAtual);
			tabuleiroAnterior = tabuleiroAtual;
			if (!getContinuar()) {
				break;
			}
		}
		return true;
	}

	public void printTabuleiro(int[][] tabuleiro) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(tabuleiro[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public boolean getContinuar() {
		System.out.println("Quer continuar?(s/n)");
		Scanner s = new Scanner(System.in);
		String resp = s.nextLine();
		return (resp.equals("s") || resp.equals("S"));
	}

	public boolean tabuleiroValoresValidos(int[][] tabuleiro) {
		if (tabuleiro.length != n) {
			return false;
		}
		for (int i = 0; i < n; i++) {
			if (tabuleiro[i].length != m) {
				return false;
			}
			for (int j = 0; j < m; j++) {
				if (tabuleiro[i][j] < 0 || tabuleiro[i][j] > 1) {
					return false;
				}
			}
		}
		return true;
	}

}
