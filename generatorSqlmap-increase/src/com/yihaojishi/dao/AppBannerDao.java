package com.yihaojishi.dao;

import com.yihaojishi.pojo.AppBanner;
import com.yihaojishi.pojo.AppBannerQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppBannerDao {
    int countByExample(AppBannerQuery example);

    int deleteByExample(AppBannerQuery example);

    int deleteByPrimaryKey(Integer bannerId);

    int insert(AppBanner record);

    int insertSelective(AppBanner record);

    List<AppBanner> selectByExampleWithBLOBs(AppBannerQuery example);

    List<AppBanner> selectByExample(AppBannerQuery example);

    AppBanner selectByPrimaryKey(Integer bannerId);

    int updateByExampleSelective(@Param("record") AppBanner record, @Param("example") AppBannerQuery example);

    int updateByExampleWithBLOBs(@Param("record") AppBanner record, @Param("example") AppBannerQuery example);

    int updateByExample(@Param("record") AppBanner record, @Param("example") AppBannerQuery example);

    int updateByPrimaryKeySelective(AppBanner record);

    int updateByPrimaryKeyWithBLOBs(AppBanner record);

    int updateByPrimaryKey(AppBanner record);
}