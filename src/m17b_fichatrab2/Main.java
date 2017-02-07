package m17b_fichatrab2;

/**
 * Utilização do github
 * @author a15711 | a13228
 */

public class Main {

        
    public static void main(String[] args) {
        // Ficha de Trabalho #2
        
        /**
         * Inicialização de p1 e p2 do tipo Ponto2D 
         */
        
        Ponto2D p1 = new Ponto2D(5,7);
        Ponto2D p2 = new Ponto2D(2,8);
        
        /**
         * É imprimido os valores de p1, p2 e distância  
         */
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p2.distancia(p1));
    }
    
}
