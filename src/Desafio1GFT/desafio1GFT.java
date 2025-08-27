package Desafio1GFT;

import java.util.Scanner;

public class desafio1GFT {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Informe um numero: ");
            int numero = sc.nextInt();
            while (numero >= 10) {
                int soma = 0;
                while (numero > 0) {
                    int digito = numero % 10;
                    soma += digito;
                    numero = numero / 10;
                }
                numero = soma;
            }

            System.out.println("Resultado final: " + numero);
            sc.close();
        }
    }
