package Models;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        //filme.nome = "Madagascar";
        filme.setNome("Madagascar");
        //filme.duracaoEmMinutos = 165;
        filme.setDuracaoEmMinutos(165);
        //filme.anoDeLancamento = 2005;
        filme.setAnoDeLancamento(2008);
        //filme.incluidoNoPlano = true;
        filme.setIncluidoNoPlano(true);
        filme.avalia(9);
        filme.avalia(8);
        filme.avalia(7);
        filme.exibiFichaTecnica();
        
       
      
     

    }
}
