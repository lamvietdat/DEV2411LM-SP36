package com.example.devmaster.lab03.service;

import com.example.devmaster.lab03.model.MonHoc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MonHocService {
    private final List<MonHoc> monHocList = new ArrayList<>();

    public MonHocService() {
        monHocList.add(new MonHoc("MH01", "Lập trình Java", 45));
        monHocList.add(new MonHoc("MH02", "Cấu trúc dữ liệu", 30));
        monHocList.add(new MonHoc("MH03", "Hệ điều hành", 50));
    }

    public List<MonHoc> getAllMonHoc() {
        return monHocList;
    }

    public MonHoc getMonHocById(String mamh) {
        return monHocList.stream()
                .filter(mh -> mh.getMamh().equals(mamh))
                .findFirst()
                .orElse(null);
    }

    public void addMonHoc(MonHoc monHoc) {
        monHocList.add(monHoc);
    }

    public void updateMonHoc(String mamh, MonHoc updatedMonHoc) {
        Optional<MonHoc> existingMonHoc = monHocList.stream()
                .filter(mh -> mh.getMamh().equals(mamh))
                .findFirst();

        existingMonHoc.ifPresent(mh -> {
            mh.setTenmh(updatedMonHoc.getTenmh());
            mh.setSotiet(updatedMonHoc.getSotiet());
        });
    }

    public void deleteMonHoc(String mamh) {
        monHocList.removeIf(mh -> mh.getMamh().equals(mamh));
    }
}
