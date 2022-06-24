package arquivosLista;

import java.io.*;
import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {

		try {
			Scanner ent = new Scanner(System.in);
			//coloqueio diretorio do novo arquivo
			String loc = "C:\\temp\\divisao.txt";
			FileWriter novo = new FileWriter(loc, false);
			double digite=0;
			//pedir para digitar o numero
			System.out.println("Digite um numero");
			digite=ent.nextDouble();
			int soma=0;
			//passar pelo numero digitado
		for(int i=0;i<digite;i++) {
			//se o numero for divisivel printar na tela
			if(digite %i==0) {
				System.out.println(i);
				//somar quando for divisivil e salvar na variavel soma
				soma+=i;
			}
		}
		//trocar de int para string
			String muda= Integer.toString(soma);
			//mandar para o  arquivo
			novo.write(muda);
			ent.close();
			novo.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
