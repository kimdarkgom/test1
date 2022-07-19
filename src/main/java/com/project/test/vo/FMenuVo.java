package com.project.test.vo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="tb_food")
public class FMenuVo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fname;
    private String fcontents;
    private String fwriter;
    @Builder
    public FMenuVo(String fname, String fcontents, String fwriter){
        this.fname = fname;
        this.fcontents= fcontents;
        this.fwriter= fwriter;
    }
}
