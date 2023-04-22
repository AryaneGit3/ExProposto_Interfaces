
// Subclasse da classe abstrata AreaCalculavel

public class Retangulo extends AreaCalculavel {
    
        private int largura;
        private int altura;

// Construtor:         

public Retangulo(int largura, int altura){
    this.largura=largura;
    this.altura=altura;
}   

//--------------------------------------------------------
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //--------------------------------------------------------
    // Implementando metodo abstrato:
    
    public double calculaArea(){
    double area = this.largura*this.altura;
    System.out.println("Área do retanfulo eh: " + area);
    return area;
     
    
}
    
} // fim class
