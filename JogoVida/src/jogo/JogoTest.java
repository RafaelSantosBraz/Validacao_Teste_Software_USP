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
	void teste7() {
		Jogo jogo = new Jogo();
		boolean esperado = true;
		// entrada 's'
		boolean resultado = jogo.getContinuar();
		assertEquals(esperado, resultado);
	}
	
	@Test
	void teste8() {
		Jogo jogo = new Jogo();
		boolean esperado = false;
		// entrada 'n'
		boolean resultado = jogo.getContinuar();
		assertEquals(esperado, resultado);
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
		//Provar que o jogo uma hora sempre resulta em uma matriz de zeros
		//Jogar até a matriz resultar apenas em zeros
		Jogo jogo = new Jogo();
		int[][] tabuleiroAnterior = jogo.gerarTabuleiroAleatorio();
		while (true) {
			jogo.printTabuleiro(tabuleiroAnterior);
			int[][] tabuleiroAtual = jogo.gerarProximaGeracao(tabuleiroAnterior);
			jogo.printTabuleiro(tabuleiroAtual);
			tabuleiroAnterior = tabuleiroAtual;
			if (!jogo.getContinuar()) {
				break;
			}
		}
		int[][] esperado = new int[][] {
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }			
		};		
		int [][] resultado = tabuleiroAnterior;
		assertArrayEquals(esperado, resultado);
	}
}
