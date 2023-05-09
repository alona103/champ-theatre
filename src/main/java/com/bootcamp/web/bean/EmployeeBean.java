package com.bootcamp.web.bean;

import com.bootcamp.web.entity.EmployeeAccount;
import com.bootcamp.web.entity.Participant;
import com.bootcamp.web.entity.Reservation;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class EmployeeBean {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Participant> participants = new ArrayList<>();
    private List<Reservation> reservations1 = new ArrayList<>();
    private List<Reservation> reservations2 = new ArrayList<>();
    private EmployeeAccount employeeAccount;
}
