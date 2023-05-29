package Models;

import Models.CalculadoraTempoReal.Calculadora;
import Models.CalculadoraTempoReal.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        //CRIANDO E MANIPULANDO OBJETO FILME
        Filme filme = new Filme();
        filme.setNome("Madagascar");
        filme.setDuracaoEmMinutos(165);
        filme.setAnoDeLancamento(2008);
        filme.setIncluidoNoPlano(true);
        filme.avalia(9);
        filme.avalia(8);
        filme.avalia(7);
        filme.exibiFichaTecnica();
        System.out.println("\n");

        //CRIANDO E MANIPULANDO OBEJTO OUTRO FILME
        Filme outroFilme = new Filme();
        outroFilme.setNome("Shrek");
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setAnoDeLancamento(2008);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.avalia(8);
        outroFilme.avalia(8);
        outroFilme.avalia(8);
        outroFilme.exibiFichaTecnica();
        System.out.println("\n");

        //CRIANDO E MANIPULANDO OBJETO SERIE
        Serie serie = new Serie();
        serie.setNome("The Walking Dead");
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporadas(10);
        serie.setAnoDeLancamento(2011);
        serie.setAtiva(true);
        serie.setMinutosPorEpisodios(50);
        serie.setIncluidoNoPlano(true);
        serie.avalia(9);
        serie.avalia(9);
        serie.avalia(9);
        serie.exibiFichaTecnica();
        System.out.println("\n");

        //CALCULANDO MINUTAGEM DE FILMES ESCOLHIDOS PARA MARATONAR NAS FERIAS
        Calculadora calculadora = new Calculadora();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println("Tempo total: " +calculadora.getTempoTotal()+" minutos");
        System.out.println("\n");
        
        //USANDO FILTRO PARA RECOMENDAÇÃO
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(serie);

        //FILTRANDO UM EPISODIO E CLASSIFICANDO ELE 
        Episodios episodio = new Episodios();
        episodio.setSerie(serie);
        episodio.setNumero(3);
        episodio.setTotalVisualizacoes(25);
        filtro.filtra(episodio);

      
     

    }
}
