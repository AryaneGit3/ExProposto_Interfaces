/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aryan
 */
public class Quadrado extends AreaCalculavel {

public Quadrado (int lado){ // construtor 1

    this.lado=lado;
}

//--------------------------------------------
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }
    
    private int lado;
    


//---------------------------------------------

@Override // implementando metodo abstrato

public double calculaArea(){
    double area=this.lado*this.lado;
    System.out.println("Área do quadrado: " + area);
    return area;

}


}



