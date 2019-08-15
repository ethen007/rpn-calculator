import com.ethen.rpncalc.RPNCalc;
import com.ethen.rpncalc.utils.FormatUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/15 10:38
 * @Modified By:
 */
public class CalcTest {

    @Test
    public void testOper(){
        RPNCalc calc = new RPNCalc();
        String init="1 2 3 4 5";
        String add="+";
        calc.process(init);
        calc.process(add);
        Assert.assertEquals("1 2 3 9",calc.getCurrentNumbers().trim());
        String sub="-";
        calc.process(sub);
        Assert.assertEquals("1 2 -6",calc.getCurrentNumbers().trim());
        String mul="*";
        calc.process(mul);
        Assert.assertEquals("1 -12",calc.getCurrentNumbers().trim());
        String dev="/";
        calc.process(dev);
        Assert.assertEquals(FormatUtil.format(1d/-12d),calc.getCurrentNumbers().trim());
        String undo="undo";
        calc.process(undo);
        Assert.assertEquals("1 -12",calc.getCurrentNumbers().trim());
        String clear="clear";
        calc.process(clear);
        Assert.assertEquals("",calc.getCurrentNumbers().trim());
    }

    @Test
    public void testSqrt(){
        RPNCalc calc = new RPNCalc();
        String init="1 2 3 4 5";
        String sqrt="sqrt";
        calc.process(init);
        calc.process(sqrt);
        Assert.assertEquals("1 2 3 4 "+FormatUtil.format(Math.sqrt(5d)),calc.getCurrentNumbers().trim());
    }
}
