package com.ethen.rpncalc.opers;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 21:42
 * @Modified By:
 */
public class Subtract extends DefaultOperator {
    public Subtract(){
        this.oper=DoubleOper.SUB.op;
    }
    @Override
    public Double doCompute(Double a, Double b) {
        return a-b;
    }
}
