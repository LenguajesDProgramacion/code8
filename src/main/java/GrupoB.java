public class GrupoB extends Cliente{
    public double montoapagar;

    public GrupoB(double montoapagar, String nombre,String clavedecliente, String totalapagar){
        super(nombre, clavedecliente,totalapagar);
        this.montoapagar = montoapagar;
    }

    public void nombre(){
        System.out.print("El nombre del cliente es:");
    }

    public double totalapagar(){
        if(montoapagar > 10000){
            return (montoapagar*0.95);
        }else{
            return montoapagar;
        }
    }

}
