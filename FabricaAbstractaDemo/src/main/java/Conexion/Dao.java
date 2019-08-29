package Conexion;

import Interfaz.FabricaAbstracta;
import Interfaz.IConexionBD;

public class Dao {

    public static void main(String[] args) {
        FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
        IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");
        cxBD1.conectar();
    }

}
