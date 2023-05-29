package model;

import java.time.LocalDate;

/**
 *
 * @author AMG
 */
public class BienesInmuebles extends Tributo implements Pagable {

    private Integer metros;
    private String refCatastro;
    private final Double CUOTA = 1.10;

    public BienesInmuebles(String NIF, LocalDate fecha_limite, Integer metros, String refCatastro) {
        super(NIF, fecha_limite);
        this.metros = metros;
        this.refCatastro = refCatastro;
    }

    public BienesInmuebles(Integer metros, String refCatastro, Integer id, String NIF, LocalDate fecha_limite, LocalDate fecha_pagado, Double importe) {
        super(id, NIF, fecha_limite, fecha_pagado, importe);
        this.metros = metros;
        this.refCatastro = refCatastro;
    }

    public Integer getMetros() {
        return metros;
    }

    public void setMetros(Integer metros) {
        this.metros = metros;
    }

    public String getRefCatastro() {
        return refCatastro;
    }

    public void setRefCatastro(String refCatastro) {
        this.refCatastro = refCatastro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("BienesInmuebles{");
        sb.append("metros=").append(metros).toString();
        sb.append(", refCatastro=").append(refCatastro);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularImporte() {
        if (super.getFecha_limite().isBefore(super.getFecha_pagado())) {
            return this.metros * CUOTA * 1.21;
        } else {
            return this.metros * CUOTA;
        }

    }

}
