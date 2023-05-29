package Models;

import Models.CalculadoraTempoReal.Classificavel;

public class Episodios implements Classificavel {
    private String nome;
    private int numero;
    private Serie serie;
    private int totalVisualizacoes;


    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }
    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    
    @Override
    public int getClassificacao() {
       if(totalVisualizacoes >= 300){
            return 5;
       }
       else if(totalVisualizacoes >= 200 ){
            return 4 ;
       } 
       else if (totalVisualizacoes >= 100){
        return 3;
       }
       else if(totalVisualizacoes >= 50){
        return 2;
       }
       else {
        return 1;
       }
    }
}
