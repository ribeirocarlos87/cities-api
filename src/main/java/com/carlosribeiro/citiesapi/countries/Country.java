package com.carlosribeiro.citiesapi.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {
    @Id
    private Long id; //mesmo nome da coluna do bd nao precisa mapear!!

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String PortugueseName;

    @Column(name="sigla")
    private String code;

    private Integer bacen;

public Long Country() {
    return id;
}


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPortugueseName() {
        return PortugueseName;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }
}
