/**
 * Autores: Rafael dos Santos Braz; Gustavo Oliveira Dias.
 */

package jogo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JogoTest {

	@Test
	void testTabuleiroAleatorio() {
		Jogo jogo = new Jogo();	
		JogoCerto jogoCerto = new JogoCerto();	
		int[][][] resInter = new int[][][] {
			jogo.gerarTabuleiroAleatorio(),
			jogo.gerarTabuleiroAleatorio()
		};		
		for (int i = 0; i < 6; i++) {
			boolean resp =  true;
			for (int j = 0; j < 6; j++) {
				if(resInter[0][i][j] != resInter[1][i][j]) {
					resp = false;
					break;
				}
			}			
			assertEquals(false, resp);
		}		
		// verificações das bordas
		boolean resp =  true;
		for (int i = 0; i < 6; i++) {			
			if(resInter[0][i][0] != resInter[1][i][0]) {
				resp = false;
				break;
			}						
		}	
		assertEquals(false, resp);
		resp = true;
		for (int i = 0; i < 6; i++) {			
			if(resInter[0][i][5] != resInter[1][i][5]) {
				resp = false;
				break;
			}						
		}	
		assertEquals(false, resp);
		resp = true;
		for (int i = 0; i < 6; i++) {			
			if(resInter[0][0][i] != resInter[1][0][i]) {
				resp = false;
				break;
			}						
		}	
		assertEquals(false, resp);
		resp = true;
		for (int i = 0; i < 6; i++) {			
			if(resInter[0][5][i] != resInter[1][5][i]) {
				resp = false;
				break;
			}						
		}	
		assertEquals(false, resp);
		resp = true;
		// verificação da validade dos valores e tamanho
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(resInter[0]));
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(resInter[1]));
		
	}
	
	@Test
	void testProximaGeracao() {
		Jogo jogo = new Jogo();
		JogoCerto jogoCerto = new JogoCerto();
		int count = 3;
		do {
			int[][] intermediario = jogoCerto.gerarTabuleiroAleatorio();
			int[][] novo = jogo.gerarProximaGeracao(intermediario);
			assertEquals(true, jogoCerto.tabuleiroValoresValidos(novo));
			int[][] novoCerto = jogoCerto.gerarProximaGeracao(intermediario);			
			assertArrayEquals(novoCerto, novo);
			count--;
		} while (count >= 0);
	}
	
	@Test
	void testVizinhosCelulasVivas() {
		Jogo jogo = new Jogo();
		JogoCerto jogoCerto = new JogoCerto();
		int count = 3;
		do {
			int[][] intermediario = jogoCerto.gerarTabuleiroAleatorio();
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					int[] vizinhosCerto = jogoCerto.getVizinhos(intermediario, i, j);
					int[] vizinhos = jogo.getVizinhos(intermediario, i, j);
					assertArrayEquals(vizinhosCerto, vizinhos);
					assertEquals(jogoCerto.getQuantidadeCelulasVivas(vizinhosCerto),jogo.getQuantidadeCelulasVivas(vizinhos));
				}
			}
			count--;
		} while (count >= 0);
		
	}
	
	@Test
	void testValoresValidos() {
		Jogo jogo = new Jogo();
		JogoCerto jogoCerto = new JogoCerto();
		int count = 3;
		do {
			int[][] intermediario = jogo.gerarTabuleiroAleatorio();
			assertEquals(jogoCerto.tabuleiroValoresValidos(intermediario), jogo.tabuleiroValoresValidos(intermediario));
			intermediario = jogoCerto.gerarTabuleiroAleatorio();
			assertEquals(jogoCerto.tabuleiroValoresValidos(intermediario), jogo.tabuleiroValoresValidos(intermediario));
			count--;
		} while (count >= 0);
		int[][] intermediario  = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				intermediario[i][j] = -1;
				assertEquals(false, jogo.tabuleiroValoresValidos(intermediario));
				intermediario[i][j] = 2;
				assertEquals(false, jogo.tabuleiroValoresValidos(intermediario));
				intermediario[i][j] = 0;
			}			
		}	
	}
	
	@Test
	void testeEspecifico() {
		Jogo jogo = new Jogo();
		JogoCerto jogoCerto = new JogoCerto();
		int[][] tabuleiroInicial = new int[][] {
			{ 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }
		};	
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 1, 1, 1, 0 },
			{ 0, 1, 1, 1, 1, 0 },
			{ 0, 1, 1, 1, 1, 0 },
			{ 0, 1, 1, 1, 1, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 1, 0, 0 },
			{ 0, 0, 1, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 1, 1, 1, 0, 0 },
			{ 1, 1, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 1, 0, 0 },
			{ 0, 0, 1, 1, 0, 0 },
			{ 0, 0, 0, 0, 1, 1 },
			{ 0, 0, 0, 0, 1, 1 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 1, 1, 1, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 1, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 1, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 0, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 }	
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 2, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }		
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
		tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, -1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }	
		};				
		assertArrayEquals(jogoCerto.gerarProximaGeracao(tabuleiroInicial), jogo.gerarProximaGeracao(tabuleiroInicial));
	}	
	
	
	@Test
	void testeTamanho() {	
		assertEquals(6, Jogo.m);
		assertEquals(6, Jogo.n);
	}
	
}
