package taller3.televisores;

public class Control {
    private TV tv;

    public void enlazar(TV tv){
        this.tv = tv;
        this.tv.setControl(this);
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void turnOn(){
        this.tv.setEstado(true);
    }
    public void turnOff(){
        this.tv.setEstado(false);
    }
    public void canalUp(){
        this.tv.canalUp();
    }
    public void canalDown(){
        this.tv.canalDown();
    }
    public void volumenUp(){
        this.tv.volumenUp();
    }
    public void volumenDown(){
        this.tv.volumenDown();
    }
    public void setCanal(int canal){
        this.tv.setCanal(canal);
    }
    public void setVolumen(int volumen){
        this.tv.setVolumen(volumen);
    }
}
