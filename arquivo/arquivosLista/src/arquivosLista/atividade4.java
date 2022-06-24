package arquivosLista;
import java.io.*;
import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		//peguei o diretorio do arquivo
		String localArq = "C:\\temp\\atividade.txt";
		File arq = new File(localArq);

		try {
			Scanner ent = new Scanner(arq);
			String linha="";
			int quant= 0;
			//percorri as linhas
			while(ent.hasNextLine()) {
				//salvar o conteudo das linhas na varivel
				linha=ent.nextLine();
				//imprimir 
				System.out.println(linha);
				//somar quando tiver uma linha
				quant++;
			}
			//imprimir a soma das linhas
			System.out.println(quant);
			ent.close();
		}
		catch (IOException e){
			System.out.println("Erro");
			e.printStackTrace();
		}
	}

}
