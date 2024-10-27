

package com.mycompany.wrapper_adapter;


public class Wrapper_Adapter {

    public static void main(String[] args) {
        //crear api externo (lo que viene de otro sistema)
        APIPagos api = new APIPagos();//externo
        
        InPago pago = new PagoAdapter(api) ; //integre
        
        Venta ven = new Venta(pago); //el de nosotros
        
        ven.agregarItem("Laptop", 5000);
        ven.agregarItem("Impresora", 3000);
        
        System.out.println(ven.toString());
    }
}
