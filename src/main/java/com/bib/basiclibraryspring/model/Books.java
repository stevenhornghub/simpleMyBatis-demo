package com.bib.basiclibraryspring.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String genre;
    private String author;
}
