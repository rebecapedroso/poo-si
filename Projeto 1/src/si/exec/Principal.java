package si.exec;
import si.modelo.Carro.Carro;

public class Principal {

	


		public static void main(String[] args) {
			
			Carro meuCarro = new Carro();
			meuCarro.darPartida();
			meuCarro.buzinar();
			meuCarro.acelerar();
			meuCarro.acelerar();
			System.out.println(meuCarro.velocidade);
			meuCarro.frear();
			System.out.println(meuCarro.velocidade);
			
			Carro outrocarro = new Carro();
			for (int i = 0; i<100; i++) {
				outrocarro.acelerar ();
				
			}
			
			meuCarro.acelerar();
			System.out.println("velocidade do meu carro " +meuCarro.velocidade);
			System.out.println("velocidade do outro carro " +outrocarro.velocidade);
		
			
			Carro c1 = new Carro();
			System.out.println("ano "+c1.ano+ " cor "+c1.cor+ " velocidade " +c1.velocidade);
		}

		
		
	}










	

