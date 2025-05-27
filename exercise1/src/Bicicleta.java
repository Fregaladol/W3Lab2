public class Bicicleta {

/*     Tienes una colección de bicicletas y vas registrando los últimos modelos que         compraste en WallaPop.


    - Debes crear una clase Bicicleta con características como: Marca, Modelo, Velocidad Máxima, Si
    tiene marchas o no … (estas características puedes cambiarlas según tu gusto)


    - Puedes añadir métodos: tocar el claxon, pedalear, parar, girar, cambiar marchas, …


    - Recordar que debe haber también un método constructor y un toString()


    - Primero probar instanciar una o dos bicicletas sueltas


    - Luego, probar a crear un arraylist  de bicicletas


    - Y recorrer ese arraylist  para mostrarlo con bucle for y/o for-each


    - También se puede mostrar una sola propiedad (o varias) de las bicicletas. Ej: mostrar solo marca y
    velocidad máxima de todas las bicicletas.


    - Tema booleanos, probad a ponerlo como texto. Ej: “sí incluye cambio de marchas” (modificar el toString() )

    - Probar métodos set desde el main()

    +EXTRA: crear o cambiar o leer desde el scanneranner de usuario (con o sin bucle) */

    private String marca;
    private String modelo;
    private double velMax;
    private boolean cambios;
    private boolean carbono;
   
   
    public Bicicleta() {
    }


    public Bicicleta(String marca, String modelo, double velMax, boolean cambios, boolean carbono) {
        setMarca(marca);;
        setModelo(modelo);
        setVelMax(velMax);
        setCambios(cambios);
        setCarbono(carbono);
    }


    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public double getVelMax() {
        return velMax;
    }


    public boolean iscannerambios() {
    return cambios;
    }

    public boolean iscannerarbono() {
        return carbono;
    }

    public String getTipoCambios() {
    return cambios ? "12 velocidades" : "fixi";
    }

    public String getMaterial() {
        return carbono ? "Carbono" : "Aluminio";
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }


    public void setCambios(boolean cambios) {
        this.cambios = cambios;
    }


    public void setCarbono(boolean carbono) {
        this.carbono = carbono;
    }

    @Override
    public String toString() {
    return " La Bicicleta  es de la marca " + marca + " modelo " + modelo + " alcanzando una velocidad máxima " + velMax + " km/h " + "su transmisión es  " + getTipoCambios() + " y su material es " + getMaterial() + ".";
}


    

    
    






}
