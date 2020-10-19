
/**
 *
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class MaquinaSandwich{
    //Estas variables son para usarlas... complete el valor inicial
    static final int CANTIDAD_BASE_QUESO = 3000;
    static final int CANTIDAD_BASE_MORTADELA_JAMON = 1000;
    static final int CANTIDAD_BASE_PAN = 100;
    static final int cantidadQueso;
    static final int cantidadMortadela;
    static final int cantidadJamon;
    static final int cantidadPanBlanco;
    static final int cantidadPanIntegral;
    static final int precioCompraQueso;
    static final int precioCompraMortadela;
    static final int precioCompraJamon;
    static final int precioCompraPanBlanco;
    static final int precioCompraPanIntegral;
    static final int ingresosPorVentas;
    
    MaquinaSandiwch(int queso, int jamon, int mortadela, int panIntegral, int panBlanco)
        this.cantidadQueso = queso+CANTIDAD_BASE_QUESO;
        this.cantidadMortadela=mortadela+CANTIDAD_BASE_MORTADELA_JAMON;
        this.cantidadJamon=Jamon+CANTIDAD_BASE_MORTADELA_JAMON;
        this.cantidadPanBlanco=panBlanco+CANTIDAD_BASE_PAN;
        this.cantidadPanIntegral=panIntegral+CANTIDAD_BASE_PAN;

    MaquinaSandwich() {

    }

    MaquinaSandwich(int precioCompraQueso, int precioCompraMortadela, int precioCompraJamon, int precioCompraPanBlanco, int precioCompraPanIntegral) {
      //Complete
    }

    public int calcularPrecioVenta(int tipoSandwich, int tipoPan) {
      //Complete
    }

    public int calcularCostoFabricacion(int tipoSandwich, int tipoPan) {
      //Complete
    }

    public boolean registrarVenta(int tipoSandwich, int tipoPan) {
      //Complete
    }

    //Complete

}
