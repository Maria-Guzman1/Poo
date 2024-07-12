public class Main {
    public static void main(String[] args) {
        NavegadorGPS gps = new NavegadorGPS(new RutaRapida());
        gps.calcularRuta("Punto A", "Punto B");

        gps.setRutaStrategy(new RutaCorta());
        gps.calcularRuta("Punto A", "Punto B");

        
        gps.setRutaStrategy(new RutaEconomica());
        gps.calcularRuta("Punto A", "Punto B");
    }
}