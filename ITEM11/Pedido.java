import java.util.ArrayList;

public class Pedido {
    private ArrayList<Renglon> renglones;

    // Constructor
    public Pedido() {
        this.setRenglones(new ArrayList<Renglon>());
    }

    // Método para agregar renglones al pedido
    public void agregarRenglon(Renglon renglon) {
        renglones.add(renglon);
    }
    private    void setRenglones(ArrayList<Renglon> p_renglon){
        this.renglones=p_renglon;
    }

    // Getter para obtener la lista de renglones
    public ArrayList<Renglon> getRenglones() {
        return this.renglones;
    }

    // Método para mostrar el pedido
    public void mostrar() {
        System.out.println("Pedido:");
        System.out.println("Cantidad de items: " + this.getRenglones().size());

        int totalEtiquetas = 0;
        double totalImporte = 0.0;

        // Iterar sobre los renglones usando el for-each
        for (Renglon renglon : this.getRenglones()) {
            System.out.print("Item " + (this.getRenglones().indexOf(renglon) + 1) + ": ");
            renglon.mostrar();  // Muestra los detalles del renglón

            // Acumular las cantidades y el importe total
            totalEtiquetas += renglon.getCantidad();  // Acumular la cantidad de etiquetas
            totalImporte += renglon.getImporte();     // Acumular el importe total

            System.out.println("Precio: $ " + renglon.getImporte()); // Precio del ítem
        }

        // Mostrar el total del pedido
        System.out.println("--- Total pedido: " + totalEtiquetas + " Etiquetas por un importe total de: $ " + totalImporte);
    }
}
