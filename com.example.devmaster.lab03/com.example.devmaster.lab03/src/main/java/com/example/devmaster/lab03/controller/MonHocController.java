package com.example.devmaster.lab03.controller;

import com.example.devmaster.lab03.model.MonHoc;
import com.example.devmaster.lab03.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/monhoc")
public class MonHocController {

    @Autowired
    private MonHocService monHocService;

    @GetMapping
    public List<MonHoc> getAllMonHoc() {
        return monHocService.getAllMonHoc();
    }

    @GetMapping("/{mamh}")
    public MonHoc getMonHocById(@PathVariable String mamh) {
        return monHocService.getMonHocById(mamh);
    }

    @PostMapping
    public void createMonHoc(@RequestBody MonHoc monHoc) {
        monHocService.addMonHoc(monHoc);
    }

    @PutMapping("/{mamh}")
    public void updateMonHoc(@PathVariable String mamh, @RequestBody MonHoc monHoc) {
        monHocService.updateMonHoc(mamh, monHoc);
    }

    @DeleteMapping("/{mamh}")
    public void deleteMonHoc(@PathVariable String mamh) {
        monHocService.deleteMonHoc(mamh);
    }
}
