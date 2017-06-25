package com.zrb.mapper;

import com.zrb.domain.SurveyAdmin;
import com.zrb.domain.SurveyAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyAdminMapper {
    long countByExample(SurveyAdminExample example);

    int deleteByExample(SurveyAdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(SurveyAdmin record);

    int insertSelective(SurveyAdmin record);

    List<SurveyAdmin> selectByExample(SurveyAdminExample example);

    SurveyAdmin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") SurveyAdmin record, @Param("example") SurveyAdminExample example);

    int updateByExample(@Param("record") SurveyAdmin record, @Param("example") SurveyAdminExample example);

    int updateByPrimaryKeySelective(SurveyAdmin record);

    int updateByPrimaryKey(SurveyAdmin record);
}