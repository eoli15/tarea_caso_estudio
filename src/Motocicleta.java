// Clase que representa una Motocicleta, hereda de Vehiculo e implementa Combustible y Mantenimiento
public class Motocicleta extends Vehiculo implements Combustible, Mantenimiento {
    private double nivelCombustible;
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int anio, double nivelCombustible, int cilindrada) {
        super (marca, modelo, anio);
        this.nivelCombustible = nivelCombustible;
        this.cilindrada = cilindrada;
    }

    @Override
    public void mover() {
        if (nivelCombustible > 0) {
            System.out.println("La motocicleta " + marca + " " + modelo + " de cilindrada " + cilindrada + "cc"+ " está conduciendo.");
            nivelCombustible -= 0.5;
        } else {
            System.out.println("La motocicleta " + marca + " " + modelo + " no tiene combustible.");
        }
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Combustible: " + nivelCombustible + " litros " + ",Cilindrada: " + cilindrada + "cc";
    }

    @Override
    public void recargarCombustible() {
        nivelCombustible = 20.0;
        System.out.println("La motocicleta " + marca + " " + modelo + " ha sido recargada con combustible.");
    }

    @Override
    public double obtenerNivelCombustible() {
        return nivelCombustible;
    }

   @Override
    public void realizarMantenimiento() {
        System.out.println("Limpiando carburador...");
        System.out.println("Ajustando correa...");
   }
}
