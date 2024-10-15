
public class AdministracionGerencia
{
    public static void main(String [] args)
    {
        Hotel SheratonHotelsResorts=new Hotel("Sheraton Hotels & Resorts",15000,10,"single");
        Cabaña CabanasSolarDePaso=new Cabaña("cabañas solar del paso", 120, 3, 2);
        Hotel HotelElLibertador= new Hotel("Hotel El Libertador",200, 3, "double");
        
        Servicios auto = new Servicios("Auto", 100);
        Servicios alCuarto=new Servicios("Servicio al cuarto",40);//dolaaaar
        Servicios heladera=new Servicios("Heladera llena", 150);//dolaaar
        
        SheratonHotelsResorts.agregarServicio(alCuarto);
        SheratonHotelsResorts.agregarServicio(auto);
        CabanasSolarDePaso.agregarServicio(heladera);

        HotelElLibertador.agregarServicio(heladera);

        Gerencia gerenciaPropiedades= new Gerencia("Gerencia Propieades El malevo S.A");

        gerenciaPropiedades.agregarAlojamiento(HotelElLibertador);
        gerenciaPropiedades.agregarAlojamiento(CabanasSolarDePaso);
        gerenciaPropiedades.agregarAlojamiento(SheratonHotelsResorts);

        gerenciaPropiedades.mostrarLiquidacion();



    }
}
