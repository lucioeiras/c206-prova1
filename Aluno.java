public class Aluno {
  String nome;
  int idade;
  String matricula;
  int periodo;
  boolean aprovado;

  public void mostraInfo() {
    System.out.println("Aluno: " + this.nome); 
    System.out.println("Matricula: " + this.matricula);
    System.out.println("Idade: " + this.idade); 
    System.out.println("Periodo: " + this.periodo); 
    System.out.println("Foi aprovado: " + (this.aprovado ? "Sim" : "Não"));
  }
}
