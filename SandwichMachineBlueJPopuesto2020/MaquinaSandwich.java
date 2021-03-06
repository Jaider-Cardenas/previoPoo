/**
 *
 * @author (Jaider Stiven-1152048 y Julian Camilo Riveros 1152057)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class MaquinaSandwich{
    //Estas variables son para usarlas... complete el valor inicial
    static final int CANTIDAD_BASE_QUESO = 15;
    static final int CANTIDAD_BASE_MORTADELA_JAMON = 10;
    static final int CANTIDAD_BASE_PAN = 1;
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
    cantidadQueso=3000;
    cantidadMortadela=1000;
    cantidadJamon=1000;
    cantidadPanBlanco=100;
    cantidadPanIntegral=100;
    this.ingresosPorVentas=this.ingresosPorVentas;
    }
    
     MaquinaSandwich(int precioCompraQueso, int precioCompraMortadela, int precioCompraJamon, int precioCompraPanBlanco, int precioCompraPanIntegral) {
      //Complete
      this.precioCompraQueso=precioCompraQueso;
      this.precioCompraMortadela=precioCompraMortadela;
      this.precioCompraJamon=precioCompraJamon;
      this.precioCompraPanBlanco=precioCompraPanBlanco;
      this.precioCompraPanIntegral=precioCompraPanIntegral;
      cantidadQueso=3000;
    cantidadMortadela=1000;
    cantidadJamon=1000;
    cantidadPanBlanco=100;
    cantidadPanIntegral=100;
    this.ingresosPorVentas=this.ingresosPorVentas;
}

    public int calcularPrecioVenta(int tipoSandwich, int tipoPan) {
        int precio=0;
        calcularCostoFabricacion(tipoSandwich,tipoPan);
        
      if(tipoPan==1)
      {
        if(tipoSandwich==1)
      { precio= calcularCostoFabricacion(tipoSandwich,tipoPan)+calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100;}
       else if(tipoSandwich==2)
      { precio=calcularCostoFabricacion(tipoSandwich,tipoPan)+calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100;
        }
       else if(tipoSandwich==3)
      {precio= calcularCostoFabricacion(tipoSandwich,tipoPan)+calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100;
        }
        else if(tipoSandwich==4) 
      {precio=calcularCostoFabricacion(tipoSandwich,tipoPan)+calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100;
        }
        else if(tipoSandwich==5)
      {precio=calcularCostoFabricacion(tipoSandwich,tipoPan)+calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100;
        }
        else if(tipoSandwich==6)
      {precio=calcularCostoFabricacion(tipoSandwich,tipoPan)+calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100;
        }
    }
    
    else if(tipoPan==2)
      {
        if(tipoSandwich==1)
      {precio= calcularCostoFabricacion(tipoSandwich,tipoPan)+calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100;
        
        }
       else if(tipoSandwich==2)
      {precio= calcularCostoFabricacion(tipoSandwich,tipoPan)+calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100;
        }
       else if(tipoSandwich==3)
      {precio= calcularCostoFabricacion(tipoSandwich,tipoPan)+calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100;
        }
        else if(tipoSandwich==4) 
      {precio= calcularCostoFabricacion(tipoSandwich,tipoPan)+calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100;
        }
        else if(tipoSandwich==5)
      {precio= calcularCostoFabricacion(tipoSandwich,tipoPan)+calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100;
        }
        else if(tipoSandwich==6)
      {precio= calcularCostoFabricacion(tipoSandwich,tipoPan)+calcularCostoFabricacion(tipoSandwich,tipoPan)*35/100;
        }
    }
    else return precio;
      
    return precio;
      
    }

    public int calcularCostoFabricacion(int tipoSandwich, int tipoPan) {
      int costoF=0;
      getPrecioCompraQueso();
      getPrecioCompraMortadela();
      getPrecioCompraJamon();
      getPrecioCompraPanBlanco();
      getPrecioCompraPanIntegral();
      if(tipoPan==1)
      {
        if(tipoSandwich==1)
      {
          
          costoF= precioCompraQueso*15+precioCompraMortadela*10+precioCompraPanBlanco*1;
          
        }
       else if(tipoSandwich==2)
      { 
          costoF= precioCompraQueso*15+precioCompraJamon*10+precioCompraPanBlanco*1;
        }
       else if(tipoSandwich==3)
      {
          costoF=precioCompraQueso*30+precioCompraMortadela*20+precioCompraPanBlanco*2;
        }
        else if(tipoSandwich==4) 
      {
          costoF=precioCompraQueso*30+precioCompraJamon*20+precioCompraPanBlanco*2;
        }
        else if(tipoSandwich==5)
      {
          costoF=precioCompraQueso*45+precioCompraMortadela*30+precioCompraPanBlanco*3;
        }
        else if(tipoSandwich==6)
      {
          costoF=precioCompraQueso*45+precioCompraJamon*30+precioCompraPanBlanco*3;
        }
    }
    
    else if(tipoPan==2)
      {
        if(tipoSandwich==1)
      { costoF= precioCompraQueso*15+precioCompraMortadela*10+precioCompraPanIntegral*1;
          
        }
       else if(tipoSandwich==2)
      {costoF= precioCompraQueso*15+precioCompraJamon*10+precioCompraPanIntegral*1;
        }
       else if(tipoSandwich==3)
      {costoF= precioCompraQueso*30+precioCompraMortadela*20+precioCompraPanIntegral*2;
        }
        else if(tipoSandwich==4) 
      {costoF= precioCompraQueso*30+precioCompraJamon*20+precioCompraPanIntegral*2;
        }
        else if(tipoSandwich==5)
      {costoF=precioCompraQueso*45+precioCompraMortadela*30+precioCompraPanIntegral*3;
        }
        else if(tipoSandwich==6)
      { costoF=precioCompraQueso*45+precioCompraJamon*30+precioCompraPanIntegral*3;
        }
    }
    else return costoF;
    return costoF;
    }

    public boolean registrarVenta(int tipoSandwich, int tipoPan) {
      boolean v=false;
        if(tipoPan==1)
      {
        if(tipoSandwich==1 && cantidadQueso>=15 && cantidadMortadela>=10 & cantidadPanBlanco>=1)
      {
          cantidadQueso-=15;
          cantidadMortadela-=10;
          cantidadPanBlanco-=1;
          ingresosPorVentas+=calcularPrecioVenta(tipoSandwich, tipoPan);
          return v=true;
          
        }
       else if(tipoSandwich==2 && cantidadQueso>=15 && cantidadJamon>=10 & cantidadPanBlanco>=1)
      { cantidadQueso-=15;
          cantidadJamon-=10;
          cantidadPanBlanco-=1;
         ingresosPorVentas+=calcularPrecioVenta(tipoSandwich, tipoPan);
          return v=true;}
       else if(tipoSandwich==3 && cantidadQueso>=30 && cantidadMortadela>=20 & cantidadPanBlanco>=2)
      {cantidadQueso-=30;
          cantidadMortadela-=20;
          cantidadPanBlanco-=2;
          ingresosPorVentas+=calcularPrecioVenta(tipoSandwich, tipoPan);
          return v=true;}
        else if(tipoSandwich==4 && cantidadQueso>=30 && cantidadJamon>=20 & cantidadPanBlanco>=2) 
      {cantidadQueso-=30;
          cantidadJamon-=20;
          cantidadPanBlanco-=2;
          ingresosPorVentas+=calcularPrecioVenta(tipoSandwich, tipoPan);
          return v=true;}
        else if(tipoSandwich==5 && cantidadQueso>=45 && cantidadMortadela>=30 & cantidadPanBlanco>=3)
      {cantidadQueso-=45;
          cantidadMortadela-=30;
          cantidadPanBlanco-=3;
          ingresosPorVentas+=calcularPrecioVenta(tipoSandwich, tipoPan);
          return v=true;}
        else if(tipoSandwich==6  && cantidadQueso>=45 && cantidadJamon>=30 & cantidadPanBlanco>=3)
      {cantidadQueso-=45;
          cantidadJamon-=30;
          cantidadPanBlanco-=3;
        ingresosPorVentas+=calcularPrecioVenta(tipoSandwich, tipoPan);
          return v=true;
        }
    }
    
    else if(tipoPan==2)
      {
        if(tipoSandwich==1 && cantidadQueso>=15 && cantidadMortadela>=10 & cantidadPanIntegral>=1)
      { cantidadQueso-=15;
          cantidadMortadela-=10;
          cantidadPanIntegral-=1;
          ingresosPorVentas+=calcularPrecioVenta(tipoSandwich, tipoPan);
          return v=true;
          
        }
       else if(tipoSandwich==2 && cantidadQueso>=15 && cantidadJamon>=10 & cantidadPanIntegral>=1)
      {cantidadQueso-=15;
          cantidadJamon-=10;
          cantidadPanIntegral-=1;
          ingresosPorVentas+=calcularPrecioVenta(tipoSandwich, tipoPan);
          return v=true;
          
        }
       else if(tipoSandwich==3 && cantidadQueso>=30 && cantidadMortadela>=20 & cantidadPanIntegral>=2)
      {cantidadQueso-=30;
          cantidadMortadela-=20;
          cantidadPanIntegral-=2;
         ingresosPorVentas+=calcularPrecioVenta(tipoSandwich, tipoPan);
          return v=true;
        }
        else if(tipoSandwich==4&& cantidadQueso>=30 && cantidadJamon>=20 & cantidadPanIntegral>=2) 
      {cantidadQueso-=30;
          cantidadJamon-=20;
          cantidadPanIntegral-=2;
          ingresosPorVentas+=calcularPrecioVenta(tipoSandwich, tipoPan);
          return v=true;
        }
        else if(tipoSandwich==5 && cantidadQueso>=45 && cantidadMortadela>=30 & cantidadPanIntegral>=3)
      {cantidadQueso-=45;
          cantidadMortadela-=30;
          cantidadPanIntegral-=3;
          ingresosPorVentas+=calcularPrecioVenta(tipoSandwich, tipoPan);
          return v=true;
        }
        else if(tipoSandwich==6 && cantidadQueso>=45 && cantidadJamon>=30 & cantidadPanIntegral>=3)
      {cantidadQueso-=45;
          cantidadJamon-=30;
          cantidadPanIntegral-=3;
          ingresosPorVentas+=calcularPrecioVenta(tipoSandwich, tipoPan);
          return v=true;
        }
    } 
    else return v=false;
    
    return v;
}
    /**Getter method cantidadQueso*/
    public int getCantidadQueso(){
        return this.cantidadQueso;
    }//end method getCantidadQueso

    /**Setter method cantidadQueso*/
    public void setCantidadQueso(int cantidadQueso){
        this.cantidadQueso = cantidadQueso;
    }//end method setCantidadQueso

    /**Getter method cantidadMortadela*/
    public int getCantidadMortadela(){
        return this.cantidadMortadela;
    }//end method getCantidadMortadela

    /**Setter method cantidadMortadela*/
    public void setCantidadMortadela(int cantidadMortadela){
        this.cantidadMortadela = cantidadMortadela;
    }//end method setCantidadMortadela

    /**Getter method cantidadJamon*/
    public int getCantidadJamon(){
        return this.cantidadJamon;
    }//end method getCantidadJamon

    /**Setter method cantidadJamon*/
    public void setCantidadJamon(int cantidadJamon){
        this.cantidadJamon = cantidadJamon;
    }//end method setCantidadJamon

    /**Getter method cantidadPanBlanco*/
    public int getCantidadPanBlanco(){
        return this.cantidadPanBlanco;
    }//end method getCantidadPanBlanco

    /**Setter method cantidadPanBlanco*/
    public void setCantidadPanBlanco(int cantidadPanBlanco){
        this.cantidadPanBlanco = cantidadPanBlanco;
    }//end method setCantidadPanBlanco

    /**Getter method cantidadPanIntegral*/
    public int getCantidadPanIntegral(){
        return this.cantidadPanIntegral;
    }//end method getCantidadPanIntegral

    /**Setter method cantidadPanIntegral*/
    public void setCantidadPanIntegral(int cantidadPanIntegral){
        this.cantidadPanIntegral = cantidadPanIntegral;
    }//end method setCantidadPanIntegral

    /**Getter method precioCompraQueso*/
    public int getPrecioCompraQueso(){
        return this.precioCompraQueso;
    }//end method getPrecioCompraQueso

    /**Setter method precioCompraQueso*/
    public void setPrecioCompraQueso(int precioCompraQueso){
        this.precioCompraQueso = precioCompraQueso;
    }//end method setPrecioCompraQueso

    /**Getter method precioCompraMortadela*/
    public int getPrecioCompraMortadela(){
        return this.precioCompraMortadela;
    }//end method getPrecioCompraMortadela

    /**Setter method precioCompraMortadela*/
    public void setPrecioCompraMortadela(int precioCompraMortadela){
        this.precioCompraMortadela = precioCompraMortadela;
    }//end method setPrecioCompraMortadela

    /**Getter method precioCompraJamon*/
    public int getPrecioCompraJamon(){
        return this.precioCompraJamon;
    }//end method getPrecioCompraJamon

    /**Setter method precioCompraJamon*/
    public void setPrecioCompraJamon(int precioCompraJamon){
        this.precioCompraJamon = precioCompraJamon;
    }//end method setPrecioCompraJamon

    /**Getter method precioCompraPanBlanco*/
    public int getPrecioCompraPanBlanco(){
        return this.precioCompraPanBlanco;
    }//end method getPrecioCompraPanBlanco

    /**Setter method precioCompraPanBlanco*/
    public void setPrecioCompraPanBlanco(int precioCompraPanBlanco){
        this.precioCompraPanBlanco = precioCompraPanBlanco;
    }//end method setPrecioCompraPanBlanco

    /**Getter method precioCompraPanIntegral*/
    public int getPrecioCompraPanIntegral(){
        return this.precioCompraPanIntegral;
    }//end method getPrecioCompraPanIntegral

    /**Setter method precioCompraPanIntegral*/
    public void setPrecioCompraPanIntegral(int precioCompraPanIntegral){
        this.precioCompraPanIntegral = precioCompraPanIntegral;
    }//end method setPrecioCompraPanIntegral

    /**Getter method ingresosPorVentas*/
    public int getIngresosPorVentas(){
        return this.ingresosPorVentas;
    }//end method getIngresosPorVentas

    /**Setter method ingresosPorVentas*/
    public void setIngresosPorVentas(int ingresosPorVentas){
        
        this.ingresosPorVentas=this.ingresosPorVentas;
        
        
    }//end method setIngresosPorVentas
    
    /**Getter method ingresosPorVentas*/
    public int getIVA(){
        return ingresosPorVentas*19/100;
    }//end method getIngresosPorVentas

        /**Getter method ingresosPorVentas*/
    public int getCostosFijos(){
        return ingresosPorVentas*5/100;
    }//end method getIngresosPorVentas
    //End GetterSetterExtension Code
    
        /**Getter method ingresosPorVentas*/
    public int getRiesgos(){
        return ingresosPorVentas*1/100;
    }//end method getIngresosPorVentas
    
        /**Getter method ingresosPorVentas*/
    public int getGananciaNeta(){
        return ingresosPorVentas*10/100;
    }//end method getIngresosPorVentas
//!
}
