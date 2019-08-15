package com.ethen.rpncalc.factory;

import com.ethen.rpncalc.opers.*;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 21:50
 * @Modified By:
 */
public class OperFactory {

    public static final String ADD="+";
    public static final String SUBTRACT="-";
    public static final String MULTIPLY="*";
    public static final String DEVIDE="/";
    public static final String SQRT="sqrt";

    public static Operator get(String oper){
        if(ADD.equals(oper)){
            return new Add();
        }else if(SUBTRACT.equals(oper)){
            return new Subtract();
        }else if(MULTIPLY.equals(oper)){
            return new Multiply();
        }else if(DEVIDE.equals(oper)){
            return new Devide();
        }else if(SQRT.equals(oper)){
            return new Sqrt();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
