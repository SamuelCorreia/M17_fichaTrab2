package m17b_fichatrab2;

public class Ponto2D {
    private int x;
    private int y;
    private int resultado;
    
    /**
     * Construtor Ponto2D sem parâmetros
     */
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    
    /**
     * Construtor Ponto2D com parâmetros
     */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    /**
     * Setter de X
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Setter de Y
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Getter de X
     */
    public int getX() {
        return x;
    }
    
    /**
     * Getter de Y
     */
    public int getY() {
        return y;
    }
    
    
    /**
     * Método distancia que calcula a 
     * distância entre os dois pontos
     */
    public double distancia(Ponto2D a){
        // Falta fazer este método.
        if(x<=y)
            resultado = y-x;
        else
            resultado = x-y;
        return resultado;
    }
    
}
