package com.bootcamp.web.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "THEATERS")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Theatre extends AbstractEntity {


    private static final long serialVersionUID = -127860149735454233L;

	@Column(columnDefinition = "VARCHAR(75)", nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer status;
    
    @Column(name = "capacity", columnDefinition = "SMALLINT", nullable = false)
    private Integer capacity;
    
    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservation> reservations = new ArrayList<>();
   
    
}
