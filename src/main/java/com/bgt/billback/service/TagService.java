package com.bgt.billback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgt.billback.entity.Tag;

public interface TagService extends IService<Tag> {
    void saveTag(Tag tag);
}