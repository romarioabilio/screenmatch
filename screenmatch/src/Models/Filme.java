package Models;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;



public void exibiFichaTecnica(){
    System.out.println("Nome do filme: " + getNome());
    System.out.println("Ano de lançamento: " +getAnoDeLancamento());
    System.out.println("Soma de Avaliações: " +getSomaDasAvaliacoes());
    System.out.println("Incluido no plano ? "+getIncluidoNoPlano());
    System.out.println("Total de avaliações: " +getTotalDeAvaliacoes());
    System.out.println("Duração do filme: " +getDuracaoEmMinutos()+" minutos");
    System.out.println("Média de avaliações: "+getMediaDasAvaliacoes());
}


//PEGA O NOME
public String getNome(){
    return nome;
}
//MODIFICA O NOME
public void setNome(String nome){
    this.nome = nome ;
}


//PEGA O ANO DE LANÇAMENTO
public int getAnoDeLancamento(){
    return anoDeLancamento;
}
//MODIFICA O ANO DE LANÇAMENTO
public void setAnoDeLancamento(int anoDeLancamento){
    this.anoDeLancamento = anoDeLancamento;
}


//PEGA A SOMA DE TODAS AVALIAÇÕES
public double getSomaDasAvaliacoes(){
    return somaDasAvaliacoes;
}



//PEGA SE O FILME ESTÁ INCLUIDO NO PLANO MENSAL
public boolean getIncluidoNoPlano(){
    return incluidoNoPlano;
}
//MODIFICA A INCLUSÃO NO PLANO MENSAL
public void setIncluidoNoPlano(boolean incluidoNoPlano){
    this.incluidoNoPlano = incluidoNoPlano;
}


//PEGA O TOTAL DE AVALIAÇOES
public int getTotalDeAvaliacoes(){
    return totalDeAvaliacoes;
}



//PEGA A DURAÇÃO DO FILME
public int getDuracaoEmMinutos(){
    return duracaoEmMinutos;
}
//MODIFICA A DURAÇÃO DO FILME
public void setDuracaoEmMinutos(int duracaoEmMinutos){
    this.duracaoEmMinutos = duracaoEmMinutos;
}


//DA UMA NOTA PRA O FILME
public void avalia(double nota){
    this.somaDasAvaliacoes += nota;
    this.totalDeAvaliacoes ++;
} 

//PEGA A MEDIA DE TODAS AVALIAÇÕES
public double getMediaDasAvaliacoes(){
    return this.somaDasAvaliacoes / this.totalDeAvaliacoes;

}





}