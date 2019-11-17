package com.zhaokai.vuehr.mapper;

import com.zhaokai.vuehr.bean.Menu;

import java.util.List;

/**
 * @Created by ZhaoKai on 2019/10/8 22:24
 */
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
