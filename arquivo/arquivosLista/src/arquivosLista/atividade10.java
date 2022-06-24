package arquivosLista;

import java.io.*;
import java.util.Scanner;

public class atividade10 {

	public static void main(String[] args){
		   
		   try {
		    Scanner ent = new Scanner(System.in);
		    float l;
		    int n;
		    System.out.println("Digite a quantidade de floats a ser digitados:");
		    //Quantidade n de floats
		    n = ent.nextInt();
		    FileWriter arq = new FileWriter("C:\\temp\\ativi10.txt", true);
		    System.out.println("Digite os floats:");
		    for(int i=0;i<n;i++) {
		        l = ent.nextFloat();
		        //gravei os floats
		        arq.write(l + "\n");
		        //salvei os floats
		    }
		    arq.close();
		    ent.close();
		}
		catch (IOException e) {
		    System.out.println("Inválido.");
		}

		File arq =  new File("C:\\temp\\ativi10.txt");
		//chamei o arquivo
		try {
		    String i;
		    float som,comp=0,comp1 = 999999999,medtotal = 0,medmm,vt=0;
		    Scanner ent1 = new Scanner(arq);
		    //Scanner para ler o arquivo
		    while(ent1.hasNextLine()) {
		    //ler o arquivo linha por linha
		        i = ent1.nextLine();
		        som = Float.parseFloat(i);	
		        if(som>comp) {	//Definir o maior float
		            comp = som;
		        }
		        if(som<comp1) {	//Definir o menor float
		            comp1 = som;
		        }
		        medtotal+=som;	//somar todos os floats
		        vt++;	//quantidade de floats
		    }
		    medtotal /= vt;	//calcular a media total
		    medmm = comp+comp1;	//calcular a media entre o maior e o menor float
		    medmm /= 2;	//calcular a media entre o maior e o menor float	
		    
		    System.out.println("O maior número é: " + comp);
		    System.out.println("O menor número é: " + comp1);
		    System.out.println("A media total de todos os floats é: " + medtotal);
		    System.out.println("A media total do maior e do menor float é: " + medmm);
		    ent1.close();
		}
		catch (IOException e) {
		    System.out.println("Inválido.");
		}
	}
}