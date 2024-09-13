package com.joeunseo.hotel.model.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    // implements UserDetails
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private String role;
    //private List<GrantedAuthority> authorities;


}
