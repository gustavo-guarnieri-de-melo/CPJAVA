package entrada_saida_processamento;

import java.util.Scanner;

public class Ex41F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,i,a=0;
		
		System.out.printf("Digite um valor positivo menor que 100: ");
		n=ler.nextInt();
		while(n<=0 || n>100) {
			System.out.printf("Valor invalido!");
			System.out.printf("\nDigite um valor positivo menor que 100: ");
			n=ler.nextInt();
		}
		
		for(i=0;i<=n;i++) {
			if(i==0) {
				a=((i+1)*(i+1))+1;
			}else {
				a=a+((i+1)*(i+1))+1;
				System.out.printf("\nO %dº valor é:%d",i,a);
			}
		}

	}

}