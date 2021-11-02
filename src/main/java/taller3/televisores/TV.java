package taller3.televisores;

public class TV {
    Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;
    static int numTV;

    public TV (Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV ++;
    }
    public static void setNumTV(int i) {
        numTV = i;
    }
    public static int getNumTV() {
        return numTV;
    }
    public Marca getMarca(){
        return marca;
    }
    public Control getControl(){
        return control;
    }
    public int getPrecio(){
        return precio;
    }
    public int getVolumen(){
        return volumen;
    }
    public int getCanal(){
        return canal;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setMarca(Marca marca1){
        this.marca = marca1;
    }
    public void setVolumen(int volumen1){
        this.volumen = volumen1;
    }
    public void setCanal(int canal1){
        if(canal1 >= 1 && canal1 <= 120){
            this.canal = canal1;
        }
    }
    public void setPrecio(int precio1){
        this.precio = precio1;
    }
    public void setControl(Control control1){
        this.control = control1;
    }
    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public void canalUp(){
        if (canal < 120 && estado){
            canal ++;
        }
    }
    public void canalDown(){
        if (canal > 1 && estado){
            canal --;
        }
    }
    public void volumenUp(){
        if (volumen < 7 && estado){
            volumen ++;
        }
    }
    public void volumenDown(){
        if (volumen > 0 && estado){
            volumen --;
        }
    }
    public void enlazar(Control control){
        this.control = control.tv.control;
    }
}