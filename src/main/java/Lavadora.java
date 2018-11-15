import com.sun.org.apache.xpath.internal.operations.String;

public class Lavadora extends Electrodomestico {

    private int capacidad;

    public Lavadora(String marca, String modelo, String color, int peso, int garantia, int capacidad) {
        super(marca, modelo, color, peso, garantia);
        this.capacidad = capacidad;
    }


    public int getCapacidad(){
        return capacidad;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public int getCapacidadMaxima(int capacidad){
        if(capacidad <= 100){
            System.out.print("La capacidad maxima es 100");
        }else{
            System.out.print("La capacidad es correcta");
        }
        return  capacidad;
    }


}
