package com.joeunseo.hotel.controller;

import com.joeunseo.hotel.model.domain.FileModel;
import com.joeunseo.hotel.model.domain.HotelModel;
import com.joeunseo.hotel.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/files")
public class FileController {
    private static final String UPLOAD_DIR = "uploads";
    private final FileService service;

    @PostMapping("/group")
    public ResponseEntity<List<?>> getList(@RequestBody FileModel files) {
        return ResponseEntity.ok(service.getList(files));
    }

    @PostMapping("")
    public ResponseEntity<HotelModel> getByHotelId(@RequestBody Long hotelId) {
        return ResponseEntity.ok(service.getByHotelId(hotelId));
    }

    @PostMapping("/uploads")
    public ResponseEntity<Boolean> uploads(@RequestBody FileModel files) {
        return ResponseEntity.ok(service.uploads(files));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boolean> update(@PathVariable Long id,@RequestParam FileModel files) {
        return ResponseEntity.ok(service.update(files));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
