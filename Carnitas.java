package IntroduccionAPOO.taco1RománEmilianoAmbrizMuro;

public class Carnitas extends Taco{

    private String parteCarnitas;

    public Carnitas(int id, String tipoTortilla, double precio, boolean tieneCebolla,boolean tieneSalsa, String parteCarnitas){
        super(id,tipoTortilla,precio,tieneCebolla,tieneSalsa);
        this.parteCarnitas=parteCarnitas;
    }

    public String getParteCarnitas(){
        return parteCarnitas;
    }

    public void cambiarParteCarnitas(String parteCarnitas){
        this.parteCarnitas=parteCarnitas;
    }

    @Override
    public void mostrarDescripcion(){
        System.out.println("------------------------------------");
        System.out.println("Tipo de relleno: Carnitas");
        super.mostrarDescripcion();
        System.out.println("Parte de las carnitas: " + parteCarnitas);
        System.out.println("------------------------------------");
        System.out.println();
    }

}
