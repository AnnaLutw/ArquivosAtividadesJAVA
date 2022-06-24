package arquivosLista;

import java.io.*;
import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {

		//selecionei o arquivo da 2
		String NomeArq = "C:\\temp\\texto.txt";
		File arq = new File(NomeArq);

		//try se siver algum erro
		try {
			//variavel para contar quantas vezes o A passou
			int conta=0;
			String linha ="";
			Scanner ent = new Scanner (arq);
			
			//while para percorrer cada linha do arquivo
			while(ent.hasNextLine()) {
				//salvar essa linha percorrida na variavel
				linha=ent.nextLine();
				System.out.println(linha);
				
				//percorrer a linha 
				for(int i =0; i<linha.length(); i++) {
					//se for igual a "A", somar mais um
					if(linha.charAt(i)=='a') {
						conta++;
					}
				}
				//imprimir a conta
				System.out.println(conta);
			}
			ent.close();
		}
		catch (IOException e){
			System.out.println("Erro");
			e.printStackTrace();
		}
	}

}
