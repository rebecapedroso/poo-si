package si.modelo.Carro;

public class Carro {

	
		public String modelo;
		public String cor;
		public int ano;
		public int velocidade;
		
		
		
		public Carro() {
			this.modelo = "Celta";
			this.cor = "preto";
			this.modelo = "Fusca";
			this.velocidade = 0;
			this.ano = 2000;
			
		}
		
		
		
		
		
		
		public void acelerar() {
			this.velocidade += 10;
		}
		
		
		public void buzinar() {			
			System.out.println("Fon fon");
		}
		
		
		public void frear() {
			this.velocidade -= 10;
			
		}
		
		public void darPartida() {
			System.out.println("O carro ligou!!!");
			
		}
		
		public void desligar() {
			System.out.println("O carro desligou!!");
			this.velocidade = 0;
			
		}
		
		public String marca;
	}

