package com.joeunseo.hotel.service.impl;

import com.joeunseo.hotel.model.domain.ReplyModel;
import com.joeunseo.hotel.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {
    private final SqlSession SESSION;
    private final String NAMESPACE = "mapper.ReplyMapper";

    @Override
    public List<ReplyModel> getList(Long hotelId) {
        return List.of();
    }

    @Override
    public ReplyModel getById(Long id) {
        return null;
    }

    @Override
    public boolean insert(ReplyModel reply) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean update(ReplyModel reply) {
        return false;
    }

    //    public void insert(ReplyModel replyModel) {
//        SESSION.insert(NAMESPACE + ".insert", replyModel);
//    }
//
//    public List<ReplyModel> selectList(int hotelId, int page, int size, String sort) {
//        HashMap<Object, Object> params = new HashMap<>();
//        params.put("hotelId", hotelId);
//        params.put("startRow", (page - 1) * size);
//        params.put("size", size);
//        params.put("sort", sort);
//        return SESSION.selectList(NAMESPACE + ".selectList", params);
//    }
//
//    public int getTotalCount(int hotelId) {
//        return SESSION.selectOne(NAMESPACE + ".getTotalCount", hotelId);
//    }
//
//    public double getTotalScore(int hotelId) {
//        Double totalScore = SESSION.selectOne(NAMESPACE + ".getTotalScore", hotelId);
//        if (totalScore == null) {
//            totalScore = 0.0; // 기본값 설정
//        }
//        return totalScore;
//    }
//
//    public ReplyModel selectOne(int id) {
//        return SESSION.selectOne(NAMESPACE + ".selectOne", id);
//    }
//
//    public boolean update(ReplyModel replyModel) {
//        int updateRows = SESSION.update(NAMESPACE + ".update", replyModel);
//        return updateRows > 0;
//    }
//
//    public void delete(int id) {
//        SESSION.delete(NAMESPACE + ".delete", id);
//    }
}