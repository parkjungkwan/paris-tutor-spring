package com.joeunseo.hotel.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Data
public class BookingModel {
    private Long id;
    private Long customerID;
    private boolean payment;
    private Long hotelId;
    private String hotelName;
    private java.sql.Date startEntry;
    private Date endEntry;
    private Double price;
    private boolean booked;
}
