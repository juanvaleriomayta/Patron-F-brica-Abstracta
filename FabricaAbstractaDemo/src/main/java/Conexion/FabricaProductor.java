package Conexion;

import Interfaz.FabricaAbstracta;

public class FabricaProductor {

    public static FabricaAbstracta getFactory(String tipoFabrica) {

        if (tipoFabrica.equalsIgnoreCase("BD")) {
            return new ConexionBDFabrica();
        }

        return null;
    }

}
