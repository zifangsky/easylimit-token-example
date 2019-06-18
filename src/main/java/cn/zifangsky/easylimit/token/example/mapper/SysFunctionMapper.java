package cn.zifangsky.easylimit.token.example.mapper;

import cn.zifangsky.easylimit.token.example.model.SysFunction;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

public interface SysFunctionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysFunction record);

    int insertSelective(SysFunction record);

    SysFunction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysFunction record);

    int updateByPrimaryKey(SysFunction record);

    Set<SysFunction> selectByRoleId(@Param("roleId") Long roleId);
}