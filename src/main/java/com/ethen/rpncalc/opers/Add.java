package com.ethen.rpncalc.opers;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 21:40
 * @Modified By:
 */
public class Add extends DefaultOperator {
    public Add(){
        this.oper=DoubleOper.ADD.op;
    }
    @Override
    public Double doCompute(Double a, Double b) {
        return a+b;
    }
}
