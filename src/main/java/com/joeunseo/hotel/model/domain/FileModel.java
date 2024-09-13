package com.joeunseo.hotel.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class FileModel {
    public Long id;
    private String fileName;
    private Long hotelId;

    private List<String> imagePaths;
    private String thumbnail;
}
