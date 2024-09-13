package com.joeunseo.hotel.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class ReplyModel {
    private Long id;
    private Long customerId;
    private Long hotelId;
    private String title;
    private String content;
    private Date entryDate;
    private Date modifyDate;
    private Long score;

    private String nickname;
    private Long roomType;
    private Date startEntry;
    private String name;
}
