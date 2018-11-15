public class Contador1 {
    private int numero;

    public Contador1(int numero){
        this.numero = numero;

    }

    public int incrementar(int numIncrementar){
        return this.numero += numIncrementar;
    }
}
