package arquivosLista;

import java.io.*;
import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		//selecionei o diretorio
		String NomeArq = "C:\\temp\\texto.txt";
		try {
			
		    FileWriter arq = new FileWriter(NomeArq);
		    //pedi para digitar o texto e gravei no documento
		    System.out.println("Digite um texto");
			arq.write(ent.nextLine());
		    
		    arq.close();
		}
		catch (IOException e) {
			System.out.println("Erro");
			e.printStackTrace();
		}
		ent.close();
	}
}