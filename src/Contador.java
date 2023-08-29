import ParametrosInvalidosException.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        if (numero1 > numero2) {
            try {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        for (int i = numero1; i <= numero2; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
