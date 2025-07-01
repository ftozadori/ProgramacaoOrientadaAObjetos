package Faculdade.SistemaGerenciamentoAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEscola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n==== MENU PRINCIPAL ====");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Listar Todos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Idade do aluno: ");
                    int idadeAluno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Nota 1: ");
                    double n1 = scanner.nextDouble();
                    System.out.print("Nota 2: ");
                    double n2 = scanner.nextDouble();
                    scanner.nextLine();
                    Aluno aluno = new Aluno(nomeAluno, idadeAluno, matricula, n1, n2);
                    pessoas.add(aluno);
                    System.out.println("✅ Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do professor: ");
                    String nomeProf = scanner.nextLine();
                    System.out.print("Idade do professor: ");
                    int idadeProf = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Disciplina: ");
                    String disciplina = scanner.nextLine();
                    Professor prof = new Professor(nomeProf, idadeProf, disciplina);
                    pessoas.add(prof);
                    System.out.println("✅ Professor cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n📋 Lista de Pessoas Cadastradas:");
                    for (Pessoa p : pessoas) {
                        System.out.println("----------------------------");
                        p.exibirInformacoes(); // POLIMORFISMO
                    }
                    break;

                case 4:
                    System.out.println("Saindo... 👋");
                    break;

                default:
                    System.out.println("⚠️ Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}