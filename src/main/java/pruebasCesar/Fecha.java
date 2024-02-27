package pruebasCesar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
    SimpleDateFormat formato;
    Date hoy;
    
    public Fecha() {
        hoy = new Date();
    }
    public String devuelveFecha(int tipo) {
        String cad = "";
        if (tipo == 1) {
            formato = new SimpleDateFormat("yyyy/MM");
            cad = formato.format(hoy);
        } else if (tipo == 2) {
            formato = new SimpleDateFormat("MM/yyyy");
            cad = formato.format(hoy);
        } else if (tipo == 3) {
            formato = new SimpleDateFormat("MM/yy");
            cad = formato.format(hoy);
        } else {
            cad  = "ERROR";
        }
        return cad;
    }
}

