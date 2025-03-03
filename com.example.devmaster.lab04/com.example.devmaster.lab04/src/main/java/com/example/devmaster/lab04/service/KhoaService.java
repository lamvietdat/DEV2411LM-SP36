package com.example.devmaster.lab04.service;


import com.example.devmaster.lab04.entity.Khoa;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class KhoaService {
    private final List<Khoa> khoaList = new ArrayList<>();

    public KhoaService() {
        khoaList.add(new Khoa("KH01", "Công nghệ thông tin"));
        khoaList.add(new Khoa("KH02", "Kinh tế"));
    }

    public List<Khoa> getAll() {
        return khoaList;
    }

    public Optional<Khoa> getById(String makh) {
        return khoaList.stream().filter(k -> k.getMakh().equals(makh)).findFirst();
    }

    public void add(Khoa khoa) {
        khoaList.add(khoa);
    }

    public boolean update(String makh, Khoa khoa) {
        return getById(makh).map(k -> {
            k.setTenkh(khoa.getTenkh());
            return true;
        }).orElse(false);
    }

    public boolean delete(String makh) {
        return khoaList.removeIf(k -> k.getMakh().equals(makh));
    }
}

