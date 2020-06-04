package jogo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JogoTest {

	@Test
	void teste1() {
		Jogo jogo = new Jogo();
		int[][] tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int[][] esperado = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int [][] resultado = jogo.gerarProximaGeracao(tabuleiroInicial);
		assertArrayEquals(esperado, resultado);
	}

	@Test
	void teste2() {
		Jogo jogo = new Jogo();
		int[][] tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int[][] esperado = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int [][] resultado = jogo.gerarProximaGeracao(tabuleiroInicial);
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	void teste3() {
		Jogo jogo = new Jogo();
		int[][] tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 1, 1, 1, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int[][] esperado = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 1, 1, 0, 0 },
			{ 0, 1, 0, 1, 0, 0 },
			{ 0, 1, 1, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int [][] resultado = jogo.gerarProximaGeracao(tabuleiroInicial);
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	void teste4() {
		Jogo jogo = new Jogo();
		int[][] tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 1, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int[][] esperado = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int [][] resultado = jogo.gerarProximaGeracao(tabuleiroInicial);
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	void teste5() {
		Jogo jogo = new Jogo();
		int[][] tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 1, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int[][] esperado = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int [][] resultado = jogo.gerarProximaGeracao(tabuleiroInicial);
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	void teste6() {
		Jogo jogo = new Jogo();
		int[][] tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 0, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int[][] esperado = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int [][] resultado = jogo.gerarProximaGeracao(tabuleiroInicial);
		assertArrayEquals(esperado, resultado);
	}
	
		
	@Test
	void teste9() {
		Jogo jogo = new Jogo();
		int[][] tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		};
		int[][] esperado = null;
		int [][] resultado = jogo.gerarProximaGeracao(tabuleiroInicial);
		assertArrayEquals(esperado, resultado);
	}

	@Test
	void teste10() {
		Jogo jogo = new Jogo();
		int[][] tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
		};
		int[][] esperado = null;
		int [][] resultado = jogo.gerarProximaGeracao(tabuleiroInicial);
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	void teste11() {
		Jogo jogo = new Jogo();
		int[][] tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },			
		};
		int[][] esperado = null;
		int [][] resultado = jogo.gerarProximaGeracao(tabuleiroInicial);
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	void teste12() {
		Jogo jogo = new Jogo();
		int[][] tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 }
		};
		int[][] esperado = null;
		int [][] resultado = jogo.gerarProximaGeracao(tabuleiroInicial);
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	void teste13() {
		Jogo jogo = new Jogo();
		int[][] tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, -1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }			
		};
		int[][] esperado = null;
		int [][] resultado = jogo.gerarProximaGeracao(tabuleiroInicial);
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	void teste14() {
		Jogo jogo = new Jogo();
		int[][] tabuleiroInicial = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 2, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }			
		};
		int[][] esperado = null;
		int [][] resultado = jogo.gerarProximaGeracao(tabuleiroInicial);
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	void teste15() {
		Jogo jogo = new Jogo();
		int esperado = 6;		
		assertEquals(esperado, jogo.m);
		assertEquals(esperado, jogo.n);
	}
	
	@Test
	void teste16() {
		Jogo jogo = new Jogo();
		JogoForTest jogoCerto = new JogoForTest();	
		int[][] resultado = jogo.gerarTabuleiroAleatorio();
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(resultado));
	}
	

	@Test
	void teste17() {
		Jogo jogo = new Jogo();
		JogoForTest jogoCerto = new JogoForTest();
		int[][] resultado = jogo.gerarProximaGeracao(new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		});
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(resultado));
		assertArrayEquals(jogoCerto.gerarProximaGeracao(new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }
		}), resultado);
	}
	
	@Test
	void teste18() {
		Jogo jogo = new Jogo();	
		JogoForTest jogoCerto = new JogoForTest();
		int[][] resultado = jogo.gerarTabuleiroAleatorio();
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(resultado));		
	}
	
	@Test
	void teste19() {
		Jogo jogo = new Jogo();	
		JogoForTest jogoCerto = new JogoForTest();
		int[][] intermediario = jogo.gerarTabuleiroAleatorio();
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(intermediario));	
		int[][] resultado = jogo.gerarProximaGeracao(intermediario);
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(resultado));		
		int[][] esperado = jogoCerto.gerarProximaGeracao(intermediario);
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	void teste20() {
		Jogo jogo = new Jogo();	
		JogoForTest jogoCerto = new JogoForTest();	
		int[][][] resInter = new int[][][] {
			jogo.gerarTabuleiroAleatorio(),
			jogo.gerarTabuleiroAleatorio()
		};
		boolean resp =  true;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(resInter[0][i][j] != resInter[1][i][j]) {
					resp = false;
					break;
				}
			}
			if (resp == false) {
				break;
			}
		}
		assertEquals(false, resp);
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(resInter[0]));
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(resInter[1]));
	}
	
	@Test
	void teste21() {
		Jogo jogo = new Jogo();	
		JogoForTest jogoCerto = new JogoForTest();	
		int[][] intermediario = jogo.gerarTabuleiroAleatorio();
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(intermediario));
		assertEquals(jogoCerto.tabuleiroValoresValidos(intermediario), jogoCerto.tabuleiroValoresValidos(intermediario));
		
	}
	
	@Test
	void teste22() {
		Jogo jogo = new Jogo();	
		JogoForTest jogoCerto = new JogoForTest();	
		int[][] intermediario = jogo.gerarTabuleiroAleatorio();
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(intermediario));
		assertArrayEquals(jogoCerto.getVizinhos(intermediario, 2, 2), jogo.getVizinhos(intermediario, 2, 2));
		assertEquals(jogoCerto.getQuantidadeCelulasVivas(jogo.getVizinhos(intermediario, 2, 2)), jogo.getQuantidadeCelulasVivas(jogo.getVizinhos(intermediario, 2, 2)));
	}
	
	@Test
	void teste23() {
		Jogo jogo = new Jogo();	
		JogoForTest jogoCerto = new JogoForTest();	
		int[][] intermediario = jogo.gerarTabuleiroAleatorio();
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(intermediario));
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				assertArrayEquals(jogoCerto.getVizinhos(intermediario, i, j), jogo.getVizinhos(intermediario, i, j));
				assertEquals(jogoCerto.getQuantidadeCelulasVivas(jogo.getVizinhos(intermediario, i, j)), jogo.getQuantidadeCelulasVivas(jogo.getVizinhos(intermediario, i, j)));
			}
		}
		intermediario = jogoCerto.gerarTabuleiroAleatorio();
		assertEquals(true, jogoCerto.tabuleiroValoresValidos(intermediario));
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				assertArrayEquals(jogoCerto.getVizinhos(intermediario, i, j), jogo.getVizinhos(intermediario, i, j));
				assertEquals(jogoCerto.getQuantidadeCelulasVivas(jogo.getVizinhos(intermediario, i, j)), jogo.getQuantidadeCelulasVivas(jogo.getVizinhos(intermediario, i, j)));
			}
		}
	}
}
