package com.zrb;


import com.zrb.utils.Mgb_GeneratorUtil;
import org.junit.Test;

/**
 * Created by zrb on 2017/6/25.
 */
public class TestGenerage extends DemospringbootApplicationTests{



   @Test
    public void test01() throws Exception{
       Mgb_GeneratorUtil.generator_1();
       Mgb_GeneratorUtil.generator_2();
   }

}
