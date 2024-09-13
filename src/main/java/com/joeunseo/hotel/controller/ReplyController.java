package com.joeunseo.hotel.controller;

import com.joeunseo.hotel.model.domain.ReplyModel;
import com.joeunseo.hotel.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/replies")
public class ReplyController{
    private final ReplyService service;

    @GetMapping("/group")
    public ResponseEntity<List<?>> getList(@RequestParam Long hotelId) {
        return ResponseEntity.ok(service.getList(hotelId));
    }

    @PostMapping("")
    public ResponseEntity<ReplyModel> getById(@RequestBody Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping("/write")
    public ResponseEntity<Boolean> insert(@RequestBody ReplyModel reply) {
        return ResponseEntity.ok(service.insert(reply));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return ResponseEntity.ok(service.delete(id));
    }

    @GetMapping("")
    public ResponseEntity<Boolean> exists(@RequestParam Long id) {
        return ResponseEntity.ok(service.exists(id));
    }

    @GetMapping("/count")
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(service.count());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boolean> update(@PathVariable ReplyModel reply) {
        return ResponseEntity.ok(service.update(reply));
    }
}
