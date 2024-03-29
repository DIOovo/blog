package com.gaoheyang.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDetailVo {
        private Long id;
        //标题
        private String title;
        //文章摘要
        private String summary;
        //所属分类名
        private String categoryName;
        //缩略图
        private String thumbnail;

        //访问量
        private Long viewCount;

        private String content;

        private Date createTime;

    public Long getCategoryId() {
        return id;
    }
}
