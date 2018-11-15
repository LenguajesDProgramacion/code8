import com.sun.org.apache.xpath.internal.operations.String;

public class Licuadora extends Electrodomestico {
    private int tamaño;
    private int tiempoGarantia;

    public Licuadora(String marca, String modelo, String color, int peso, int garantia, int tamaño, int tiempoGarantia) {
        super(marca, modelo, color, peso, garantia);
        this.tamaño = tamaño ;
        this.tiempoGarantia = tiempoGarantia;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(int tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }

}
