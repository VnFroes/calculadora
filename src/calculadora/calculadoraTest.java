package calculadora;

public class calculadoraTest {
public static void main(String [] args) {
	
	//Classe para testes das operacoes da calculadora
	
	//testes de soma
	
	calculadoraSoma calc = new calculadoraSoma();

	System.out.println("Testes de soma");
	
	//1 cenario - test (soma dois valores)
	int soma = calc.somar(3, 7);
	System.out.println(soma);
	
	//2 cenario - test (soma dois valores sendo um zero)
	soma = calc.somar(3, 0);
	System.out.println(soma);
	
	//3 cenario - test (soma dois valores sendo ambos zero)
	soma = calc.somar(0, 0);
	System.out.println(soma);
	
	//4 cenario - test (soma dois valores sendo um negativo)
	soma = calc.somar(3, -1);
	System.out.println(soma);
    
	//testes de subtracao
	
	System.out.println("Testes de subtracao");
	
	calculadoraSubtracao calcSub = new calculadoraSubtracao();
	
	//1 cenario - test (subtrai dois valores)
		int sub = calcSub.subtracao(7,3);
		System.out.println(sub);
	
	//2 cenario - test (subtrai dois valores sendo um zero)
		sub=calcSub.subtracao(7,0);
		System.out.println(sub);
		
    //3 cenario - test (subtrai dois valores sendo ambos zero)
	    sub=calcSub.subtracao(0,0);
	    System.out.println(sub);
	  
	//4 cenario - test (subtrai dois valores sendo um negativo)
	    sub=calcSub.subtracao(7,-1);
	    System.out.println(sub);
	    
	//testes de multiplicacao
	    
	    System.out.println("Testes de multiplicacao");
	    
	    calculadoraMultiplicacao calcMulti = new calculadoraMultiplicacao();
	    
    //1 cenario - test (Multiplica dois valores)
	    double multi = calcMulti.multiplicacao(7,2);
	    System.out.println(multi);
	    
	//2 cenario - test (Multiplica dois valores sendo um zero)
	    multi=calcMulti.multiplicacao(7, 0);
	    System.out.println(multi);
	
	//3 cenario - test (Multiplica dois valores sendo ambos zero)
	    multi=calcMulti.multiplicacao(0, 0);
	    System.out.println(multi);
	    
	//4 cenario - test (Multiplica dois valores sendo um negativo)
	    multi=calcMulti.multiplicacao(7, -1);
	    System.out.println(multi);
	    
	//testes de divisao
	    
	    System.out.println("Testes de divisao");
	    
	    calculadoraDivisao calcDiv = new calculadoraDivisao();
	    
	//1 cenario - test (divide dois valores)
	    double div = calcDiv.divisao(8,2);
	    System.out.println(div);
	    
	//2 cenario - test (divide dois valores sendo um zero)
	    div=calcDiv.divisao(7, 0);
	    System.out.println(div);
	    
	//3 cenario - test (divide dois valores sendo ambos zero)
	    div=calcDiv.divisao(0, 0);
	    System.out.println(div);
	    
    //2 cenario - test (divide dois valores sendo um negativo)
	    div=calcDiv.divisao(7, -1);
	    System.out.println(div);
	    
		
}
}
