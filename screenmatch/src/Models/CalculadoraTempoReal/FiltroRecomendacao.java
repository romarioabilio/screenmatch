package Models.CalculadoraTempoReal;

public class FiltroRecomendacao {



    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4 ){
            System.out.println("Está entre os preferidos");
        }
        else if(classificavel.getClassificacao() >= 2){
            System.out.println("Está classificado como um bom filme");
        }
        else{
            System.out.println("Não é o melhor que nós temos ");
        }
    }
    
}
