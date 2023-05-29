package Models;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;



void exibiFichaTecnica(){
    System.out.println("Nome do filme: " + getNome());
    System.out.println("Ano de lançamento: " +getAnoDeLancamento());
    System.out.println("Soma de Avaliações: " +getSomaDasAvaliacoes());
    System.out.println("Incluido no plano ? "+getIncluidoNoPlano());
    System.out.println("Total de avaliações: " +getTotalDeAvaliacoes());
    System.out.println("Duração do filme: " +getDuracaoEmMinutos()+" minutos");
    System.out.println("Média de avaliações: "+getMediaDasAvaliacoes());
}


//PEGA O NOME
String getNome(){
    return nome;
}
//MODIFICA O NOME
void setNome(String nome){
    this.nome = nome ;
}


//PEGA O ANO DE LANÇAMENTO
int getAnoDeLancamento(){
    return anoDeLancamento;
}
//MODIFICA O ANO DE LANÇAMENTO
void setAnoDeLancamento(int anoDeLancamento){
    this.anoDeLancamento = anoDeLancamento;
}


//PEGA A SOMA DE TODAS AVALIAÇÕES
double getSomaDasAvaliacoes(){
    return somaDasAvaliacoes;
}



//PEGA SE O FILME ESTÁ INCLUIDO NO PLANO MENSAL
boolean getIncluidoNoPlano(){
    return incluidoNoPlano;
}
//MODIFICA A INCLUSÃO NO PLANO MENSAL
void setIncluidoNoPlano(boolean incluidoNoPlano){
    this.incluidoNoPlano = incluidoNoPlano;
}


//PEGA O TOTAL DE AVALIAÇOES
int getTotalDeAvaliacoes(){
    return totalDeAvaliacoes;
}



//PEGA A DURAÇÃO DO FILME
int getDuracaoEmMinutos(){
    return duracaoEmMinutos;
}
//MODIFICA A DURAÇÃO DO FILME
void setDuracaoEmMinutos(int duracaoEmMinutos){
    this.duracaoEmMinutos = duracaoEmMinutos;
}


//DA UMA NOTA PRA O FILME
void avalia(double nota){
    this.somaDasAvaliacoes += nota;
    this.totalDeAvaliacoes ++;
} 

//PEGA A MEDIA DE TODAS AVALIAÇÕES
double getMediaDasAvaliacoes(){
    return this.somaDasAvaliacoes / this.totalDeAvaliacoes;

}





}