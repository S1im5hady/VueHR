package com.zhaokai.vuehr.common;

import com.zhaokai.vuehr.bean.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @Created by ZhaoKai on 2019/10/8 22:27
 */
public class HrUtils {
    public static Hr getCurrentHr() {
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
