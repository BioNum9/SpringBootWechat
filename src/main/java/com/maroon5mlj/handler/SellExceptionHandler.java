package com.maroon5mlj.handler;

import com.maroon5mlj.VO.ResultVO;
import com.maroon5mlj.exception.SellException;
import com.maroon5mlj.exception.SellerAuthorizeException;
import com.maroon5mlj.utils.ResultVOUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截登录异常
 * Created by lovea on 2017/11/1.
 */
@ControllerAdvice
public class SellExceptionHandler {

    //拦截登录异常
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handleSellerAuthorizeException(){
        //跳转到登录地址
        return new ModelAndView("redirect:/seller/login");
    }

    /**
     * 拦截SellException，并返回固定格式json给前端
     * @param e
     * @return
     */
    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellException(SellException e){
        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }
}
