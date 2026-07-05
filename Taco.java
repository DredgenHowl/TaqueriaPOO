package IntroduccionAPOO.taco1RománEmilianoAmbrizMuro;

public class Taco {

    private int id;
    private String tipoTortilla;
    private boolean tieneCebolla, tieneSalsa;
    private double precio;

    // Constructor
    public Taco(int id, String tipoTortilla, double precio, boolean tieneCebolla, boolean tieneSalsa) {
        this.id = id;
        this.tipoTortilla = tipoTortilla;
        this.precio = precio;
        this.tieneCebolla = tieneCebolla;
        this.tieneSalsa = tieneSalsa;
    }

    //Sobrecarga del Constructor
    public Taco(String tipoTortilla){
        this.id = 0;
        this.tipoTortilla = tipoTortilla;
        this.precio = 0;
        this.tieneCebolla = false;
        this.tieneSalsa = false;
    }

    //Sobrecarrga del Consrtuctor: Constructor vacio
    public Taco() {
        this.id = 0;
        this.tipoTortilla = "";
        this.precio = 0;
        this.tieneCebolla = false;
        this.tieneSalsa = false;
    }

    // GET: función de consultar datos (Getters)
    public int getId(){
        return id;
    }
    public String getTipoTortilla() {
        return tipoTortilla;
    }

    public double getPrecio(){
        return precio;
    }

    public boolean isTieneCebolla() {// boolean empiezan con is
        return tieneCebolla;
    }

    public boolean isTieneSalsa(){
        return tieneSalsa;
    }

    //Note: Método para establecer/modificar un Id (Setters)
    public void setId(int id) {
        this.id = id;
    }

    public void setTipoTortilla(String tipoTortilla){
        this.tipoTortilla=tipoTortilla;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }

    public void setTieneCebolla(boolean tieneCebolla) {
        this.tieneCebolla = tieneCebolla;
    }


    public void setTieneSalsa(boolean tieneSalsa) {
        this.tieneSalsa = tieneSalsa;
    }

    // M{etodos:Cambian el estado del objeto
    public void agregarSalsa() {//método para agregar salsa
        this.tieneSalsa = true;
    }

    public void quitarCebolla() {//método para quitar cebolla
        this.tieneCebolla = false;
    }

    public void mostrarDescripcion() {
        System.out.println("----------------------------------------------------");
        System.out.println("Tiene tortilla: " + tipoTortilla);
        System.out.println("Cebolla: " + (tieneCebolla ? "Si" : "No"));
        System.out.println("Salsa: " + (tieneSalsa ? "Si" : "No"));
        System.out.println("Precio: $" + precio);
        System.out.println("----------------------------------------------------");
    }

}