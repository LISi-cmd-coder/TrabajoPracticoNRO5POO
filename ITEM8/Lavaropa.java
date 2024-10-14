    
    /**
     * Write a description of class Lavaropa here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Lavaropa extends ArtefactoHogar
    {
        private int programas;
        private float kilos;
        private boolean automatico;
        
        public Lavaropa(String p_marca,int precio, int stock, int p_program,float p_kilos,boolean p_automatico)
        {
            super(p_marca,precio,stock);
            this.setPrograma(p_program);
            this.setPeso(p_kilos);
            this.setFuncionamiento(p_automatico);
        }
        private void setPrograma(int p_prog)
        {
            this.programas=p_prog;
        }
        private void setPeso(float p_peso)
        {
            this.kilos=p_peso;
        }
        private void setFuncionamiento(boolean p_modelo){
            this.automatico=p_modelo;
        }
        
        public int getProgramas()
        {
            return this.programas;
        }
        public float getPeso()
        {
            return this.kilos;
        }
        public boolean getFuncionamiento()
        {
            return this.automatico;
        }
    
        public float calcularDosPorciento(int p_cuotas,double p_interes)
        {
            return (float)this.cuotaCredito(p_cuotas,p_interes)*2/100;
        }
        
         /**
         * Calcula el valor de la cuota con un descuento adicional en caso de que el
         * lavarropas no sea automático. Si el lavarropas es automático, devuelve el valor
         * de la cuota sin modificaciones.
         *
         * @param p_cuotas El número de cuotas en el que se financiará el artefacto.
         * @param p_interes El porcentaje de interés que se aplica al crédito.
         * @return El valor de la cuota con o sin el descuento adicional dependiendo de si 
         * el lavarropas es automático o no.
         */
        public  float creditoConAdicional(int p_cuotas, double p_interes){
            if(this.getFuncionamiento()!=true)
            {
                return (float)super.cuotaCredito(p_cuotas, p_interes)-this.calcularDosPorciento(p_cuotas,p_interes);
            }else
            {
                 return (float) super.cuotaCredito(p_cuotas, p_interes);
            }
        }
        
        /**
       * Verifica si el artefacto es automatico y devuelve "Si" o "No" según el caso.
       *
       * @return "Si" si el artefacto es automatico, "No" en caso contrario.
      */ 
     
       public String esAutomatico() {
       return this.getFuncionamiento() ? "Si" : "No";// Mejora la legibilidad y eficiencia a comparancion del metodo tieneCompresorOno() en HELADERA.
       }
        
        
       /**
         * Imprime la información detallada sobre el lavarropas, incluyendo 
         * sus características y detalles del crédito.
         
         * @param p_cuotas Número de cuotas del crédito.
         * @param p_interes Tasa de interés aplicada al crédito.
         */
        public void imprimir(int p_cuotas,double p_interes)
        {
        
            
        System.out.println("***LAVAROPA***\n");    
        super.imprimir();
        System.out.println("Programas: "+this.getProgramas());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Es automatico:"+ this.esAutomatico());
        System.out.println("Cuotas: "+ p_cuotas + "\t- "+"Interés: " + p_interes);
        System.out.println("Valor cuota:$ " + super.cuotaCredito(p_cuotas,p_interes));
        System.out.println("Valor cuota adicional:$ "+ this.creditoConAdicional(p_cuotas,p_interes));
        }
    }