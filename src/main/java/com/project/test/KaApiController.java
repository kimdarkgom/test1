package com.project.test;


import com.project.test.repo.FoodMenuRepository;
import com.project.test.service.FMenuService;
import com.project.test.vo.FMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KaApiController {

    @Autowired
    private FMenuService fMenuService;
    @Autowired
    private FoodMenuRepository foodMenuRepository;

    @PostMapping("/api/v1/insert")
    public Long save(@RequestBody FMenuVo fname) {
        return fMenuService.save(fname);
    }
}
