package stream.reduce2;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10.1);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Gabi", 10.1);
		
		
		List<Aluno> alunos =
			Arrays.asList(a1, a2, a3, a4,a5,a6,a7,a8);
		
		System.out.println("distinct......");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\n");
		System.out.println("\n skip/limit");
		alunos.stream()
		.distinct()
		.limit(2)
		.skip(1)  // pula elementos
		.forEach(System.out::println);
		
		
		System.out.println("\n take/while");
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >=7)
		.forEach(System.out::println);
		
		
		
		
		
		
		
		
	}

}
