package com.example.interceptorchaindemo;

/*****************************************************************
 * * File: - ActionInterceptor
 * * Description: 
 * * Version: 1.0
 * * Date : 2020/4/21
 * * Author: linchaoyue
 * *
 * * ---------------------- Revision History:----------------------
 * * <author>   <date>     <version>     <desc>
 * * linchaoyue 2020/4/21    1.0         create
 ******************************************************************/
public class ActionInterceptor implements Interceptor{
    @Override
    public Result intercept(Chain chain) {
        Instruction instruction=chain.getInstruction();
        return new Result();
    }
}
