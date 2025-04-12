package com.bgt.billback.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bgt.billback.dto.BillDto;
import com.bgt.billback.entity.Bill;
import com.bgt.billback.vo.BillVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BillMapper extends BaseMapper<Bill> {
    List<BillVo> getBills(@Param("billDto") BillDto billDto);
}