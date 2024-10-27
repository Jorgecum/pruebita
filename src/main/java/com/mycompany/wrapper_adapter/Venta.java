
package com.mycompany.wrapper_adapter;


public class Venta {
    private InPago procesarpago;

    public Venta() {
    }

    public Venta(InPago procesarpago) {
        this.procesarpago = procesarpago;
    }
    
    public void agregarItem(String item, double monto){
        System.out.println("Vendiendo el producto " + item + "a un monto de " + monto);
        procesarpago.procesarPago(monto);
    }

    @Override
    public String toString() {
        return "Venta{" + "procesarpago=" + procesarpago + '}';
    }
    
    
}
