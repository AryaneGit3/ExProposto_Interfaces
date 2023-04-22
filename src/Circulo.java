/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aryan
 */
public class Circulo extends AreaCalculavel {
    
      private int raio;

// Construtor:

public Circulo(int raio){
    
    this.raio=raio;
    
}      
      
//----------------------------------------------  
      
    public int getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        this.raio = raio;
    }
    
 //-----------------------------------------------
 
    // Implementando metodo abstrato:
    
    @Override
    public double calculaArea() {
      
    double pi = 3.14;
    double area = pi * this.raio * this.raio;
    System.out.println("Área do círculo: " + area);
    return area;
}
    
    
}


