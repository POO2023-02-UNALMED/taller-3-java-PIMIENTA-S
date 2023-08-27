package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    Control control;
    private int numTV;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
    }

    public int getNumTV() {
        return numTV;
    }

    public void setNumTV(int numTV) {
        this.numTV = numTV;
    }

    public void turnOn(){
        this.setEstado(true);
    }
    public void turnOff(){
        this.setEstado(false);
    }

    public Marca getMarca() {
        return marca;
    }

    public int getCanal() {
        return canal;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public int getVolumen() {
        return volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCanal(int canal) {
        if (canal >= 1 && canal < 121 && estado){
            this.canal = canal;
        }
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setVolumen(int volumen) {
        if (volumen >= 0 && volumen < 8 && estado){
            this.volumen = volumen;
        }
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public void canalUp() {
        if (canal < 120 && estado){
            canal++;
        }
    }
    public void canalDown(){
        if (canal < 0 && estado){
            canal--;
        }
    }
    public void volumenUp(){
        if (volumen < 8 && estado){
            volumen++;
        }
    }
    public void volumenDown(){
        if (volumen >= 0 && estado){
            volumen--;
        }
    }
}
