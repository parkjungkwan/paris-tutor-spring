package com.joeunseo.hotel.service.impl;
import com.joeunseo.hotel.model.domain.UserModel;
import com.joeunseo.hotel.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.SqlSession;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final String NAMESPACE = "mapper.UserMapper";
    public SqlSession SESSION;

    @Override
    public Boolean authSuccess(Long id) {
        return null;
    }

    @Override
    public Boolean authenticateUser(UserModel user) {
        return null;
    }

    @Override
    public UserModel getById(Long id) {
        return null;
    }

    @Override
    public Boolean authFail(Long id) {
        return null;
    }

    @Override
    public Boolean logout(Long id) {
        return null;
    }

    @Override
    public Boolean register(UserModel user) {
        return null;
    }

    @Override
    public UserModel getList(UserModel user) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public Boolean updateRole(Long userId, Long role) {
        return null;
    }

    @Override
    public Boolean update(UserModel user) {
        return null;
    }

    //    public UserModel selectOne(int userid){
//        return SESSION.selectOne(NAMESPACE+".selectOne",userid);
//    }
//    public List<UserModel> selectAll(){
//        return SESSION.selectList(NAMESPACE+".selectAll");
//    }
//    public UserModel selectOneByID(int userId){
//        return SESSION.selectOne(NAMESPACE+".selectByUserId",userId);
//    }
//
//    public int deleteUserById(int userId){
//        return SESSION.delete(NAMESPACE+".deleteByUserID",userId);
//
//    }
//    public int updateUserRole(int userId, String role){
//        Map<String, Object> params = new HashMap<>();
//        params.put("userId", userId);
//        params.put("role", role);
//        System.out.println("role 수정요청 들어옴 - "+"userId :"+userId+", role(String) :"+role);
//        return SESSION.update(NAMESPACE + ".updateUserRole", params);
//    }
//    public UserModel selectByUsername(String username) { //회원가입 시 검증
//        return SESSION.selectOne(NAMESPACE + ".selectByUsername", username);
//    }
//    public void register(UserModel userModel){
//        SESSION.insert(NAMESPACE + ".register", userModel);
//    }

}