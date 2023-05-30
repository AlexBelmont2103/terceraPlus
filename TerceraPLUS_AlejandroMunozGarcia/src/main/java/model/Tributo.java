package model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author AMG
 */
public abstract class Tributo {

    private Integer id;
    private String NIF;
    private LocalDate fecha_limite;
    private LocalDate fecha_pagado;
    private Double importe;

    public Tributo(String NIF, LocalDate fecha_limite) {
        this.NIF = NIF;
        this.fecha_limite = fecha_limite;
    }

    public Tributo(Integer id, String NIF, LocalDate fecha_limite, LocalDate fecha_pagado, Double importe) {
        this.id = id;
        this.NIF = NIF;
        this.fecha_limite = fecha_limite;
        this.fecha_pagado = fecha_pagado;
        this.importe = importe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReferencia() {
        return id;
    }

    public void setReferencia(Integer id) {
        this.id = id;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public LocalDate getFecha_limite() {
        return fecha_limite;
    }

    public void setFecha_limite(LocalDate fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    public LocalDate getFecha_pagado() {
        return fecha_pagado;
    }

    public void setFecha_pagado(LocalDate fecha_pagado) {
        this.fecha_pagado = fecha_pagado;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tributo other = (Tributo) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tributo{");
        sb.append("id=").append(id).toString();
        sb.append(", NIF=").append(NIF);
        sb.append(", fecha_limite=").append(fecha_limite);
        sb.append(", fecha_pagado=").append(fecha_pagado);
        sb.append(", importe=").append(importe);
        sb.append('}');
        return sb.toString();
    }

}
