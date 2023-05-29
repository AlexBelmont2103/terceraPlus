package model;

import java.time.LocalDate;

/**
 *
 * @author AMG
 */
public class VehiculoCuatroRuedas extends Tributo implements Pagable {

    private String matricula;
    private Integer caballos;
    private final Double CUOTA = 0.43;

    public VehiculoCuatroRuedas(String NIF, LocalDate fecha_limite, String matricula, Integer caballos) {
        super(NIF, fecha_limite);
        this.matricula = matricula;
        this.caballos = caballos;
    }

    public VehiculoCuatroRuedas(String matricula, Integer caballos, Integer id, String NIF, LocalDate fecha_limite, LocalDate fecha_pagado, Double importe) {
        super(id, NIF, fecha_limite, fecha_pagado, importe);
        this.matricula = matricula;
        this.caballos = caballos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getCaballos() {
        return caballos;
    }

    public void setCaballos(Integer caballos) {
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("VehiculoDosRuedas{");
        sb.append("matricula=").append(matricula);
        sb.append(", caballos=").append(caballos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularImporte() {
        if (super.getFecha_limite().isBefore(super.getFecha_pagado())) {
            return this.caballos * CUOTA * 1.21;
        } else {
            return this.caballos * CUOTA;
        }

    }

}
