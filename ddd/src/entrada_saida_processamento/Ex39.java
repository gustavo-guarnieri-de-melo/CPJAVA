package entrada_processamento_saida;

public class Ex39 {

	public static void main(String[] args) {

		int a=0,b=1,c=1,i;
		
		for(i=1;i<=30;i++) {
			c=b+a;
		    a=b;
		    b=c;
		    System.out.printf("\n%d.º: %d",i,c);
		}
		
	}

}