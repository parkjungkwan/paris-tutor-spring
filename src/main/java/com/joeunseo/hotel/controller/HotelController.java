package com.joeunseo.hotel.controller;


import com.joeunseo.hotel.model.domain.HotelModel;
import com.joeunseo.hotel.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.List;

@Controller
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api/hotels")
public class HotelController {
    private final HotelService service;

    @GetMapping("/move")
    public String move(@RequestParam String dest){
        return "hotel/"+dest;
    }

    @PostMapping("/{sellerId}")//내 호텔 관리
    public ResponseEntity<HotelModel> getListBySellerId(@PathVariable Long sellerId){
        return ResponseEntity.ok(service.getListBySellerId(sellerId));
    }
    @GetMapping("/")
    public ResponseEntity<List<HotelModel>> selectAll(){
        return ResponseEntity.ok(service.selectAll());
    }

    @PostMapping("")
    public ResponseEntity<HotelModel> getById(@RequestBody Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping("/write")
    public ResponseEntity<Boolean> insert(@RequestBody HotelModel hotel) {
        try {
            return ResponseEntity.ok(service.insert(hotel));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(false);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boolean> update(@PathVariable Long id,@RequestBody HotelModel hotel) {
        return ResponseEntity.ok(service.update(hotel));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
