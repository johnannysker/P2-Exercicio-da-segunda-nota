package br.edu.unifacisa.p2.logica;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciciosDeLogica {
	public static int somaArray(int[] numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma += i;

		}
		return soma;
	}

	public static int getMaior(int[] numeros) {
		int maiorAgora = numeros[0];
		for (int i : numeros) {
			if (maiorAgora < i) {
				maiorAgora = i;
			}

		}
		return maiorAgora;
	}

	public static int getMenor(int[] numeros) {
		int menorAgora = numeros[0];
		for (int i : numeros) {
			if (menorAgora > i) {
				menorAgora = i;
			}

		}
		return menorAgora;
	}

	public static double getMedia(int[] numeros) {
		double soma = 0.0;
		for (int i : numeros) {
			soma += i;

		}
		double media = soma / numeros.length;
		return media;
	}

	public static List<String> inverteArray(String[] nomes) {
		List<String> listReversa = new ArrayList<>();
	
		 for (int i = 0; i < nomes.length / 2; i++) {
		        String ant = nomes[i];
		        nomes[i] = nomes[nomes.length - 1 - i];
		        nomes[nomes.length - 1 - i] = ant;
		        listReversa.add(ant);
		    }
				
		return listReversa;
	}

	public static List<String> inverteLista(List<String> nomes) {
		List<String> aoContrario = new ArrayList<>();
		for (int i = nomes.size() - 1; i >= 0; i--) {
			String nome = nomes.get(i);
			aoContrario.add(nome);
		}
		return aoContrario;
	}

	public static String junta(List<String> nomes, String caractere) {
	String junta = String.join(caractere);
		return junta;
	}

	public static String substitui(String mensagem, String localizar, String substituir) {
		  String sub = mensagem.replaceAll(localizar, substituir);
    return sub;
  }

	public static boolean ehNumero(String valor) {
		for (int i = 0; i < valor.length(); i++) {
			char caractere = valor.charAt(i);
			if (caractere < '0' || caractere > '9') {
				return false;
			}

		}
		return true;
	}

	public static boolean validaCEP(String cep) {
		
	return false;
	}

	public static boolean validaCPF(String cpf) {
		 int     d1, d2;
	      int     digito1, digito2, resto;
	      int     digitoCPF;
	      String  nDigResult;

	      d1 = d2 = 0;
	      digito1 = digito2 = resto = 0;

	      for (int nCount = 1; nCount < cpf.length() -1; nCount++)
	      {
	         digitoCPF = Integer.valueOf (cpf.substring(nCount -1, nCount)).intValue();

	       	         d1 = d1 + ( 11 - nCount ) * digitoCPF;

	        	         d2 = d2 + ( 12 - nCount ) * digitoCPF;
	      };

	      	      resto = (d1 % 11);

	      if (resto < 2)
	         digito1 = 0;
	      else
	         digito1 = 11 - resto;

	      d2 += 2 * digito1;

	      resto = (d2 % 11);

	      if (resto < 2)
	         digito2 = 0;
	      else
	         digito2 = 11 - resto;

	      String nDigVerific = cpf.substring (cpf.length()-2, cpf.length());

	      nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

	      if( nDigVerific.equals(nDigResult)){
	    	  return true;
	   }
		return false;
	}

	public static long fatorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fatorial(n - 1);
	}

	public static int fibonacci(int n) {
		   int a = 0, b = 1, c = 0;
		    if (n == 0){
		    	return a;
		    }
		    for(int i = 2; i <= n; i++) 
		    {
		      c = a + b;
		      a = b;
		      b = c;    
		    }
		    return b;
}
}