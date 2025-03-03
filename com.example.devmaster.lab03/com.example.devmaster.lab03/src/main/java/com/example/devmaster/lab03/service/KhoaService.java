package com.example.devmaster.lab03.service;

import com.example.devmaster.lab03.model.Khoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KhoaService {
    private final List<Khoa> khoaList = new ArrayList<>();

    public KhoaService() {
        // Dữ liệu mẫu
        khoaList.add(new Khoa(1L, "Công Nghệ Thông Tin"));
        khoaList.add(new Khoa(2L, "Khoa Học Máy Tính"));
        khoaList.add(new Khoa(3L, "Kỹ Thuật Phần Mềm"));
    }

    public List<Khoa> getAllKhoa() {
        return khoaList;
    }

    public Khoa getKhoaById(Long makh) {
        return khoaList.stream()
                .filter(khoa -> khoa.getMakh().equals(makh))
                .findFirst()
                .orElse(null);
    }

    public void addKhoa(Khoa khoa) {
        khoaList.add(khoa);
    }

    public void updateKhoa(Long makh, Khoa updatedKhoa) {
        Optional<Khoa> existingKhoa = khoaList.stream()
                .filter(k -> k.getMakh().equals(makh))
                .findFirst();

        existingKhoa.ifPresent(khoa -> {
            khoa.setTenkh(updatedKhoa.getTenkh());
        });
    }

    public void deleteKhoa(Long makh) {
        khoaList.removeIf(khoa -> khoa.getMakh().equals(makh));
    }
}
