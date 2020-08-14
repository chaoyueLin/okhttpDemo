package com.example.interceptorchaindemo;

/*****************************************************************
 * * File: - Interceptor
 * * Description: 
 * * Version: 1.0
 * * Date : 2020/4/21
 * * Author: linchaoyue
 * *
 * * ---------------------- Revision History:----------------------
 * * <author>   <date>     <version>     <desc>
 * * linchaoyue 2020/4/21    1.0         create
 ******************************************************************/
public interface Interceptor {


    Result intercept(Chain chain);
    public interface  Chain{
        Instruction getInstruction();
        Result proceed(Instruction instruction);
    }
}
