package utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author AMG
 */
public class UtilFechas {

    public static String convertirLocalDateTime_String(LocalDateTime dateTime) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        return formattedDateTime;
    }

    public static String convertirLocalDate_String_yyyyMMdd(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String formattedDate = date.format(formatter);
        return formattedDate;

    }

    public static java.sql.Date convertirLocalDate_SqlDate(LocalDate fecha) {
        return java.sql.Date.valueOf(fecha);
    }
    
    public static LocalDate convertirsqlDate_LocalDate(java.sql.Date fecha){
        return fecha.toLocalDate();
    }

    public static LocalDate convertirString_LocalDate(String yyyyMMdd) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate fechaLocalDate = LocalDate.parse(yyyyMMdd, formatter);
        return fechaLocalDate;
    }

    public static String nombreFichero(String currentDate, String usuario) {
        String ruta;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        ruta = usuario + currentDate + ".txt";
        return ruta;
    }

    public static String convertirLocalTime_String(LocalTime time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = time.format(formatter);
        return formattedTime;
    }

    public static Long convertirDateTime_Long(LocalDateTime dateTime) {
        return dateTime.toEpochSecond(ZoneOffset.UTC) * 1000;
    }

    public static LocalDateTime convertirLong_DateTime(Long dateTime) {
        return LocalDateTime.ofEpochSecond(dateTime, 0, ZoneOffset.UTC);
    }

    public static LocalDateTime convertirString_LocalDateTime(String fechaHoraString) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return LocalDateTime.parse(fechaHoraString, formatter);
    }

}
