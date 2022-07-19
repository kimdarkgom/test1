package com.project.test.service;



import com.project.test.repo.FoodMenuRepository;
import com.project.test.vo.FMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class FMenuService {
    @Autowired
    private FoodMenuRepository foodMenuRepository;

    public List<FMenuVo> findAll() {
        List<FMenuVo> fname = new ArrayList<>();
        foodMenuRepository.findAll().forEach(e -> fname.add(e));
        return fname;
    }

    public Long save(FMenuVo fname) {
        return foodMenuRepository.save(fname).getId();
//        return menu;
    }
    public List<FMenuVo> findRandMenu() {
        return foodMenuRepository.findRandMenu();
    }





}
