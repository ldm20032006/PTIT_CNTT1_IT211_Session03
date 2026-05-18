package org.example.bai4.controller;

import org.example.bai4.entity.SinhVien;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/sinhvien")
public class SinhVienController {
    List<SinhVien> sinhVien=new ArrayList<SinhVien>();
    @GetMapping(produces = {"application/json", "application/xml"} )
    public ResponseEntity<List<SinhVien>> getSinhVien() {
        sinhVien.add(new SinhVien("SV001", "Nguyen Van An", 8.5));
        sinhVien.add(new SinhVien("SV002", "Tran Thi Bich", 7.8));
        return ResponseEntity.ok(sinhVien);
    }


}
