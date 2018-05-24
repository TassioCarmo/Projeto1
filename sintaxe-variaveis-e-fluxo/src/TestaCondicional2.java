
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadeDePessoas = 3;
		// boolean acompanhado = quantidadeDePessoas>=2 ;

		boolean acompanhado;
		if (acompanhado = quantidadeDePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18 || quantidadeDePessoas >= 2) {
			System.out.println("Seja Bem vindo");
		} else {
			System.out.println("voce não tem 18 não pode entrar");
		}

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem vindo");
		} else {
			System.out.println("voce não tem 18 não pode entrar");
		}

		System.out.println("Valor de acompanhado é:" + acompanhado);
	}

}
