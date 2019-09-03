package Conexion;

import Interfaz.FabricaAbstracta;

public class FabricaProductor {

    public static FabricaAbstracta getFactory(String tipoFabrica) {

        if (tipoFabrica.equalsIgnoreCase("BDVALERIO")) {
            return new ConexionBDFabrica();
        }

        return null;
    }

}
