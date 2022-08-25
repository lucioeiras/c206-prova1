public class Aluno {
  String nome;
  int idade;
  String matricula;
  int periodo;
  boolean aprovado;

  public Aluno(
    String nome, 
    String matricula, 
    int idade, 
    int periodo, 
    boolean aprovado
  ) {
    this.nome = nome;
    this.matricula = matricula;
    this.idade = idade;
    this.periodo = periodo;
    this.aprovado = aprovado;
  }

  public void mostraInfo() {
    System.out.println("Nome: " + this.nome); 
    System.out.println("Matricula: " + this.matricula);
    System.out.println("Idade: " + this.idade); 
    System.out.println("Periodo: " + this.periodo); 
    System.out.println("Foi aprovado: " + (this.aprovado ? "Sim" : "Não"));
  }
}
