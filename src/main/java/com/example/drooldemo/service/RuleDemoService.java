package com.example.drooldemo.service;

import com.example.drooldemo.entity.QueryParam;

/**
 * @author : winnie [wangliu023@qq.com]
 * @date : 2020/5/6
 * @desc
 */
public interface RuleDemoService {

    Integer addParam(QueryParam param);

    Integer subParam(QueryParam param);

    Integer mulParam(QueryParam param);

    Integer divParam(QueryParam param);
}
