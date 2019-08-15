package com.ethen.rpncalc.utils;

import com.ethen.rpncalc.actions.Act;
import com.ethen.rpncalc.opers.DoubleOper;
import com.ethen.rpncalc.opers.SingleOper;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 22:28
 * @Modified By:
 */
public class CheckUtil {
    public static boolean isNumber(String args) {
        try {
            Double.valueOf(args);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean isOperator(String args){
        return DoubleOper.get(args)!=null||SingleOper.get(args)!=null;
    }

    public static boolean isAction(String args){
        return Act.isAction(args)!=null;
    }
}
