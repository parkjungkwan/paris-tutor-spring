package com.joeunseo.hotel.service;

import com.joeunseo.hotel.model.domain.BookingModel;
import java.util.List;

public interface BookingService {

    List<?> getListByUserId(Long userId);

    BookingModel getById(Long id);

    Boolean delete(Long id);

    Boolean confirm(BookingModel booking);

}
