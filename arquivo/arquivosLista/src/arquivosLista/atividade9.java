package arquivosLista;

import java.io.*;
import java.util.Scanner;

public class atividade9 {

	public static void main(String[] args){
		   Scanner ent = new Scanner (System.in);
		    try{
		    	//selecionei o arquivo
		        File file = new File("C:\\temp\\ativi9.txt");
		        FileWriter fw = new FileWriter(file);
		        Scanner arq = new Scanner(file);

		        char opc=' ';
		        String matricula,tel;
		        int aluno=1;
		        
		        while(opc !='p'){
		        	//pedir numero de matricula
		            System.out.print("Digite o seu número de matrícula: ");
		            matricula = ent.nextLine();
		            //pedir numero de telefone
		            System.out.print("Digite o seu número de telefone: ");
		            tel = ent.nextLine();
		            //slvar no arquivo
		            fw.write("Aluno "+aluno++ + "\n");            
		            fw.write("Matricula: "+ matricula+ "\n");
		            fw.write("Telefone: "+ tel+ "\n");
		            //continuar digitando ou parar
		            System.out.println("Para digitar os dados do proximo aluno digite C e para parar digite P");
		            opc = ent.next().charAt(0);
		            ent.nextLine();
		        }
		        fw.close();
		        String texto="";
		        //ler o arquivo
		        System.out.println("Ler arquivo? S - N");
		        opc = ent.next().charAt(0);
		        // se ss, mostrar texto
		        if(opc=='s'){
		            while(arq.hasNextLine()){
		            texto = arq.nextLine();
		            System.out.println(texto);
		            }
		        }
		        arq.close();

		    }catch(IOException var){
		        var.printStackTrace();
		        System.out.println("Deu erro");
		    }

		   ent.close();
		   }
}