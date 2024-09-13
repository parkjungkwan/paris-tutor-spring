package com.joeunseo.hotel.controller;

import com.joeunseo.hotel.model.domain.UserModel;
import com.joeunseo.hotel.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService service;
//    private final AuthenticationManager authenticationManager;

    @GetMapping("")
    public ResponseEntity<Boolean> authSuccess(@RequestParam Long id) {
        return ResponseEntity.ok(service.authSuccess(id));
    }
    
    @PostMapping("/auth")
    public ResponseEntity<Boolean> authenticateUser(@RequestBody UserModel user) {
       return ResponseEntity.ok(service.authenticateUser(user));
    }

    @PostMapping("")
    public ResponseEntity<UserModel> getById(@RequestBody Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping("/authFail/{id}")
    public ResponseEntity<Boolean> authFail(@PathVariable Long id) {
        return ResponseEntity.ok(service.authFail(id));
    }

    @GetMapping("/logout")
    public ResponseEntity<Boolean> logout(@PathVariable Long id) {
        return ResponseEntity.ok(service.logout(id));
    }
//    Authentication authentication

    @PostMapping("/register")
    public ResponseEntity<Boolean> register(@RequestBody UserModel user) {
        return ResponseEntity.ok(service.register(user));
    }

    @PutMapping("{id}")
    public ResponseEntity<Boolean> update(@PathVariable Long id, @RequestBody UserModel user){
        return ResponseEntity.ok(service.update(user));
    }

    @PostMapping("/group") //ADMIN - User 목록
    public ResponseEntity<UserModel> getList(@RequestBody UserModel user) {
        return ResponseEntity.ok(service.getList(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return ResponseEntity.ok(service.delete(id));
    }

    @PatchMapping("")
    public ResponseEntity<Boolean> updateRole(@RequestParam Long userId, @RequestParam Long role) {
        return ResponseEntity.ok(service.updateRole(userId,role));
    }
}
