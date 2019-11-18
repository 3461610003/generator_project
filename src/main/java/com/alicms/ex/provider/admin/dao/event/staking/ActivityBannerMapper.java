package com.alicms.ex.provider.admin.dao.event.staking;

import com.alicms.ex.provider.admin.model.event.staking.ActivityBanner;

public interface ActivityBannerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivityBanner record);

    int insertSelective(ActivityBanner record);

    ActivityBanner selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivityBanner record);

    int updateByPrimaryKey(ActivityBanner record);
}