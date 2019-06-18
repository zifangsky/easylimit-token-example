package cn.zifangsky.easylimit.token.example.mapper;

import cn.zifangsky.easylimit.token.example.model.SysRole;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    Set<SysRole> selectByUserId(@Param("userId") Long userId);
}