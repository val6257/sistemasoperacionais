package exercicio;

import java.util.Random;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        int numProcessos, opcao = 0, tipoAlgoritmo;
        Scanner entrada = new Scanner(System.in);

        Random gerador = new Random();

        System.out.println("Digite o número de processos: ");
        numProcessos = entrada.nextInt();

        int tempoExecucao[] = new int[numProcessos];
        int tempoChegadaProcesso[] = new int[numProcessos];

        if (numProcessos != 0) {
            System.out.println("----- Opções ----- ");
            System.out.println("1) Atribuição Automática");
            System.out.println("2) Atribuição Manual");
            opcao = entrada.nextInt();
        } else {
            System.out.println("Tchau!");
        }

        if (opcao == 1) {
            for (int i = 0; i < tempoExecucao.length; i++) {
                if (i != 0) {
                    tempoExecucao[i] = tempoExecucao[i - 1] + gerador.nextInt(4);
                    tempoChegadaProcesso[i] = tempoChegadaProcesso[i - 1] + gerador.nextInt(4);
                } else {
                    tempoExecucao[i] = gerador.nextInt(4);
                    tempoChegadaProcesso[i] = gerador.nextInt(4);
                }
            }
            System.out.println("Tempo de execução populado automaticamente!");
        } else { // opcao == 2
            for (int i = 0; i < tempoExecucao.length; i++) {
                System.out.println("Digite o tempo de execução do processo ( p" + (i + 1) + " ) :");
                tempoExecucao[i] = entrada.nextInt();

                /*System.out.println("Tempo de chegada do processo (" + (i + 1) + " ) :");
                tempoChegadaProcesso[i] = entrada.nextInt();*/
            }
        }

        for (int i = 0; i < tempoExecucao.length; i++) {
            System.out.println(tempoExecucao[i]);
        }

        System.out.println("***** ESCOLHA O TIPO DE ALGORITMO *****");
        System.out.println("1) FCFS");
        System.out.println("2) SJF");
        System.out.println("3) SJF P");
        System.out.println("4) ROBIN");
        System.out.println("5) PRIORIDADE");
        System.out.println("6) PRIORIDADE P");
        System.out.println("7) SAIR");
        tipoAlgoritmo = entrada.nextInt();
        System.out.println();

        do {
            switch (tipoAlgoritmo) {
                case 1:
                    System.out.println("1) FCFS");
                    fcfs(tempoExecucao, numProcessos);
                    break;
                case 2:
                    System.out.println("2) SJF");
                    break;
                case 3:
                    System.out.println("3) SJF P");
                    break;
                case 4:
                    System.out.println("4) ROBIN");
                    break;
                case 5:
                    System.out.println("5) PRIORIDADE");
                    break;
                case 6:
                    System.out.println("6) PRIORIDADE P");
                    break;
                case 7:
                    System.out.println("7) SAIR");
                    break;
                default:
                    System.out.println("Algoritmo inválido, tente outra opção!");
                    break;
            }

        } while (tipoAlgoritmo != 7);
    }

    public static void fcfs(int tempoExecucao[], int numProcessos) {
        int tempoExecucaoFcfs[] = tempoExecucao.clone();
        int numProcessosFcfs = numProcessos;
        System.out.println(numProcessosFcfs);

        int tempoRestante[] = new int[numProcessosFcfs];

        int execucao = 0;
        System.out.println("Resultado: ");
        for (int i = 0; i < tempoRestante.length; i++) {
            if (i != 0) {
                execucao = execucao + tempoExecucaoFcfs[i - 1];
                System.out.println("-------------------");
                System.out.println("ID: p" + (i + 1) + " EXECUÇÃO : " + tempoExecucaoFcfs[i] + " ESPERA : " + execucao + " PRIORIDADE 0");
            } else {
                System.out.println("-------------------");
                System.out.println("ID: p" + (i + 1) + " EXECUÇÃO : " + tempoExecucaoFcfs[i] + " ESPERA : " + execucao + " PRIORIDADE 0");
            }
        }

        int somaTempoExecucao = 0;

        for (int i = 0; i < tempoRestante.length; i++) {
            somaTempoExecucao = somaTempoExecucao + tempoExecucaoFcfs[i];
        }

        for (int i = 0; i < somaTempoExecucao; i++) {
            for (int y = 0; y < tempoRestante.length; y++) {
                System.out.println(i + " : p" + (y));
            }
        }

    }

}
