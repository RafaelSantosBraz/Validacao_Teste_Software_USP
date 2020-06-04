package jogo;

import java.util.Random;

public class JogoForTest {

	public int[][] gerarTabuleiroAleatorio() {
		int[][] tabuleiro = new int[6][6];
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				tabuleiro[i][j] = random.nextInt(2);
			}
		}
		return tabuleiro;
	}

	public int[][] gerarProximaGeracao(int[][] tabuleiroAnterior) {		
		if (!tabuleiroValoresValidos(tabuleiroAnterior)) {
			return null;
		}
		int[][] tabuleiroAtual = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				int[] vizinhos = getVizinhos(tabuleiroAnterior, i, j);
				if (vizinhos.length != 8) {
					return null;
				}
				int celulasVivas = getQuantidadeCelulasVivas(vizinhos);
				if (celulasVivas < 0 || celulasVivas > 8) {
					return null;
				}
				if (tabuleiroAnterior[i][j] == 1) {
					if (celulasVivas < 2) {
						tabuleiroAtual[i][j] = 0;
					} else if (celulasVivas > 3) {
						tabuleiroAtual[i][j] = 0;
					} else {
						tabuleiroAtual[i][j] = 1;
					}
				} else {
					if (celulasVivas == 3) {
						tabuleiroAtual[i][j] = 1;
					} else {
						tabuleiroAtual[i][j] = 0;
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
			vizinhos[0] = 0;
		}
		try {
			vizinhos[1] = tabuleiro[i - 1][j];
		} catch (Exception e) {
			vizinhos[1] = 0;
		}
		try {
			vizinhos[2] = tabuleiro[i - 1][j + 1];
		} catch (Exception e) {
			vizinhos[2] = 0;
		}
		try {
			vizinhos[3] = tabuleiro[i][j + 1];
		} catch (Exception e) {
			vizinhos[3] = 0;
		}
		try {
			vizinhos[4] = tabuleiro[i + 1][j + 1];
		} catch (Exception e) {
			vizinhos[4] = 0;
		}
		try {
			vizinhos[5] = tabuleiro[i + 1][j];
		} catch (Exception e) {
			vizinhos[5] = 0;
		}
		try {
			vizinhos[6] = tabuleiro[i + 1][j - 1];
		} catch (Exception e) {
			vizinhos[6] = 0;
		}
		try {
			vizinhos[7] = tabuleiro[i][j - 1];
		} catch (Exception e) {
			vizinhos[7] = 0;
		}
		return vizinhos;
	}

	public int getQuantidadeCelulasVivas(int[] vizinhos) {
		if (vizinhos.length != 8) {
			return -1;
		}
		int count = 0;
		for (int i = 0; i < vizinhos.length; i++) {
			if (vizinhos[i] == 1) {
				count++;
			}
		}
		return count;
	}

	public boolean tabuleiroValoresValidos(int[][] tabuleiro) {
		if (tabuleiro.length != 6) {
			return false;
		}
		for (int i = 0; i < 6; i++) {
			if (tabuleiro[i].length != 6) {
				return false;
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (tabuleiro[i][j] < 0 || tabuleiro[i][j] > 1) {
					return false;
				}
			}
		}
		return true;
	}

}
