import java.util.Scanner;

public class Principal {
	public static Scanner in = new Scanner (System.in); 

	
	public static void main(String[] args) {
		
	System.out.println("Escolha uma letra");
		String s = in.next();
		
				switch(s) {
				case "a":
					System.out.println("O número maior é "+maior(15,9));
					break;
				
				case"b":
					System.out.println("O menor número é "+menor(3,1));
					break;
				
				case"c":
					System.out.println("Meu nome é "+nome());
					break;

				case"d":
					vazio();
					break;
				
				case"e":
					System.out.println(nota(7,10));
					break;
				
				case"f":
					System.out.println("O fatorial é "+fat(5));
					break;
					
				case"g":
					System.out.println(primo(4));
					break;
					
				case"h":	
 				int k = 5;
				if(nota(6,6)){			
					System.out.println("Conceito A");
				}else {
			
				if(media1(6,6) >= 4 && media1(6,6) < 7 ) {
				if((media1(6,6)+ k)/2 >= 5) {
					System.out.println("Conceito B");
					
				}else {
					System.out.println("Reprovado");
				}	
			}
			}	
				break;
				
				case "i":
					calculadora();
					break;
					
				case "j":
					safadao(6,5,1998);
					break;
						
				case"k":
					System.out.println(cores(2,1));
					break;
				}	
				
			
}
	
	
	
//Letra a
	public static int maior (int a, int b ) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
		
	}
	
	
//Letra b
	public static int menor (int a, int b) {
		if(a<b) {
			return a;
		}else {
			return b;
		}
	}
	
	
//Letra c
	public static String nome() {
		return "Rebeca";
	}

	
//Letra d	
	public static void vazio() {
		for(int i = 0; i<100; i++) {
			if(i%2 == 0) {
				System.out.println("Rebeca");
			}else {
				System.out.println("Silva");
			}
		}
	}

	
//Letra e
	public static boolean nota(int a, int b) {
		if(((a+b)/2)>=7) {
			return true;
		}else {
			return false;
		}
	}

	
//Letra f	


	public static int fat (int a) {
		for(int i=a; i>1; i--) {
			a=a*(i-1);}
		return a;
		}
	
	
//Letra g
	
	public static boolean primo(int a) {
		int b = 0;
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				b = b+1;
			}
		} 
		if(b==0) {
			System.out.println("Número é primo: ");
			return true;
		}else {
			System.out.println("Número é primo: ");
			return false;
		} 
	}
	
	
//Letra h
	public static int media1(int a, int b) {
		int media = ((a+b)/2);
		return media;
	}
	
	
	
//Letra i
	
	public static void calculadora() {
		System.out.println("CALCULADORA");
		System.out.println("OPERAÇÕES");
		System.out.println("SOMAR: +");
		System.out.println("SOBTRAIR: -");
		System.out.println("DIVIDIR: /");
		System.out.println("MULTIPLICAR: *");
		
		
		System.out.println("DIGITE O PRIMEIRO NÚMERO");
		int r = in.nextInt();
		System.out.println("DIGITE A OPERAÇÃO");
		String c = in.next();
		System.out.println("DIGITE O SEGUNDO NÚMERO");
		int p = in.nextInt();
		
		
		int resultado;
		if(c == "+" || c == "-" || c == "/" || c == "*") {
		
			switch(c) {
			case "+":
				resultado = r + p;
				System.out.println("="+resultado);
				break;
			case "-":
				resultado = r - p;
				System.out.println("="+resultado);
				break;
			case "/":
				resultado = r / p;
				System.out.println("="+resultado);
				break;
				
			case "*":
				resultado = r * p;
				System.out.println("="+resultado);
				break;
			}	
			}else {
				System.out.println("OPERAÇÃO INVALIDA");
			}
			
			}
			
			
		
	
	
	
	

	

//Letra j.1
	public static void safadao(int d, int m, int a) {
		float k = somatorio(m)+(a/100)*(50-d);
		System.out.println("safadeza ="+k);
		float b = (100 - k);
		System.out.println("anjo ="+b);
		
	}
	
		
	
	public static int somatorio (int m) {
		for(int i=m; i>=1; i--) {
			m = (m+(i-1));
		}return m;
	}
	
	
//Letra k

	public static String cores (int a, int b) {
		if(a%2 == 0 && b%2 == 0) {
			return "Azul";
		}
		if(a%2 != 0 && b%2 != 0) {
			return "Vermelho";
		}else {
			return "Amarelo";
		}
		
		
	}



}
	
	
	
	
	
	
	
	
	
	
	
	
	











