package IntroduccionAPOO.taco1RománEmilianoAmbrizMuro;

import java.util.ArrayList;
import java.util.Scanner;

public class Taqueria {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Lista simple de tacos
        ArrayList<Taco>tacos=new ArrayList<>();
        tacos.add(new Pastor(1, "Maiz", 25, false, true, true,"Normal"));
        tacos.add(new Carnitas(2,"Maiz", 25, false, false, "Costilla"));
        tacos.add(new Campechano(3, "Maiz", 27, true, true, "Bistec con Chorizo"));

        //Ordenes con el ArrayList(Esto vendría siendo ya sea como ya todas las ordnes o la "Taqueria" o el acceso o creación de las ordenes de los clientes )
        ArrayList<Taco>orden1 = new ArrayList<>();
        ArrayList<Taco>orden2 = new ArrayList<>();
        ArrayList<Taco>orden3 = new ArrayList<>();
        ArrayList<Taco>orden4 = new ArrayList<>();
        ArrayList<Taco>orden5 = new ArrayList<>();
        ArrayList<Taco>orden6 = new ArrayList<>();

        //Llenado de la orden 1
        orden1.add(new Pastor(1, "Maiz", 25, false, true, true, "Normal"));
        orden1.add(new Taco());
        orden1.get(1).setId(2);
        orden1.get(1).setTipoTortilla("Maiz");
        orden1.get(1).setPrecio(25);
        orden1.get(1).setTieneCebolla(false);
        orden1.get(1).setTieneSalsa(true);
        orden1.add(new Campechano(3, "Maiz", 25, false, false,"Bistec con Chorizo"));

        //Llenado de la orden 2
        orden2.add(new Pastor(4, "Maiz", 25, true, false, true, "Normal"));

        //Llenado de la orden 3
        orden3.add(new Pastor(5, "Maiz", 25, true, true, true, "Normal"));
        orden3.add(new Pastor(6, "Maiz", 25, true, false, true, "Normal"));
        orden3.add(new Carnitas(7, "Maiz", 25, false, false, "Costilla"));
        orden3.add(new Campechano(8, "Maiz", 25, true, true, "Bistec con Chorizo"));

        //llenado de la orden 4
        orden4.add(new Campechano(9, "Maiz", 25, false, true, "Bistec con chorizo"));
        orden4.add(new Carnitas(10, "Maiz", 25, true, true, "Costilla"));

        //llenado de la orden 5 
        orden5.add(new Pastor(11, "Maiz", 25, true, true, true, "Normal"));
        orden5.add(new Pastor(12, "Maiz", 25, false, true, false, "Normal"));
        orden5.add(new Campechano(13, "Maiz", 25, false, true, "Bistec con chorizo"));
        
        //lenado de la orden 6
        orden6.add(new Carnitas(14, "Maiz", 25, false, false, "Costilla"));
        orden6.add(new Campechano(15, "Maiz", 25, false, false, "Bistec con Chorizo"));
        orden6.add(new Pastor(16, "Maiz", 25, true, true, true, "Normal"));

