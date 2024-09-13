package com.joeunseo.hotel.model.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelModel {
    public Long id;
    public String name;
    public String address;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public Date startEntry;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public boolean booked;
    public double price;
    public Long sellerId;
    public String content;
    public String shortContent;
    public Long roomNumber;
    public Long roomType;
    public Long roomMember;
    public String nickname;
//    private Integer startRow;
//    private Integer size;
}
