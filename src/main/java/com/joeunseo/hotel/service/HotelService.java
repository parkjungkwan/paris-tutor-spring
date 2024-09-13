package com.joeunseo.hotel.service;

import com.joeunseo.hotel.model.domain.HotelModel;

import java.util.List;

public interface HotelService {

    HotelModel getListBySellerId(Long sellerId);

    List<?> getList(HotelModel hotel);

    HotelModel getById(Long id);

    Boolean insert(HotelModel hotel);

    Boolean update(HotelModel hotel);

    Boolean delete(Long id);

    List<HotelModel> selectAll();

}
