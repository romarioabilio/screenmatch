package Models;

import Models.CalculadoraTempoReal.Classificavel;

public class Serie extends Titulo implements Classificavel {
    //ADICIONANDO ATRIBUTOS DE ESPECIALIZAÇÃO DA CLASSE
    private int temporadas;
    private int episodiosPorTemporadas;
    private boolean ativa;
    private int minutosPorEpisodios;
 
    
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }
    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public boolean getAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }
    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }
    //INDICA A SOBREPOSIÇÃO DE METÓDOS
    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporadas * minutosPorEpisodios;
    }

    @Override
    public int getClassificacao() {
        return (int)getMediaDasAvaliacoes() / 2;
}

}
