public abstract class Cliente {

    private String nombre;

    private String clavedecliente;

    private String totalapagar;

    public Cliente(String nombre, String clavedecliente, String totalapagar) {
        this.nombre = nombre;
        this.clavedecliente = clavedecliente;
        this.totalapagar = totalapagar;
    }

    public abstract double totalapagar();
}
