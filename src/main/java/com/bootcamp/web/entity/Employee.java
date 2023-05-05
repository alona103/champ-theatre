package com.bootcamp.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EMPLOYEES")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Employee implements Serializable {

    private static final long serialVersionUID = -5903152485023248859L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom_user_sequence")
    @SequenceGenerator(sequenceName = "user_sequence", name = "custom_user_sequence", allocationSize = 1)
    private Long id;
    
    @Column(columnDefinition = "VARCHAR(30)", nullable = false, unique = true)
    private String username;
    
    @Column(columnDefinition = "VARCHAR(30)", nullable = false, unique = true)
    private String password;

    @Column(columnDefinition = "VARCHAR(75)", nullable = false)
    private String firstName;

    @Column(columnDefinition = "VARCHAR(75)", nullable = false)
    private String lastName;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false, unique = true)
    private String email;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;

    
}
