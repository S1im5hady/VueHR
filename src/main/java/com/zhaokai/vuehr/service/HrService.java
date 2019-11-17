package com.zhaokai.vuehr.service;

import com.zhaokai.vuehr.bean.Hr;
import com.zhaokai.vuehr.mapper.HrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Created by ZhaoKai on 2019/10/8 22:03
 */
@Service
public class HrService implements UserDetailsService {
    //@Autowired
    HrMapper hrMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(s);
        if (hr == null)
            throw new UsernameNotFoundException("用户名不存在");
        return hr;
    }

}
