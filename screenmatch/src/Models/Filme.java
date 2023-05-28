package Models;
public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


void exibiFichaTecnica(){
    System.out.println("Nome do filme: " + this.nome);
    System.out.println("Ano de lançamento: " + this.anoDeLancamento);
    System.out.println("Avaliação: " +this.somaDasAvaliacoes);
    System.out.println("Incluido no plano ? "+ this.incluidoNoPlano);
    System.out.println("Total de avaliações: " + this.totalDeAvaliacoes);
    System.out.println("Duração do filme: " + this.duracaoEmMinutos+" minutos");
}

void avalia(double nota){
    this.somaDasAvaliacoes += nota;
    this.totalDeAvaliacoes ++;
    System.out.println(somaDasAvaliacoes);
    System.out.println(totalDeAvaliacoes);
} 






}