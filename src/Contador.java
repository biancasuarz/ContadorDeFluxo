import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        try {
            if (numero1 > numero2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            int quantidadeInteracoes = numero2 - numero1 + 1;

            for (int i = 1; i <= quantidadeInteracoes; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}





