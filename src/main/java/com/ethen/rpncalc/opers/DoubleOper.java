package com.ethen.rpncalc.opers;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 23:13
 * @Modified By:
 */
public enum  DoubleOper {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DEV("/");


    String op;


    private DoubleOper(String op){
        this.op=op;
    }
    public static DoubleOper get(String op){
        for(DoubleOper oper:DoubleOper.values()){
            if(oper.op.equals(op)){
                return oper;
            }
        }
        return null;
    }
}
