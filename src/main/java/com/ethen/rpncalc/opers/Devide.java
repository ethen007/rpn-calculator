package com.ethen.rpncalc.opers;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 21:43
 * @Modified By:
 */
public class Devide extends DefaultOperator {

    public Devide(){
        this.oper=DoubleOper.DEV.op;
    }
    @Override
    public Double doCompute(Double a, Double b) {
        if(b==0){
            throw new IllegalArgumentException();
        }
        return a/b;
    }
}
