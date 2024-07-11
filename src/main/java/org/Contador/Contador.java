package org.Contador;

import java.io.OutputStream;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parametro");
        int parametroDois =  scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw  new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;

        for (int i = parametroUm; i < parametroDois; i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }
}
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
