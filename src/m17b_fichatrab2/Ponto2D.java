package m17b_fichatrab2;

public class Ponto2D {
    private int x;
    private int y;
    
    /**
     * Construtor Ponto2D sem parâmetros
     */
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    
    /**
     * Construtor Ponto2D com parâmetros
     * @param x coordenada x
     * @param y coordenada y
     */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    /**
     * Setter de X
     * @param x coordenada x
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Setter de Y
     * @param y coordenada y
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Getter de x
     * @return valor da coordenada x
     */
    public int getX() {
        return x;
    }
    
    /**
     * Getter de y
     * @return valor da coordenada y
     */
    public int getY() {
        return y;
    }
    
    
    /**
     * Método distancia que calcula a 
     * distância entre os dois pontos
     * @param a Segundo ponto
     * @return a distância entre os dois pontos
     */
    public double distancia(Ponto2D a){
        int resultado;
        int distx;
        int disty;
        
        if(x<=a.getX())
            distx = a.getX()-x;
        else
            distx = x-a.getX();
        
        if(y<=a.getY())
            disty = a.getY()-y;
        else
            disty = y-a.getY();
        
        return (int)Math.hypot(disty, distx);
    }
    
    /**
     * Método toString para retornar os valores de x e y 
     * @return toString de x e y
     */
    @Override
    public String toString() {
        return "Ponto2D {" + "x = " + x + "; y = " + y + '}';
    }
}
