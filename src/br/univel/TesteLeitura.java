package br.univel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteLeitura {
	
	public TesteLeitura() throws ClassNotFoundException, IOException{
		File file = new File("arq.uni");
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			
			Aluno aluno = (Aluno) obj;
			
			ois.close();
			
			System.out.println(aluno.getNome());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			new TesteLeitura();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
