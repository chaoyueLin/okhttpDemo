package com.example.interceptorchaindemo;

import java.util.List;

/*****************************************************************
 * * File: - RealInterceptorChain
 * * Description: 
 * * Version: 1.0
 * * Date : 2020/4/21
 * * Author: linchaoyue
 * *
 * * ---------------------- Revision History:----------------------
 * * <author>   <date>     <version>     <desc>
 * * linchaoyue 2020/4/21    1.0         create
 ******************************************************************/
public class RealInterceptorChain implements Interceptor.Chain {
    List<Interceptor> list;
    int index;
    Instruction instruction;
    RealInterceptorChain(List<Interceptor> list,int index,Instruction instruction){
        this.list=list;
        this.index=index;
        this.instruction=instruction;
    }

    @Override
    public Instruction getInstruction() {
        return instruction;
    }

    @Override
    public Result proceed(Instruction instruction) {
        RealInterceptorChain chain=new RealInterceptorChain(list,index+1,instruction);
        Interceptor interceptor=list.get(index);
        Result result=interceptor.intercept(chain);
        return result;
    }
}
