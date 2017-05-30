package com.yihaojishi.dao;

import com.yihaojishi.pojo.AppGoodsActivity;
import com.yihaojishi.pojo.AppGoodsActivityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppGoodsActivityDao {
    int countByExample(AppGoodsActivityQuery example);

    int deleteByExample(AppGoodsActivityQuery example);

    int deleteByPrimaryKey(Integer goodsActivityId);

    int insert(AppGoodsActivity record);

    int insertSelective(AppGoodsActivity record);

    List<AppGoodsActivity> selectByExample(AppGoodsActivityQuery example);

    AppGoodsActivity selectByPrimaryKey(Integer goodsActivityId);

    int updateByExampleSelective(@Param("record") AppGoodsActivity record, @Param("example") AppGoodsActivityQuery example);

    int updateByExample(@Param("record") AppGoodsActivity record, @Param("example") AppGoodsActivityQuery example);

    int updateByPrimaryKeySelective(AppGoodsActivity record);

    int updateByPrimaryKey(AppGoodsActivity record);
}