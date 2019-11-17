package com.zhaokai.vuehr.mapper;

import com.zhaokai.vuehr.bean.Hr;
import com.zhaokai.vuehr.bean.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Created by ZhaoKai on 2019/10/8 22:13
 */
public interface HrMapper {
    Hr loadUserByUsername(String username);

    List<Role> getRolesByHrId(Long id);

    int hrReg(@Param("username") String username, @Param("password") String password);

    List<Hr> getHrsByKeywords(@Param("keywords") String keywords);

    int updateHr(Hr hr);

    int deleteRoleByHrId(Long hrId);

    int addRolesForHr(@Param("hrId") Long hrId, @Param("rids") Long[] rids);

    Hr getHrById(Long hrId);

    int deleteHr(Long hrId);

    List<Hr> getAllHr(@Param("currentId") Long currentId);
}