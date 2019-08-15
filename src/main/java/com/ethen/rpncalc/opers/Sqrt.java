package com.ethen.rpncalc.opers;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 21:49
 * @Modified By:
 */
public class Sqrt extends DefaultOperator{

    public Sqrt(){
        this.oper=SingleOper.SQRT.op;
    }
    @Override
    public Double doCompute(Double a, Double b) {
        if(a<0){
            throw new IllegalArgumentException("sqrt parameter can not be negative!");
        }
        return Math.sqrt(a);
    }
}
