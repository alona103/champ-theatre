package com.bootcamp.web.bean;

import com.bootcamp.web.entity.Reservation;
import com.bootcamp.web.entity.Theatre;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class TheatreBean {
    private String name;
    private Theatre.Status status;
    private Integer capacity;
    private List<Reservation> reservations = new ArrayList<>();
}
