
public class TesteInterfaces {
    
    public static void main(String[] args) {
        
        AreaCalculavel a1 = new Retangulo(5,8);
        a1.calculaArea();
        
        AreaCalculavel a2 = new Quadrado(5);
        a2.calculaArea();
        
        AreaCalculavel a3 = new Circulo(2);
        a3.calculaArea();
        
        
    
  
    }
    
}