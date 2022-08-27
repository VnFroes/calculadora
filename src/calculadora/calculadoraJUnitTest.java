package calculadoraJunit;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class calculadoraJUnitTest {

	@Test 
public void main() {
	
	//Classe para testes das operacoes da calculadora
	
	//testes de soma
	
	calculadoraJUnitSoma calc = new calculadoraJUnitSoma();

	System.out.println("Testes de soma");
	
	//1 cenario - test (soma dois valores)
	int soma = calc.somar(3, 7);
	System.out.println(soma);
	Assert.assertEquals(10, soma);
	
	//2 cenario - test (soma dois valores sendo um zero)
	soma = calc.somar(3, 0);
	System.out.println(soma);
	Assert.assertEquals(3, soma);
	
	//3 cenario - test (soma dois valores sendo ambos zero)
	soma = calc.somar(0, 0);
	System.out.println(soma);
	Assert.assertEquals(0, soma);
	
	//4 cenario - test (soma dois valores sendo um negativo)
	soma = calc.somar(3, -1);
	System.out.println(soma);
	Assert.assertEquals(2, soma);
    
	//testes de subtracao
	
	System.out.println("Testes de subtracao");
	
	calculadoraJUnitSubtracao calcSub = new calculadoraJUnitSubtracao();
	
	//1 cenario - test (subtrai dois valores)
		int sub = calcSub.subtracao(7,3);
		System.out.println(sub);
		Assert.assertEquals(4, sub);
		//caso o valor esperado imbutido no "assert" seja errado o JUnit retornara como erro 
	    //pois o valor nao e o mesmo do retorno da operacao
	
	//2 cenario - test (subtrai dois valores sendo um zero)
		sub=calcSub.subtracao(7,0);
		System.out.println(sub);
		Assert.assertEquals(7, sub);
		//caso o valor esperado imbutido no "assert" seja errado o JUnit retornara como erro 
	    //pois o valor nao e o mesmo do retorno da operacao
		
    //3 cenario - test (subtrai dois valores sendo ambos zero)
	    sub=calcSub.subtracao(0,0);
	    System.out.println(sub);
	    Assert.assertEquals(0, sub);
	    //caso o valor esperado imbutido no "assert" seja errado o JUnit retornara como erro 
	    //pois o valor nao e o mesmo do retorno da operacao
	  
	//4 cenario - test (subtrai dois valores sendo um negativo)
	    sub=calcSub.subtracao(7,-1);
	    System.out.println(sub);
	    Assert.assertEquals(8, sub);
	    //caso o valor esperado imbutido no "assert" seja errado o JUnit retornara como erro 
	    //pois o valor nao e o mesmo do retorno da operacao
	    
	//testes de multiplicacao
	    
	    System.out.println("Testes de multiplicacao");
	    
	    calculadoraJUnitMultiplicacao calcMulti = new calculadoraJUnitMultiplicacao();
	    
    //1 cenario - test (Multiplica dois valores)
	    double multi = calcMulti.multiplicacao(7,2);
	    System.out.println(multi);
	    Assert.assertEquals(14, multi, multi);
	    //caso o valor esperado imbutido no "assert" seja errado o JUnit retornara como erro 
	    //pois o valor nao e o mesmo do retorno da operacao
	    
	//2 cenario - test (Multiplica dois valores sendo um zero)
	    multi=calcMulti.multiplicacao(7, 0);
	    System.out.println(multi);
	    Assert.assertEquals(0, multi, multi);
	    //caso o valor esperado imbutido no "assert" seja errado o JUnit retornara como erro 
	    //pois o valor nao e o mesmo do retorno da operacao
	
	//3 cenario - test (Multiplica dois valores sendo ambos zero)
	    multi=calcMulti.multiplicacao(0, 0);
	    System.out.println(multi);
	    Assert.assertEquals(0, multi, multi);
	    //caso o valor esperado imbutido no "assert" seja errado o JUnit retornara como erro 
	    //pois o valor nao e o mesmo do retorno da operacao
	    
	//4 cenario - test (Multiplica dois valores sendo um negativo)
	    multi=calcMulti.multiplicacao(7, -1);
	    System.out.println(multi);
	    Assert.assertEquals(-7, multi, multi);
	    //caso o valor esperado imbutido no "assert" seja errado o JUnit retornara como erro 
	    //pois o valor nao e o mesmo do retorno da operacao
	    
	//testes de divisao
	    
	    System.out.println("Testes de divisao");
	    
	    calculadoraJUnitDivisao calcDiv = new calculadoraJUnitDivisao();
	    
	//1 cenario - test (divide dois valores)
	    double div = calcDiv.divisao(8,2);
	    System.out.println(div);
	    Assert.assertEquals(4, div, div);
	    //caso o valor esperado imbutido no "assert" seja errado o JUnit retornara como erro 
	    //pois o valor nao e o mesmo do retorno da operacao
	    
	//2 cenario - test (divide dois valores sendo um zero)
	    div=calcDiv.divisao(7, 0);//valores divididos por zero ira retornar como erro no JUnit
	    System.out.println(div);
	    
	    
	//3 cenario - test (divide dois valores sendo ambos zero)
	    div=calcDiv.divisao(0, 0);//valores divididos por zero ira retornar como erro no JUnit
	    System.out.println(div);
	    
    //2 cenario - test (divide dois valores sendo um negativo)
	    div=calcDiv.divisao(7, -1);
	    System.out.println(div);
	    Assert.assertEquals(-7, div, div);
	    //caso o valor esperado imbutido no "assert" seja errado o JUnit retornara como erro 
	    //pois o valor nao e o mesmo do retorno da operacao
	    
		
}
}
