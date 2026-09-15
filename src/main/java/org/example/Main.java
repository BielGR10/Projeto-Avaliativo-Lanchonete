package org.example;
import java.util.Scanner;


public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);

        char inicio;
        String nomeCliente, nomeMaior;
        float valorCompra = 0 , totalRelatorio = 0, maiorValor = 0, menorValor = 999999999, valorMedio = 0;
        int continuarAcao = 0, quantidadeCompras = 0, acimaCinquenta = 0;

        System.out.println("Bem vindo ao sistema de Registro de pedidos!");
        System.out.println("Deseja começar a registrar os pedidos dos clientes?[S/N]");
        inicio = input.next().charAt(0);

        if (inicio == 's' || inicio == 'S'){
            do {
                System.out.println("Qual o nome do cliente?");
                input.nextLine();
                nomeCliente = input.nextLine();

                do{
                System.out.print("Qual o valor da compra?\nR$");
                valorCompra = input.nextFloat();
                if (valorCompra == 0) {
                    System.out.println("Valor invalido. Coloque outro valor.");

                }
                if (valorCompra > 50){
                    acimaCinquenta++;
                }
                    if(valorCompra > maiorValor){
                        maiorValor = valorCompra;
                    }

                    if(menorValor > valorCompra){
                        menorValor = valorCompra;
                    }
                }while(valorCompra == 0);



                totalRelatorio += valorCompra;

                System.out.println("\nNome do cliente: "+nomeCliente);
                System.out.println("Valor da compra: R$"+valorCompra);
                quantidadeCompras++;

                do{
                System.out.println("Deseja cadastrar outro pedido?\n1 - Sim\n2 - Não\n");
                continuarAcao = input.nextInt();
                if (continuarAcao != 1 && continuarAcao != 2){
                    System.out.println("Opção inválida. Tente novamente");
                }}while (continuarAcao != 1 && continuarAcao != 2);
            }while(continuarAcao == 1);

            valorMedio = totalRelatorio / quantidadeCompras;

            System.out.println("RELATÓRIO DE COMPRAS");
            System.out.println("\nQuantidade de pedidos: "+quantidadeCompras);
            System.out.println("Valor total vendido: R$"+totalRelatorio);
            System.out.println("Valor médio de pedidos: "+valorMedio);
            System.out.println("Maior compra: R$"+maiorValor);
            System.out.println("Menor compra: R$"+menorValor);
            System.out.println("Compras acima de R$50: "+acimaCinquenta);

            float restoMeta = totalRelatorio - 500;
            if (totalRelatorio >= 500){
                System.out.println("Meta atingida! Parabéns!");
            }else{
                System.out.println("Faltaram apenas R$"+restoMeta+" para a meta.");
            }

        }
    }
}
