package com.example.devmaster.lab04.service;


import com.example.devmaster.lab04.entity.MonHoc;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class MonHocService {
    private final List<MonHoc> monHocList = new ArrayList<>();

    public MonHocService() {
        monHocList.add(new MonHoc("MH01", "Lập trình Java", 60));
        monHocList.add(new MonHoc("MH02", "Cơ sở dữ liệu", 75));
    }

    public List<MonHoc> getAll() {
        return monHocList;
    }

    public Optional<MonHoc> getById(String mamh) {
        return monHocList.stream().filter(m -> m.getMamh().equals(mamh)).findFirst();
    }

    public void add(MonHoc monHoc) {
        monHocList.add(monHoc);
    }

    public boolean update(String mamh, MonHoc monHoc) {
        return getById(mamh).map(m -> {
            m.setTenmh(monHoc.getTenmh());
            m.setSotiet(monHoc.getSotiet());
            return true;
        }).orElse(false);
    }

    public boolean delete(String mamh) {
        return monHocList.removeIf(m -> m.getMamh().equals(mamh));
    }
}

