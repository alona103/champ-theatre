package com.bootcamp.web.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

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
@Table(name = "RESERVATIONS")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Reservation implements Serializable {

    private static final long serialVersionUID = -5903152485023248859L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom_user_sequence")
    @SequenceGenerator(sequenceName = "user_sequence", name = "custom_user_sequence", allocationSize = 1)
    private Long id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "theater_id")
    private Theater theater;
    
    @Column(columnDefinition = "VARCHAR(30)", nullable = false, unique = true)
    private String event_type;
    
    @Column(columnDefinition = "BIGINT(20)", nullable = false, unique = true)
    private Long status;

    @Column(name = "created_date", columnDefinition = "TIMESTAMP", nullable = false)
    private Date createdDate;

    @Column(name = "modified_date", columnDefinition = "TIMESTAMP", nullable = false)
    private Date modifiedDate;

    @Column(name = "event_date", columnDefinition = "DATE", nullable = false)
    private LocalDate eventDate;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false, unique = true)
    private String description;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    
}
