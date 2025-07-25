package br.com.appCursos.view;

import java.util.Scanner;

public class Menus {
    static Scanner input = new Scanner(System.in);

    public static int menuPrincipal() {
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("|                    SISTEMA DE CURSOS                         |");
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("|  O que você deseja fazer?                                    |");
        System.out.println("|                                                              |");
        System.out.println("|  1 - Inserir curso                                           |");
        System.out.println("|  2 - Ver cursos                                              |");
        System.out.println("|  3 - Remover curso                                           |");
        System.out.println("|  4 - Editar curso                                            |");
        System.out.println("|  5 - Solicitar relatório de cursos                           |");
        System.out.println("|  6 - Iniciar compras                                         |");
        System.out.println("|  7 - Sair do programa                                        |");
        System.out.println("+--------------------------------------------------------------+");
        System.out.print("  Digite sua escolha: ");
        int escolha = input.nextInt();
        input.nextLine();
        if (escolha < 1 || escolha > 7) {
            System.out.println("\nOpção inválida, escolha um número de 1 a 7.");
            return menuPrincipal();
        }
        System.out.println();
        return escolha;
    }
}