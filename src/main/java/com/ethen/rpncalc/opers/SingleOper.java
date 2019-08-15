package com.ethen.rpncalc.opers;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 23:13
 * @Modified By:
 */
public enum  SingleOper {
    SQRT("sqrt");
    String op;
    private SingleOper(String op){
        this.op=op;
    }
    public static SingleOper get(String op){
        for(SingleOper oper:SingleOper.values()){
            if(oper.op.equals(op)){
                return oper;
            }
        }
        return null;
    }
}
