
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadeDePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voce � maior de 18");
			System.out.println("Seja Bem vindo");
		} else {
			if (quantidadeDePessoas >= 2) {
				System.out.println("Voce n�o 18, mas pode entrar," + "pois esta acompanhado");
			} else {
				System.out.println("voce n�o tem 18 n�o pode entrar");
			}
		}
	}
}
