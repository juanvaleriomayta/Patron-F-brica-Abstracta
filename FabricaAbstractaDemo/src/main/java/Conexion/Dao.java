package Conexion;

import Interfaz.FabricaAbstracta;
import Interfaz.IConexionBD;

public class Dao {

    public static void main(String[] args) {
        FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BDVALERIO");
        IConexionBD cxBD1 = fabricaBD.getBD("ORACLE");
        cxBD1.conectar();
    }

}
