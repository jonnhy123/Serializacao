package br.univel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesteGravacao {
	public TesteGravacao() {
		Aluno aluno = new Aluno();
		aluno.setId(52);
		aluno.setNome("Luis Inacio");
	
		try {
			File file = new File("arq.uni");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(aluno);
			oos.flush();
			oos.close();
			
			System.out.println("Foi!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new TesteGravacao();
	}
}
