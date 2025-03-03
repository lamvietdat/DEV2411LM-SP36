package com.example.devmaster.lab04.controller;


import com.example.devmaster.lab04.entity.Khoa;
import com.example.devmaster.lab04.service.KhoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/khoa")
public class KhoaController {
    private final KhoaService khoaService;

    public KhoaController(KhoaService khoaService) {
        this.khoaService = khoaService;
    }

    @GetMapping
    public List<Khoa> getAll() {
        return khoaService.getAll();
    }

    @GetMapping("/{makh}")
    public Optional<Khoa> getById(@PathVariable String makh) {
        return khoaService.getById(makh);
    }

    @PostMapping
    public void add(@RequestBody Khoa khoa) {
        khoaService.add(khoa);
    }

    @PutMapping("/{makh}")
    public boolean update(@PathVariable String makh, @RequestBody Khoa khoa) {
        return khoaService.update(makh, khoa);
    }

    @DeleteMapping("/{makh}")
    public boolean delete(@PathVariable String makh) {
        return khoaService.delete(makh);
    }
}
