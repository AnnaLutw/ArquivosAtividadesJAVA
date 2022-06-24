package arquivosLista;

import java.io.*;

public class atividade1 {

	public static void main(String[] args) {
		//coloquei o diretorio
		String NomeArq = "C:\\temp\\atividade.txt";
		//try se tiver algum erro
	    try{
	    	//criei o arquivo
	    FileWriter arq = new FileWriter(NomeArq, false);
	    //printei os 10 numeros no arquivo
		arq.write("1 \n");
		arq.write("2 \n");
		arq.write("3 \n");
		arq.write("4 \n");
		arq.write("5 \n");
		arq.write("6 \n");
		arq.write("7 \n");
		arq.write("8 \n");
		arq.write("9 \n");
		arq.write("10 \n");

	    arq.close();
	    }
	    catch (IOException e){
	      System.out.println("Erro");
	      e.printStackTrace();
	    }
	}	
}