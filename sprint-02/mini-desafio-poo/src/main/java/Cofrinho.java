import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {

		String meta;
		Double saldo = 0.0;
		Boolean quebrado = false;

		void deposito(Double valor) {
			if(!quebrado && valor > 0.0) {
				saldo += valor;
			} else {
				System.out.println("Erro no deposito!");
			}
		}

		Double agitar() {
			if(!quebrado) {
				Double sorteado = ThreadLocalRandom.current().nextDouble(0, saldo);
				saldo -= sorteado;
				return sorteado;
			}

			return null;
		}

		Double quebrar(){
			if(!quebrado) {
				System.out.println("Você quebrou o cofrinho: %s".formatted(meta));
				saldo = 0.0;
				quebrado = true;
				return saldo;
			}
			System.out.println("O cofrinho %s já esta quebrado!".formatted(meta));
			return null;
		}

	}
