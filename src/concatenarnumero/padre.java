
package concatenarnumero;


public class padre {
    //crear lo primero son los atributos especiales de solo padre
    public String nombrepropietario;
    protected String numerodeserie;
    private String color;
    //despues agg un constructor
    //despues del resultado de constructor nuebo geder an seder
    
    public padre(String nombrepropietario, String numerodeserie, String color) {
        this.nombrepropietario = nombrepropietario;
        this.numerodeserie = numerodeserie;
        this.color = color;
    }
    
    public String getNombrepropietario() {
        return nombrepropietario;
    }

    public void setNombrepropietario(String nombrepropietario) {
        this.nombrepropietario = nombrepropietario;
    }

    public String getNumerodeserie() {
        return numerodeserie;
    }

    public void setNumerodeserie(String numerodeserie) {
        this.numerodeserie = numerodeserie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    //en clase hemos dicho "funciones" anteriormente, pero en POO son metodos.
    public double sumar(double primerNumero, double segundoNumero, double tercerNumero){
        return primerNumero + segundoNumero + tercerNumero;
    }
    
    public double restar(double primerNumero, double segundoNumero, double tercerNumero){
        return primerNumero - segundoNumero - tercerNumero;
    }
    
    public double multiplicar(double primerNumero, double segundoNumero, double tercerNumero){
        return primerNumero * segundoNumero * tercerNumero;
    }
    
    public double dividir(double primerNumero, double segundoNumero){
        return primerNumero / segundoNumero;
    }
    
    public double raizCuadrada(double numero){
        return Math.sqrt(numero);
    }
    
    public boolean esPrimo(int numeroBuscado){
        boolean primo = false;
        int contador = 0;
        for(int i = numeroBuscado; i > 0; i--){
            if(numeroBuscado % i == 0 ){
                contador++;
            }
        }
        if(contador == 2){
            return true;
        }else{
            return false;
        }
    } 



   
    
}
