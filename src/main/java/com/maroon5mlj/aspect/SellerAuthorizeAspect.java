package com.maroon5mlj.aspect;

import com.maroon5mlj.constant.CookieConstant;
import com.maroon5mlj.constant.RedisConstant;
import com.maroon5mlj.exception.SellerAuthorizeException;
import com.maroon5mlj.utils.CookieUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lovea on 2017/11/1.
 */
@Aspect
@Component
@Slf4j
public class SellerAuthorizeAspect {

    /**
     * 注入redis
     */
    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 设定拦截点
     */
    @Pointcut("execution(public * com.maroon5mlj.controller.Seller*.*(..))"
    + "&& !execution(public * com.maroon5mlj.controller.SellerUserController.*(..))")
    public void verify(){};

    /**
     * 拦截具体实现
     */
    @Before("verify()")
    public void doVerify(){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest request = attributes.getRequest();

        //查询cookie
        Cookie cookie = CookieUtil.get(request, CookieConstant.TOKEN);

        if(cookie == null){
            log.warn("【登录校验】Cookie中查不到token");
            throw new SellerAuthorizeException();
        }

        //redis里查询token
        String token = redisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_PREFIX,cookie.getValue()));

        if(StringUtils.isEmpty(token)){
            log.warn("【登录校验】Redis中查不到token");
            throw new SellerAuthorizeException();
        }
    }



}
