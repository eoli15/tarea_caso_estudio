// Clase principal para probar el sistema
public class SistemaVehiculos {
    // Crear metódo estático
    public static void procesarVehiculo(Vehiculo[] vehiculo) {
        for (Vehiculo v : vehiculo) {
            v.mover();
            System.out.println(v.obtenerDetalles());

            if(v instanceof Combustible) {
                Combustible c = (Combustible) v;
                System.out.println("Nivel de combustible antes de recarga: " + c.obtenerNivelCombustible() + " litros");
                c.recargarCombustible();
                System.out.println("Nivel de combustible después de recarga: " + c.obtenerNivelCombustible() + " litros");
            }
        }

    };
    public static void main(String[] args) {

        // Crear instancias de vehículos
        Vehiculo auto = new Automovil("Toyota", "Corolla", 2020, 40.0);
        Vehiculo bici = new Bicicleta("Trek", "Mountain", 2022, 21);
        Vehiculo moto = new Motocicleta("Honda", "Navi", 2021, 14, 1000);

         // Probar polimorfismo
        auto.mover();
        System.out.println(auto.obtenerDetalles());
        ((Combustible) auto).recargarCombustible();
        System.out.println("Nivel de combustible: " + ((Combustible) auto).obtenerNivelCombustible());
        ((Mantenimiento) auto).realizarMantenimiento();

        bici.mover();
        System.out.println(bici.obtenerDetalles());

        moto.mover();
        System.out.println(moto.obtenerDetalles());
        ((Combustible) moto).recargarCombustible();
        System.out.println("Nivel de combustible: " + ((Combustible) moto).obtenerNivelCombustible());
        ((Mantenimiento) moto).realizarMantenimiento();

        //Probar método stático
        Vehiculo[] vehiculos = {auto, bici, moto};

        procesarVehiculo(vehiculos);
    }
}
