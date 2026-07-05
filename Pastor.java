package IntroduccionAPOO.taco1RománEmilianoAmbrizMuro;

public class Pastor extends Taco {

    private boolean tienePiña;

    private String tipoAdobo;

    public Pastor(int id, String tipoTortilla, double precio, boolean tieneCebolla, boolean tieneSalsa, boolean tienePiña, String tipoAdobo){
        super(id,tipoTortilla,precio,tieneCebolla,tieneSalsa);
        this.tienePiña=tienePiña;
        this.tipoAdobo=tipoAdobo;
    }

    public boolean getTienePiña(){
        return tienePiña;
    }

    public void agregarPiña(){
        this.tienePiña=true;
    }

    public String getTipoAdobo(){
        return tipoAdobo;
    }

    @Override
    public void mostrarDescripcion(){
        System.out.println("----------------------------------");
        System.out.println("Tipo de relleno: Pastor");
        super.mostrarDescripcion();
        System.out.println("Tiene Piña?: " +(tienePiña?"si":"no"));
        System.out.println("Tipo de Adobo: " + tipoAdobo);
        System.out.println("----------------------------------");
    }
}
