package com.mycompany.cadastrolivros;

import java.util.Scanner;

public class Livro {
    public static void main(String args[]){
        Dados objDados=new Dados();
        Scanner ler=new Scanner(System.in);
        int opcao=0;
        while (opcao!=3){
        System.out.println("Escolha uma opcao (Numero): ");
        System.out.println("1- Cadastrar livro;");
        System.out.println("2- Exibir dados do livro;");
        System.out.println("3- Sair;");
        opcao=ler.nextInt();
        
        String titulo=" ";
        String autor=" ";
        String isbn=" ";
        int paginas=0;
        double valor=0;
        
        switch(opcao){
            
            case 1:
                ler.nextLine();
                System.out.println("Digite o titulo: ");
                titulo= ler.nextLine();
                
                System.out.println("Digite o autor: ");
                autor=ler.nextLine();
                
                System.out.println("Digite o valor do ISBN: ");
                isbn= ler.next();
                
                ler.nextLine();
                
                System.out.println("Digite o numero de paginas: ");
                paginas=ler.nextInt();
                
                System.out.println("Digite o preco do livro: ");
                valor=ler.nextDouble();
                
                objDados.setAtributos(titulo, autor, isbn, paginas, valor);
                break;
                
            case 2:
                objDados.exibirDados();
                break;
                
            case 3:
                System.out.println("Ate a proxima!");
                break;
        }
      }
    }
}
