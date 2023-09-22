import java.util.Scanner;
public class ano {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int anoAtual, anoNascimento, idade;
	System.out.println("Informe o ano atual");
	anoAtual=in.nextInt();
	 
   int 	idadeMaisVelho = Integer.MIN_VALUE;
   int idadeMaisNovo = Integer.MIN_VALUE;
	for(int i=1;i<=10; i++) {
		System.out.println("Informe o ano de nascimento do usuario" +i+ ":");
		anoNascimento=in.nextInt();
        idade= anoAtual-anoNascimento;
        if (idade< idadeMaisVelho) {
        	idadeMaisVelho=idade;
        }if (idade<idadeMaisNovo) {
        	idadeMaisNovo=idade;
        }
				System.out.println("Idade do usuario é " +idade);
	
	}
	System.out.println("A idade do mais velho é"+idadeMaisVelho);
    System.out.println("A idade do mais novo é " +idadeMaisNovo);
	
}
}
