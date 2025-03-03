package com.example.devmaster.lab03.controller;

import com.example.devmaster.lab03.model.Khoa;
import com.example.devmaster.lab03.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/khoa")
public class KhoaController {

    @Autowired
    private KhoaService khoaService;

    @GetMapping
    public List<Khoa> getAllKhoa() {
        return khoaService.getAllKhoa();
    }

    @GetMapping("/{makh}")
    public Khoa getKhoaById(@PathVariable Long makh) {
        return khoaService.getKhoaById(makh);
    }

    @PostMapping
    public void createKhoa(@RequestBody Khoa khoa) {
        khoaService.addKhoa(khoa);
    }

    @PutMapping("/{makh}")
    public void updateKhoa(@PathVariable Long makh, @RequestBody Khoa khoa) {
        khoaService.updateKhoa(makh, khoa);
    }

    @DeleteMapping("/{makh}")
    public void deleteKhoa(@PathVariable Long makh) {
        khoaService.deleteKhoa(makh);
    }
}
