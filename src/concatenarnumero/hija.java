
package concatenarnumero;
import java.util.Random;
//ponemos extends y el otro niombre que vamos a heredar
public class hija extends padre{

    public hija(String nombrepropietario, String numerodeserie, String color) {
        super(nombrepropietario, numerodeserie, color);
    }
    
     //calculadora especial
    public int generarNumeroAleatorio(int limiteSuperior) {
        Random random = new Random();
        return random.nextInt(limiteSuperior);
    }

    public double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
    public double calcularLogaritmo(double numero) {
        return Math.log(numero);
    }

    public double calcularSeno(double anguloEnRadianes) {
        return Math.sin(anguloEnRadianes);
    }

    public double calcularCoseno(double anguloEnRadianes) {
        return Math.cos(anguloEnRadianes);
    }
    
    public double calcularTangente(double anguloEnRadianes) {
        return Math.tan(anguloEnRadianes);
    }
    
    public double calcularRaizCubica(double numero) {
        return Math.cbrt(numero);
    }
    
}

