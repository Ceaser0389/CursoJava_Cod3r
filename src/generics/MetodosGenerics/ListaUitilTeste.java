package generics.MetodosGenerics;

import java.util.Arrays;
import java.util.List;

public class ListaUitilTeste {

	public static void main(String[] args) {
	
	List<String> langs = Arrays.asList("Js","PHP","Java","C++");
	List<Integer> nums = Arrays.asList(1,2,3,4,5);
	
		
	String ultimaLinguagem = (String )ListaUtil.getUltimo1(langs);
	System.out.println(ultimaLinguagem);	
		
		
	Integer ultimoNumero =(Integer) ListaUtil.getUltimo1(nums);	
	System.out.println(ultimoNumero);	
	
	
	String ultimaLinguagem2 = (String )ListaUtil.getUltimo2(langs);
	System.out.println(ultimaLinguagem2);	
		
		
	Integer ultimoNumero2 =(Integer) ListaUtil.getUltimo2(nums);	
	System.out.println(ultimoNumero2);	
		
		
		
	}

}
