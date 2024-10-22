    
    /**
     * Write a description of class Renglon here.
     * 
     * @author Valenzuela Lisandro
     * @version 110302002
     */
    public class Renglon
    {
        private int cantidad;
        private double importe;
        private Etiqueta item;
        public Renglon(Etiqueta p_item,int p_cantidad, double p_importe){
                this.setItem(p_item);
                this.setCantidad(p_cantidad);
                this.setImporte(p_importe);
        }
        
        private void setItem(Etiqueta p_item){
            this.item=p_item;
        }
          private void setCantidad(int p_cantidad){
            this.cantidad=p_cantidad;
        }
         private void setImporte(double p_importe){
            this.importe=p_importe;
        }
        
        public Etiqueta getItem(){
            return this.item;
        }
        public double getImporte(){
            return this.importe;
        }
        public int getCantidad(){
            return this.cantidad;
        }
           /**
         * Método para mostrar los detalles del renglón.
         * Muestra la cantidad de etiquetas, el tipo, el costo y, si es Premium, la cantidad de colores.
         */
        public void mostrar() {
           
            String detalles = " "+this.getCantidad() + " Etiquetas de tipo " + this.getItem().tipo() + " - Costo: $" + this.getItem().getCosto();
            // Si el item es de tipo Premium, mostrar también la cantidad de colores
            if (this.getItem() instanceof Premium) {
                Premium etiquetaPremium = (Premium) this.getItem(); // Casting a Premium
                System.out.println(" "+detalles + " - Colores: " + etiquetaPremium.getColores()) ;// Obtener cantidad de colores
            }
            
            /*
             * if(this.getItem().tipo().equalsIgnoreCase("Premium")){
               System.out.println(" "+detalles +"-Colores: " this.getItem().getColores();
             }
            */
            System.out.println(detalles);
    
        }
        
        
        
    }
