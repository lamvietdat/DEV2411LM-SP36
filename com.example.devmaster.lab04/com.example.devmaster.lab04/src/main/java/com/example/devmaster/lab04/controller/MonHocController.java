package com.example.devmaster.lab04.controller;



import com.example.devmaster.lab04.entity.MonHoc;
import com.example.devmaster.lab04.service.MonHocService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monhoc")
public class MonHocController {
    private final MonHocService monHocService;

    public MonHocController(MonHocService monHocService) {
        this.monHocService = monHocService;
    }

    @GetMapping
    public List<MonHoc> getAll() {
        return monHocService.getAll();
    }

    @GetMapping("/{mamh}")
    public ResponseEntity<MonHoc> getById(@PathVariable String mamh) {
        return monHocService.getById(mamh)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public void add(@RequestBody MonHoc monHoc) {
        monHocService.add(monHoc);
    }

    @PutMapping("/{mamh}")
    public ResponseEntity<Void> update(@PathVariable String mamh, @RequestBody MonHoc monHoc) {
        return monHocService.update(mamh, monHoc) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{mamh}")
    public ResponseEntity<Void> delete(@PathVariable String mamh) {
        return monHocService.delete(mamh) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}