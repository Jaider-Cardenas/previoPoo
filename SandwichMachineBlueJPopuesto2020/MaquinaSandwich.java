
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
     int cantidadQueso;
     int cantidadMortadela;
     int cantidadJamon;
     int cantidadPanBlanco;
     int cantidadPanIntegral;
     int precioCompraQueso;
    int precioCompraMortadela;
     int precioCompraJamon;
    int precioCompraPanBlanco;
    int precioCompraPanIntegral;
     int ingresosPorVentas;

    MaquinaSandwich() {

    }

    MaquinaSandwich(int precioCompraQueso, int precioCompraMortadela, int precioCompraJamon, int precioCompraPanBlanco, int precioCompraPanIntegral) {
      //Complete
      this.precioCompraQueso=precioCompraQueso;
      this.precioCompraMortadela=precioCompraMortadela;
      this.precioCompraJamon=precioCompraJamon;
      this.precioCompraPanBlanco=precioCompraPanBlanco;
      this.precioCompraPanIntegral=precioCompraPanIntegral;
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
