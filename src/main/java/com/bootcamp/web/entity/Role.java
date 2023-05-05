package com.bootcamp.web.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ROLES")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Role implements Serializable {

    private static final long serialVersionUID = -5903152485023248859L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom_role_sequence")
    @SequenceGenerator(sequenceName = "role_sequence", name = "custom_role_sequence", allocationSize = 1)
    private Long id;
    
    @Column(columnDefinition = "VARCHAR(30)", nullable = false, unique = true)
    private String role;
    
    

}
