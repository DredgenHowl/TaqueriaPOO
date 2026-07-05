package IntroduccionAPOO.taco1RománEmilianoAmbrizMuro;

public class Campechano extends Taco{

    private String combinacion;

    public Campechano(int id, String tipoTortilla, double precio, boolean tieneCebolla,boolean tieneSalsa, String combinacion){
        super(id, tipoTortilla,precio,tieneCebolla,tieneSalsa);
        this.combinacion=combinacion;
    }

    public void cambiarCombinacion(String combinacion){
        this.combinacion=combinacion;
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("---------------------------");
        System.out.println("Tipo de relleno: Campechano");
        super.mostrarDescripcion();
        System.out.println("Combinación del campechano: " + combinacion);
        System.out.println("---------------------------");
        System.out.println();

    }

}
