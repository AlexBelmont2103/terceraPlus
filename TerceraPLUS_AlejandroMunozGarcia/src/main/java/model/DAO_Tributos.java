package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author AMG
 */
public class DAO_Tributos {

    private static Connection con;

    public DAO_Tributos(Connection con) {
        this.con = con;
    }

    public void insertBI(BienesInmuebles bi) throws SQLException {
        String sql = "insert into bienesInmuebles(nif, pago, metros, referencia) values(?, ?, ?, ?)";
        PreparedStatement sentencia = null;
        sentencia = con.prepareStatement(sql);
        sentencia.setString(1, bi.getNIF());
        sentencia.setDate(2, utils.UtilFechas.convertirLocalDate_SqlDate(bi.getFecha_limite()));
        sentencia.setDouble(3, bi.getMetros());
        sentencia.setString(4, bi.getRefCatastro());
        sentencia.executeUpdate();
        sentencia.close();
    }

    public void insertCR(VehiculoCuatroRuedas vc) throws SQLException {
        String sql = "insert into cuatroRuedad(nif, pago, caballos, matricula) values(?, ?, ?, ?)";
        PreparedStatement sentencia = null;
        sentencia = con.prepareStatement(sql);
        sentencia.setString(1, vc.getNIF());
        sentencia.setDate(2, utils.UtilFechas.convertirLocalDate_SqlDate(vc.getFecha_limite()));
        sentencia.setDouble(3, vc.getCaballos());
        sentencia.setString(4, vc.getMatricula());
        sentencia.executeUpdate();
        sentencia.close();
    }

    public void insertDR(VehiculoDosRuedas vd) throws SQLException {
        String sql = "insert into bienesInmuebles(nif, pago, metros, referencia) values(?, ?, ?, ?)";
        PreparedStatement sentencia = null;
        sentencia = con.prepareStatement(sql);
        sentencia.setString(1, vd.getNIF());
        sentencia.setDate(2, utils.UtilFechas.convertirLocalDate_SqlDate(vd.getFecha_limite()));
        sentencia.setDouble(3, vd.getCilindrada());
        sentencia.setString(4, vd.getMatricula());
        sentencia.executeUpdate();
        sentencia.close();
    }

    public BienesInmuebles selectBI(String ref) throws SQLException {
        BienesInmuebles elegido = null;
        String sql = "select * from bienesInmuebles where referencia = ?";
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        sentencia = con.prepareStatement(sql);
        sentencia.setString(1, ref);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            Integer id = resultado.getInt(1);
            String nif = resultado.getString(2);
            LocalDate pago = utils.UtilFechas.convertirsqlDate_LocalDate(resultado.getDate(3));
            LocalDate pagado = utils.UtilFechas.convertirsqlDate_LocalDate(resultado.getDate(4));
            Integer metros = resultado.getInt(5);
            String referencia = resultado.getString(6);
            Double importe = resultado.getDouble(7);

            elegido = new BienesInmuebles(metros, referencia, id, nif, pago, pagado, importe);

        }
        return elegido;
    }

    public VehiculoCuatroRuedas selectCR(String ref) throws SQLException {
        VehiculoCuatroRuedas elegido = null;
        String sql = "select * from bienesInmuebles where referencia = ?";
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        sentencia = con.prepareStatement(sql);
        sentencia.setString(1, ref);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            Integer id = resultado.getInt(1);
            String nif = resultado.getString(2);
            LocalDate pago = utils.UtilFechas.convertirsqlDate_LocalDate(resultado.getDate(3));
            LocalDate pagado = utils.UtilFechas.convertirsqlDate_LocalDate(resultado.getDate(4));
            Integer caballos = resultado.getInt(5);
            String matricula = resultado.getString(6);
            Double importe = resultado.getDouble(7);

            elegido = new VehiculoCuatroRuedas(matricula, caballos, id, nif, pago, pagado, importe);

        }
        return elegido;
    }

    public VehiculoDosRuedas selectDR(String ref) throws SQLException {
        VehiculoDosRuedas elegido = null;
        String sql = "select * from bienesInmuebles where referencia = ?";
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        sentencia = con.prepareStatement(sql);
        sentencia.setString(1, ref);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            Integer id = resultado.getInt(1);
            String nif = resultado.getString(2);
            LocalDate pago = utils.UtilFechas.convertirsqlDate_LocalDate(resultado.getDate(3));
            LocalDate pagado = utils.UtilFechas.convertirsqlDate_LocalDate(resultado.getDate(4));
            Integer cilindrada = resultado.getInt(5);
            String matricula = resultado.getString(6);
            Double importe = resultado.getDouble(7);

            elegido = new VehiculoDosRuedas(matricula, cilindrada, id, nif, pago, pagado, importe);

        }
        return elegido;
    }

    public void updatePagadoBI(String referencia) throws SQLException {
        String sql = "update bienesInmuebles set pagado = ? where referencia = ?";
        LocalDate hoy = LocalDate.now();
        PreparedStatement sentencia = null;
        sentencia = con.prepareStatement(sql);
        sentencia.setDate(1, utils.UtilFechas.convertirLocalDate_SqlDate(hoy));
        sentencia.setString(2, referencia);
        sentencia.executeUpdate();
        sentencia.close();
    }

    public void updatePagadoCR(String matricula) throws SQLException {
        String sql = "update CuatroRuedas set pagado = ? where matricula = ?";
        LocalDate hoy = LocalDate.now();
        PreparedStatement sentencia = null;
        sentencia = con.prepareStatement(sql);
        sentencia.setDate(1, utils.UtilFechas.convertirLocalDate_SqlDate(hoy));
        sentencia.setString(2, matricula);
        sentencia.executeUpdate();
        sentencia.close();
    }

    public void updatePagadoDR(String matricula) throws SQLException {
        String sql = "update dosRuedas set pagado = ? where matricula = ?";
        LocalDate hoy = LocalDate.now();
        PreparedStatement sentencia = null;
        sentencia = con.prepareStatement(sql);
        sentencia.setDate(1, utils.UtilFechas.convertirLocalDate_SqlDate(hoy));
        sentencia.setString(2, matricula);
        sentencia.executeUpdate();
        sentencia.close();
    }

    public void updateImporteBI(String referencia, Double importe) throws SQLException {
        String sql = "update bienesInmuebles set importe = ? where referencia = ?";
        LocalDate hoy = LocalDate.now();
        PreparedStatement sentencia = null;
        sentencia = con.prepareStatement(sql);
        sentencia.setDouble(1, importe);
        sentencia.setString(2, referencia);
        sentencia.executeUpdate();
        sentencia.close();
    }

    public void updateImporteCR(String matricula, Double importe) throws SQLException {
        String sql = "update cuatroRuedas set importe = ? where referencia = ?";
        LocalDate hoy = LocalDate.now();
        PreparedStatement sentencia = null;
        sentencia = con.prepareStatement(sql);
        sentencia.setDouble(1, importe);
        sentencia.setString(2, matricula);
        sentencia.executeUpdate();
        sentencia.close();
    }

    public void updateImporteDR(String matricula, Double importe) throws SQLException {
        String sql = "update dosRuedas set importe = ? where referencia = ?";
        LocalDate hoy = LocalDate.now();
        PreparedStatement sentencia = null;
        sentencia = con.prepareStatement(sql);
        sentencia.setDouble(1, importe);
        sentencia.setString(2, matricula);
        sentencia.executeUpdate();
        sentencia.close();
    }

}
