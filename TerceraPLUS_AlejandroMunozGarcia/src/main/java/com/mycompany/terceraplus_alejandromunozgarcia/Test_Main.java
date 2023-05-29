package com.mycompany.terceraplus_alejandromunozgarcia;

import java.time.LocalDate;

/**
 *
 * @author AMG
 */
public class Test_Main {

    public static void main(String[] args) {
        String fecha="21/03/1990";
        
        LocalDate date = utils.UtilFechas.convertirString_LocalDate(fecha);
    }
}
