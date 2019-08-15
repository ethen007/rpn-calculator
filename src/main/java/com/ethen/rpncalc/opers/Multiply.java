package com.ethen.rpncalc.opers;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 21:44
 * @Modified By:
 */
public class Multiply extends DefaultOperator {
    public Multiply(){
        this.oper=DoubleOper.MUL.op;
    }
    @Override
    public Double doCompute(Double a, Double b) {
        return a*b;
    }
}
