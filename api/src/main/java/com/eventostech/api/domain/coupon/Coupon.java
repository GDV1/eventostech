package com.eventostech.api.domain.coupon;

import com.eventostech.api.domain.event.Event;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Table(name = "coupon")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private Date valid;
    private Integer discount;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