        //Matriz de listas/ordenes: Representa la taquerñia agrupando todas las ordenes 
        ArrayList<ArrayList<Taco>> matrizDeOrdenes = new ArrayList<>();
        matrizDeOrdenes.add(orden1);
        matrizDeOrdenes.add(orden2);
        matrizDeOrdenes.add(orden3);
        matrizDeOrdenes.add(orden4);
        matrizDeOrdenes.add(orden5);
        matrizDeOrdenes.add(orden6);
    }
    

    //Método para eliminar un taco dentro de la matriz
    public static void eliminarTacoPorId(ArrayList<ArrayList<Taco>>matrizDeOrdenes, int idEliminar){
        for(int i=0; i<matrizDeOrdenes.size(); i++){
            for(int j=0; j<matrizDeOrdenes.get(i).size(); j++){
                if(matrizDeOrdenes.get(i).get(j).getId() == idEliminar){
                    matrizDeOrdenes.get(i).remove(j);
                    System.out.println("Taco eliminado correctamente de la orden: " +(i+1));
                    return;
                }
            }
        }
        System.out.println("Id no encontrado con el id: " + idEliminar);
    }

    //Método para buscar un taco por su Id
    public static void buscarTacoPorId(ArrayList<ArrayList<Taco>>matrizDeOrdenes, int idBuscar){
        for(int i=0; i<matrizDeOrdenes.size(); i++){
            for(int j=0; j<matrizDeOrdenes.get(i).size();  j++){
                if(matrizDeOrdenes.get(i).get(j).getId() == idBuscar){
                    System.out.println("Taco encontrado en orden: " + (i+1));
                    matrizDeOrdenes.get(i).get(j).mostrarDescripcion();
                    return;
                }
            }
        }
        System.out.println("Taco no encontrado por el id: " + idBuscar);
    }

    //Método para buscar un taco por su Nombre o tipo
    //El "getClass()" sirve para obeter toda la información de la clase a la que pertence un objeto
    //El "getSimpleName()" es un método ya predefinido que lo voy a juntar con el método "getClass()" y su función es extraer el nombre de esa clase
    public static void buscarTacoPorNombreOtipo(ArrayList<ArrayList<Taco>>matrizDeOrdenes, String nombreBuscar){
        for(int i=0; i<matrizDeOrdenes.size(); i++){
            for(int j=0; j<matrizDeOrdenes.get(i).size(); j++){
                if(matrizDeOrdenes.get(i).get(j).getClass().getSimpleName().equalsIgnoreCase(nombreBuscar)){//Cómo ya no tengo una variable para el nombre del taco cómo tal o para el relleno o algo que describa explicitamente su tipo de taco, porque lo quité debído a que ya no es tan necesario dentro del constructor, porque en la propia herencia de los tacos ya te dice que taco es. Entonces para "completar" esa parte utilizo "getClass()" y "getSimpleName()"
                System.out.println("Taco encontrado");
                }
            }
        }
    }

    //Método para mostrar todas las ordenes con el detalle de cada taco de la orden
    public static void mostrarOrdenes(ArrayList<ArrayList<Taco>>matrizDeOrdenes){
        for(int i=0;i<matrizDeOrdenes.size(); i++){
            System.out.println("--------------------------------------------------");
            System.out.println("Orden: " + (i + 1));
            System.out.println("Numero de tacos en la orden: " + matrizDeOrdenes.get(i).size());
            System.out.println("--------------------------------------------------");
            for(int j=0;j<matrizDeOrdenes.get(i).size(); j++){
                System.out.println("Taco no. " + (j+1));
                matrizDeOrdenes.get(i).get(j).mostrarDescripcion();
            }
        }
    }

    //Método para calcular el total de cada orden y el total general de la Taquería 
    public static void calcularTotal(ArrayList<ArrayList<Taco>>matrizDeOrdenes){
        double totalGeneral=0;
        for(int i=0; i<matrizDeOrdenes.size(); i++){
            double totalOrden=0;
            for(int j=0; j<matrizDeOrdenes.get(i).size(); j++){
                totalOrden+=matrizDeOrdenes.get(i).get(j).getPrecio();
            }
            System.out.println("El total de la orden no. " + (i+1) + "es: $" + totalOrden);
            totalGeneral+=totalOrden;
        }
        System.out.println("El total General de la taquería es: $ " + totalGeneral);
    }

    //Métodoo para actualzar los ids de los tacos
    public static void actualizarId(ArrayList<ArrayList<Taco>>matrizDeOrdenes){
        int nuevoId=1;
        for(int i=0; i<matrizDeOrdenes.size(); i++){
            for(int j=0; j<matrizDeOrdenes.get(i).size(); j++){
                matrizDeOrdenes.get(i).get(j).setId(nuevoId);
                nuevoId++;
            }
        }
    }

    //Método para agregar un taco a la orden
    public static void agregarTaco(ArrayList<ArrayList<Taco>>matrizDeOrdenes, int numeroOrden, Taco nuevoTaco){
        if(numeroOrden>0 && numeroOrden<=matrizDeOrdenes.size()){
            matrizDeOrdenes.get(numeroOrden-1).add(nuevoTaco);
            System.out.println("Se ha agregado un nuevo taco a la orden, en la orden: " + numeroOrden);
            return;
        }else{
            System.out.println("No se ha podido agregar un taco a la orden: " + numeroOrden);
        }
    }
}