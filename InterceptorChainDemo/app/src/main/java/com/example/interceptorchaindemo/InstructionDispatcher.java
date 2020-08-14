package com.example.interceptorchaindemo;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * * File: - InstructionDispatcher
 * * Description: 
 * * Version: 1.0
 * * Date : 2020/4/21
 * * Author: linchaoyue
 * *
 * * ---------------------- Revision History:----------------------
 * * <author>   <date>     <version>     <desc>
 * * linchaoyue 2020/4/21    1.0         create
 ******************************************************************/
public class InstructionDispatcher {
    public static Result dispatch(Instruction instruction){
        List<Interceptor> interceptors=new ArrayList<>();
        interceptors.add(new LogInterceptor());
        //
        interceptors.add(new ActionInterceptor());
        RealInterceptorChain chain=new RealInterceptorChain(interceptors,0,instruction);
       return chain.proceed(instruction);
    }
}
