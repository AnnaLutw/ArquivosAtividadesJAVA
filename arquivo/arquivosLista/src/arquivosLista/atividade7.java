package arquivosLista;

import java.io.*;
import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {

		try {
			Scanner ent = new Scanner(System.in);
			int valor=0;
			//pedir o valor de n
			System.out.println("Digite valor de N");
			valor=ent.nextInt();
			//criei o vetor de char para as letras digitadas
			char[] vogais = new char[valor];
			String linha="";
			//coloquei o diretorio do novo arquivo
			File lol = new File("C:\\temp\\vogal.txt");
			FileWriter arq= new FileWriter(lol);
			Scanner novo=new Scanner(lol);
			int todas=0;
			//mandei todas as letras digitadas para o arquivo
			for(int i=0;i<valor;i++) {
				System.out.println("Digite uma letra ");
				vogais[i]= ent.next().charAt(0);
				arq.write(vogais[i]);
			}
			arq.close();
			//passando pelas linhas do arquivo e salvando na variavel e imprimindo
			while(novo.hasNextLine()) {
				linha=novo.nextLine();
				System.out.println(linha);
				//passar por cada e letra e verificar se é uma vogal
				for(int i=0;i<linha.length();i++) {
					if(linha.charAt(i)=='a'||linha.charAt(i)=='e'||linha.charAt(i)=='i'||linha.charAt(i)=='o'||linha.charAt(i)=='u') {
						//se for vogal soma
						todas++;
					}
				}
			}
			//imprimi a soma das vogais
			System.out.println("Soma de vogais é:\n" + todas);
			novo.close();
			ent.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
