package com.example.easyruledemo.rule;

import com.example.easyruledemo.entity.QueryParam;
import com.example.easyruledemo.service.RuleDemoService;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Priority;
import org.jeasy.rules.annotation.Rule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * @author : winnie [wangliu023@qq.com]
 * @date : 2020/5/18
 * @desc
 */
@Rule
public class MulRule {
    private Logger logger = LoggerFactory.getLogger(MulRule.class);

    private RuleDemoService ruleDemoService;

    private QueryParam queryParam;


    @Condition
    public boolean isAdd() {
        return "*".equals(queryParam.getParamSign());
    }

    @Action
    public void doAction() {
        Integer result = ruleDemoService.mulParam(queryParam);
        logger.info("乘法规则, result = {}",result);
    }

    public void setParam(QueryParam queryParam, RuleDemoService ruleDemoService) {
        this.queryParam = queryParam;
        this.ruleDemoService = ruleDemoService;
    }

    @Priority
    public int getPriority() {
        return 3;
    }
}

