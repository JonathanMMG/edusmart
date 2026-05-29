package com.espe_plus.persistence;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_cursos_base")
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long idCurso;

    @Column(name = "nombre_curso", length = 120, unique = true, nullable = false)
    private String nombreCurso;

    @Column(name = "precio_usd", precision = 10, scale = 2, nullable = false)
    private BigDecimal precioUsd;

    @Column(name = "horas_duracion", nullable = false)
    private Integer horasDuracion;

    public CursoEntity() {
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public BigDecimal getPrecioUsd() {
        return precioUsd;
    }

    public void setPrecioUsd(BigDecimal precioUsd) {
        this.precioUsd = precioUsd;
    }

    public Integer getHorasDuracion() {
        return horasDuracion;
    }

    public void setHorasDuracion(Integer horasDuracion) {
        this.horasDuracion = horasDuracion;
    }
}