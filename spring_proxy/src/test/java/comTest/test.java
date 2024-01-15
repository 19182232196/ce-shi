package comTest;

import com.proxy.Calculator;
import com.proxy.CalculatorPureImpl;
import com.proxy.CalculatorStaticProxy;
import com.proxy.ProxyFactory;
import org.junit.Test;

public class test {
    @Test
    public void test1(){
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(
                new CalculatorPureImpl());
        proxy.add(1, 2);
    }
    @Test
    public void test2(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorPureImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.div(1, 0);
    }
}
