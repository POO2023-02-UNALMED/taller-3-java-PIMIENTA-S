package taller3.televisores;

public class TV {
    Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
    }
}
