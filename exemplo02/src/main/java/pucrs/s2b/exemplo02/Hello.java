package pucrs.s2b.exemplo02;
 
public class Hello {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int r = somar(a, b);
		if (r == 50)
			System.out.println("Sucesso");
		else
			System.out.println("FALHA!");			
	}

	public static int somar(int a, int b) {
		int r = a + b;
		return r;
	}
	
}
