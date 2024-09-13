package com.joeunseo.hotel.service.impl;

import com.joeunseo.hotel.model.domain.HotelModel;
import com.joeunseo.hotel.service.HotelService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final SqlSession SESSION;
    private final String NAMESPACE = "mapper.HotelMapper";
    private final int PAGE_SIZE = 15;


    @Override
    public List<HotelModel> selectAll() {
        return SESSION.selectList(NAMESPACE + ".selectAll");
    }

    @Override
    public HotelModel getListBySellerId(Long sellerId) {
        return null;
    }

    @Override
    public List<?> getList(HotelModel hotel) {
        return SESSION.selectList(NAMESPACE + ".selectList", hotel);
    }

    @Override
    public HotelModel getById(Long id) {
        return null;
    }

    @Override
    public Boolean insert(HotelModel hotel) {
        try{
            int result = SESSION.insert(NAMESPACE + ".insert", hotel);
            return result >0;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public Boolean update(HotelModel hotel) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        int deleteCount = SESSION.delete(NAMESPACE + ".delete", id);
        return deleteCount >0;
    }

}