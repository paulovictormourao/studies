package user;

import java.util.Scanner;

// Verifca se um Numero digitado é um inteiro, e faz partes das possiveis opções
public class Verifies {

    public static int verify(int numberOfPossibilities){
        boolean looping;
        int[] possibilities = new int[numberOfPossibilities];
        Scanner input = new Scanner(System.in);
        int choice = 0;

        // Preenche um vetor de possibilidades de 0 a N
        for (int i = 0; i < numberOfPossibilities; i++){
            possibilities[i] = i;
        }

        // Verifca se o valor de entrada é um inteiro, e faz partes das possiveis opções
        //se não for, repita.
        do{
            try {
                choice = input.nextInt();
                if (isInVector(choice, possibilities)) {
                    looping = false;
                }

                else {
                    System.out.println("Digite um valor valido");
                    looping = true;
                }

            }

            catch (IllegalArgumentException e) {
                System.out.printf("%s\n Digite um valor valido!!\n", e.getMessage());
                looping = true;
            }

        }while (looping);

        return choice;
    }

    public static boolean isInVector(int value, int[] vector){
        for (int num: vector){
            if (value == num){
                return true;
            }
        }

        return false;
    }
}
