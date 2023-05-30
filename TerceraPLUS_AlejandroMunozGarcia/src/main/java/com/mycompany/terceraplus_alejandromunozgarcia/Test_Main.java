package com.mycompany.terceraplus_alejandromunozgarcia;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author AMG
 */
public class Test_Main {

    public static void main(String[] args) {
        try {
            Connection con = conexion.Conexion.getConnection();
            DAO_Tributos dao = new DAO_Tributos(con);
            BienesInmuebles bi = dao.selectBI("A6");
            System.out.println(bi.getImporte());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test_Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Test_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
