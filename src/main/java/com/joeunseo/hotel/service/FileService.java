package com.joeunseo.hotel.service;

import com.joeunseo.hotel.model.domain.FileModel;
import com.joeunseo.hotel.model.domain.HotelModel;

import java.util.List;

public interface FileService {

    List<?> getList(FileModel files);

    HotelModel getByHotelId(Long hotelId);

    Boolean uploads(FileModel files);

    Boolean update(FileModel files);

    Boolean delete(Long id);
}
