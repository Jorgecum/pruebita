
package com.mycompany.wrapper_adapter;


public class PagoAdapter implements InPago {
    private APIPagos pagoexterno;

    public PagoAdapter() {
    }

    public PagoAdapter(APIPagos pagoexterno) {
        this.pagoexterno = pagoexterno;
    }

    @Override
    public void procesarPago(double monto) {
        pagoexterno.HacerPago(monto);
    }
    
    
   
    
}
