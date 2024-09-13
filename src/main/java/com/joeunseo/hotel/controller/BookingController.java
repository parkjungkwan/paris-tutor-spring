package com.joeunseo.hotel.controller;

import com.joeunseo.hotel.model.domain.BookingModel;
import com.joeunseo.hotel.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api/booking")
public class BookingController {
    private final BookingService service;

    @GetMapping("/{userId}")
    public ResponseEntity<List<?>> getListByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(service.getListByUserId(userId));
    }
    @PostMapping("")
    public ResponseEntity<BookingModel> getById(@RequestBody Long id){
        return ResponseEntity.ok(service.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
       return ResponseEntity.ok(service.delete(id));
    }

    @PostMapping("/confirm")
    public ResponseEntity<Boolean> confirm(@RequestBody BookingModel booking) {
        return ResponseEntity.ok(service.confirm(booking));
    }
}
