package pruebasCesar2;

public class AplicacionBancaria {

    public String procesarOperacion(String codigoBanco, 
            String codigoSucursal, 
            String clavePersonal, 
            String orden) {
        
        if (!esCodigoBancoValido(codigoBanco)) {
            return "E1: Error en CODIGO DE BANCO";
        }
        
        if (!esCodigoSucursalValido(codigoSucursal)) {
            return "E2: Error en CODIGO DE SUCURSAL";
        }
        
        if (!esClavePersonalValida(clavePersonal)) {
            return "E1: Error en CLAVE PERSONAL";
        }

        switch (orden) {
            case "Talonario":
                return "Talonario de cheques";
            case "Movimientos":
                return "Movimientos del mes";
            case "":
                return "Talonario de cheques y Movimientos del mes";
            default:
                return "Error en la entrada de datos";
        }
    }

    private boolean esCodigoBancoValido(String codigoBanco) {
        if (codigoBanco.isEmpty()) return true;
        if (codigoBanco.length() != 3) return false;
        return codigoBanco.charAt(0) > codigoBanco.charAt(2);
    }

    private boolean esCodigoSucursalValido(String codigoSucursal) {
        return codigoSucursal.matches("\\d{5}");
    }

    private boolean esClavePersonalValida(String clavePersonal) {
        return clavePersonal.matches("[a-zA-Z0-9]{5}");
    }

    public static void main(String[] args) {
        AplicacionBancaria app = new AplicacionBancaria();
        String resultado = app.procesarOperacion("302", 
                "26345", "abc12", 
                "Talonario");
        
        System.out.println(resultado);
    }
}

