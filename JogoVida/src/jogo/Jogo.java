package jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	
	private final int n = 6;
	private final int m = 6;
	
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
	
	public int[][] gerarProximaGeracao(int[][] tabuleiroAnterior){
		int[][] tabuleiroAtual = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int[] vizinhos = getVizinhos(tabuleiroAnterior, i, j);
				int celulasVivas = getQuantidadeCelulasVivas(vizinhos);
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
					} else if (celulasVivas == 2) {
						tabuleiroAtual[i][j] = 0;
					} else {
						tabuleiroAtual[i][j] = 0;
					}
				}
			}
		}	
		return tabuleiroAtual;
	}
	
	private int[] getVizinhos(int[][] tabuleiro, int i, int j) {
		int[] vizinhos = new int[8];		
		try {
			vizinhos[0] = tabuleiro[i-1][j-1];
		} catch (Exception e) {
			vizinhos[0] = 0;
		}
		try {
			vizinhos[1] = tabuleiro[i-1][j];
		} catch (Exception e) {
			vizinhos[1] = 0;
		}
		try {
			vizinhos[2] = tabuleiro[i-1][j+1];
		} catch (Exception e) {
			vizinhos[2] = 0;
		}
		try {
			vizinhos[3] = tabuleiro[i][j+1];
		} catch (Exception e) {
			vizinhos[3] = 0;
		}
		try {
			vizinhos[4] = tabuleiro[i+1][j+1];
		} catch (Exception e) {
			vizinhos[4] = 0;
		}
		try {
			vizinhos[5] = tabuleiro[i+1][j];
		} catch (Exception e) {
			vizinhos[5] = 0;
		}
		try {
			vizinhos[6] = tabuleiro[i+1][j-1];
		} catch (Exception e) {
			vizinhos[6] = 0;
		}
		try {
			vizinhos[7] = tabuleiro[i][j-1];
		} catch (Exception e) {
			vizinhos[7] = 0;
		}
		return vizinhos;
	}

	private int getQuantidadeCelulasVivas(int[] vizinhos) {
		int count = 0;
		for (int i = 0; i < vizinhos.length; i++) {
			if (vizinhos[i] == 1) {
				count++;
			}
		}
		return count;
	}
	
	public void jogar() {
		int[][] tabuleiroAnterior = gerarTabuleiroAleatorio();
		while(true) {
			printTabuleiro(tabuleiroAnterior);
			int[][] tabuleiroAtual = gerarProximaGeracao(tabuleiroAnterior);
			printTabuleiro(tabuleiroAtual);
			tabuleiroAnterior = tabuleiroAtual;
			if (!getContinuar()) {
				break;
			}
		}
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
}