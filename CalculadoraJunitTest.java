/**
 * Autor: Joao Candiani
 * Data de Criação: 06/12/2023
 * Versão: 2.0
 *
 * A classe CalculadoraJunitTest contém testes sobre as operações matemáticas,
 * como soma, subtração, multiplicação e divisão.
 */
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraJunitTest {
	//CENARIO DE TESTE 1: SOMA DE DOIS NUMEROS
	@SuppressWarnings("deprecation")
	@Test
	public void SomarDoisNumeros() {
		Calculadora calc = new Calculadora();
		int soma = calc.soma(3,7);
		
		Assert.assertEquals(10,soma);
	}
	
	//CENARIO DE TESTE 2: SUBTRAÇÃO DE DOIS NUMEROS
	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairDoisNumeros() {
		Calculadora calc = new Calculadora();
		int sub = calc.subtrair(10,7);
		
		Assert.assertEquals(3,sub);
	}
	
	//CENARIO DE TESTE 3: MULTIPLICAÇÃO DE DOIS NUMEROS
	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarDoisNumeros() {
		Calculadora calc = new Calculadora();
		int mult = calc.multiplicar(3,7);
		
		Assert.assertEquals(21,mult);
	}
	
	//CENARIO DE TESTE 4: DIVISÃO DE DOIS NUMEROS
	@SuppressWarnings("deprecation")
	@Test
	public void DividirDoisNumeros() {
		Calculadora calc = new Calculadora();
		int div = calc.dividir(30,3);
		
		Assert.assertEquals(10,div);
	}
}
