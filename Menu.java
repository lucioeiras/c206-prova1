import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {
    Faculdade faculdade = new Faculdade();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual o nome da faculdade?");
    faculdade.nome = scanner.nextLine();

    System.out.println("Qual o CNPJ?");
    faculdade.CNPJ = scanner.nextLine();

    System.out.println("Qual o nome do curso?");
    faculdade.curso.nome = scanner.nextLine();

    System.out.println("Qual a sigla?");
    faculdade.curso.sigla = scanner.nextLine();

    System.out.println("======== MENU ========");
    System.out.println("1) Adicionar aluno");
    System.out.println("2) Mostrar informações");
    System.out.println("3) Alunos acima da P5");
    System.out.println("4) Média de aprovação");
    System.out.println("5) SAIR");

    int option = scanner.nextInt();

    while (option != 5){
      switch (option) {
        case 1:
          String nome = scanner.nextLine();
          String matricula = scanner.nextLine();
  
          int idade = scanner.nextInt();
          int periodo = scanner.nextInt();
  
          boolean aprovado = scanner.nextBoolean();
  
          faculdade.addAluno(
            new Aluno(nome, matricula, idade, periodo, aprovado));
        break;
  
        case 2:
          faculdade.mostraInfo();
        break;
  
        case 3:
          System.out.println(faculdade.alunoSuperiorP5());
        break;
  
        case 4:
          System.out.println(faculdade.mediaAprovacao());
        break;
      }

      System.out.println("======== MENU ========");
      System.out.println("1) Adicionar aluno");
      System.out.println("2) Mostrar informações");
      System.out.println("3) Alunos acima da P5");
      System.out.println("4) Média de aprovação");
      System.out.println("5) SAIR");

      option = scanner.nextInt();
    }

    scanner.close();
  }
}