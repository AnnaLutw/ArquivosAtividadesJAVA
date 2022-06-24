package arquivosLista;

import java.io.*;
import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		//peguei os diretorios dos dois arquivos
		File arqUm = new File("C:\\temp\\atividade.txt");
		File arqDois = new File("C:\\temp\\texto.txt");

		try {
			//scanner para cada arquivo
			Scanner ent = new Scanner(arqUm);
			Scanner entr = new Scanner(arqDois);
			
			//diretorio do novo arquivo
			String loc = "C:\\temp\\novo.txt";
			FileWriter novoArquivo = new FileWriter(loc, false);
			String linhaUm="";
			String linhaDois="";
			//percorrer as linhas do arquivo um e salvar no novo arquivo
			while(ent.hasNextLine()) {
				linhaUm=ent.nextLine();
				novoArquivo.write(linhaUm+" \n");
			}
			//percorrer as linhas do arquivo dois e salvar no novo arquivo
			while(entr.hasNextLine()) {
				linhaDois=entr.nextLine();
				novoArquivo.write(linhaDois+"\n ");
			}
			ent.close();
			entr.close();
			novoArquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
