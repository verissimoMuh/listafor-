import java.util.Scanner;
public class SexoPessoa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int continuar, peso;
		double altura, pesoIdeal=0;
	    String s;
		do {

			     System.out.println("informe o seu sexo? f para feminino e M para masculino");
			     s=in.next();
			     System.out.println("informe seu peso em kg:");
			     peso=in.nextInt();
			     if(s.equalsIgnoreCase("m")) {
			    	 System.out.println("informe sua altura em centimetros:");
			    	 altura=in.nextDouble();
			    	 pesoIdeal=52+(0.75*(altura-152.4));
			     }else {	 
			    	 System.out.println("informe sua altura em centimetros:");
			    	 altura=in.nextDouble();
			    	 pesoIdeal=52+(0.67*(altura-152.4));
			     }
          System.out.println("O peso ideal é "+pesoIdeal+" , procure uma academia");
          System.out.println("Deseja continuar a execução? (1 para sim e 2 para Não):");
          continuar=in.nextInt();
		} while(continuar==1);
		System.out.println("Programa Encerrado");
	}
}