package com.ethen.rpncalc.utils;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/15 10:43
 * @Modified By:
 */
public class FormatUtil {
    public static String format(Double number) {
        DecimalFormat decimalFormat = new DecimalFormat("##########.##########");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat.format(number);
    }
}
