package model;

import java.time.LocalDate;

/**
 *
 * @author AMG
 */
public class VehiculoDosRuedas extends Tributo implements Pagable {

    private String matricula;
    private Integer cilindrada;
    private final Double CUOTA = 0.08;

    public VehiculoDosRuedas(String NIF, LocalDate fecha_limite, String matricula, Integer cilindrada) {
        super(NIF, fecha_limite);
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }

    public VehiculoDosRuedas(String matricula, Integer cilindrada, Integer id, String NIF, LocalDate fecha_limite, LocalDate fecha_pagado, Double importe) {
        super(id, NIF, fecha_limite, fecha_pagado, importe);
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("VehiculoDosRuedas{");
        sb.append("matricula=").append(matricula);
        sb.append(", cilindrada=").append(cilindrada);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularImporte() {
        if (super.getFecha_limite().isBefore(super.getFecha_pagado())) {
            return this.cilindrada * CUOTA * 1.21;
        } else {
            return this.cilindrada * CUOTA;
        }

    }

}
