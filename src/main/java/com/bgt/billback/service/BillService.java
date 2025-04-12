package com.bgt.billback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgt.billback.dto.BillDto;
import com.bgt.billback.entity.Bill;
import com.bgt.billback.vo.BillVo;

import java.util.List;

public interface BillService extends IService<Bill> {
    List<BillVo> getBills(BillDto billDto);
    Bill saveBillWithTags(BillDto bill);
    void updateBillWithTags(BillDto bill);
    void deleteBillWithTags(Long id);

    BillVo getOneById(Long id);
}