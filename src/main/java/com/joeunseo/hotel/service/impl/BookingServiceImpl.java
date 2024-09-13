package com.joeunseo.hotel.service.impl;

import com.joeunseo.hotel.model.domain.BookingModel;
import com.joeunseo.hotel.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {
    public SqlSession SESSION;
    private final String NAMESPACE = "mapper.BookingMapper";

    @Override
    public List<?> getListByUserId(Long userId) {
        return List.of();
    }

    @Override
    public BookingModel getById(Long id) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public Boolean confirm(BookingModel booking) {
        return null;
    }

    //    public List<BookingModel> bucketByUserId(int userId){
//        return SESSION.selectList(NAMESPACE+".bucketByUserId",userId);
//    }
//
//    public List<BookingModel> bucketCheckedByUserId(int userId){
//        return SESSION.selectList(NAMESPACE+".bucketCheckedByUserId",userId);
//    }
//    public void updatePayment(int bucketId) {
//        SESSION.update(NAMESPACE+".updatePayment",bucketId);
//    }
//    public void cancelPayment(int bucketId) {
//        SESSION.update(NAMESPACE+".cancelPayment",bucketId);
//    }
//
//    public boolean deleteBookingById(int bucketId) {
//        int result = SESSION.delete(NAMESPACE + ".deleteOne",bucketId);
//        return result > 0; //삭제 성공 시 1 반환
//    }
//
//    public List<BookingModel> selectAll() {
//        return SESSION.selectList(NAMESPACE + ".selectAll");
//    }
//
//    public BookingModel selectOne(int id) {
//        return SESSION.selectOne(NAMESPACE + ".selectOne", id);
//    }
//
//    public void insert(BookingModel bucketModel) {
//        System.out.println("장바구니 넣을 data:"+ bucketModel.toString());
//        SESSION.insert(NAMESPACE + ".insert", bucketModel);
//    }
//
//    public void update(BookingModel bucketModel) {
//        SESSION.update(NAMESPACE + ".update", bucketModel);
//    }
//
//    public void delete(int id) {
//        SESSION.delete(NAMESPACE + ".delete", id);
//    }
//    public boolean checkDupicate(int hotelId,int customerId){
//        Map<String,Integer> checkInfo = new HashMap<>();
//        checkInfo.put("hotelId",hotelId);
//        checkInfo.put("customerId",customerId);
//        System.out.println("map-호텔ID:"+checkInfo.get("hotelId"));
//        System.out.println("map-고객ID:"+checkInfo.get("customerId"));
//        int count = SESSION.selectOne(NAMESPACE + ".checkDuplicate",checkInfo);
//        return count >= 1; //count 2 이상인지에 대한 boolean (중복이면 true)
//    }

}