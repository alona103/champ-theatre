package com.bootcamp.web.bean;

import com.bootcamp.web.entity.Employee;
import com.bootcamp.web.entity.Participant;
import com.bootcamp.web.entity.Reservation;
import com.bootcamp.web.entity.Theatre;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class ReservationBean {
    private Integer event_type;
    private String event_description;
    private Date eventDate;
    private Reservation.Status status;
    private Theatre theatre;
    private Employee booker;
    private Employee reviewer;
    private List<Participant> participants = new ArrayList<>();
}
