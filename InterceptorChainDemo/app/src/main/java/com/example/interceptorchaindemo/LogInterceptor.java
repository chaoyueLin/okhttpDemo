package com.example.interceptorchaindemo;

/*****************************************************************
 * * File: - LogInterceptor
 * * Description: 
 * * Version: 1.0
 * * Date : 2020/4/21
 * * Author: linchaoyue
 * *
 * * ---------------------- Revision History:----------------------
 * * <author>   <date>     <version>     <desc>
 * * linchaoyue 2020/4/21    1.0         create
 ******************************************************************/
public class LogInterceptor implements Interceptor {
    @Override
    public Result intercept(Chain chain) {
        Instruction instruction=chain.getInstruction();
        return chain.proceed(instruction);
    }
}
