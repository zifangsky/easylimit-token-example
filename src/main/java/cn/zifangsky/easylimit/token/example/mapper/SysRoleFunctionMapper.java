package cn.zifangsky.easylimit.token.example.mapper;

import cn.zifangsky.easylimit.token.example.model.SysRoleFunction;

public interface SysRoleFunctionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleFunction record);

    int insertSelective(SysRoleFunction record);

    SysRoleFunction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleFunction record);

    int updateByPrimaryKey(SysRoleFunction record);
}