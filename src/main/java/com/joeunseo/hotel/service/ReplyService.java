package com.joeunseo.hotel.service;

import com.joeunseo.hotel.model.domain.ReplyModel;
import java.util.List;

public interface ReplyService {
    List<ReplyModel> getList(Long hotelId);
    ReplyModel getById(Long id);
    boolean insert(ReplyModel reply);
    boolean delete(Long id);
    boolean exists(Long id);
    long count();
    boolean update(ReplyModel reply);
}
