package com.project.test.repo;

import com.project.test.vo.FMenuVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface FoodMenuRepository extends JpaRepository<FMenuVo, Long> {
    @Query(value = "SELECT * From tb_food ORDER BY rand() LIMIT 1", nativeQuery = true)
    List<FMenuVo> findRandMenu();
}
