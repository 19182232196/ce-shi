package com.proxy;

public class CalculatorStaticProxy implements Calculator {
    // 将被代理的目标对象声明为成员变量
    private CalculatorPureImpl target;
    public CalculatorStaticProxy(CalculatorPureImpl target) {
        this.target = target;
    }
    @Override
    public int add(int i, int j) {
        int Result = 0;
        try {
            // 附加功能由代理类中的代理方法来实现
            System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);
// 通过目标对象来实现核心业务逻辑
            Result = target.add(i, j);
            System.out.println("[日志] add 方法结束了，结果是：" + Result);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

        }
        return Result;
    }

    @Override
    public int sub(int i, int j) {
        // 附加功能由代理类中的代理方法来实现
        System.out.println("[日志] sub 方法开始了，参数是：" + i + "," + j);
// 通过目标对象来实现核心业务逻辑
        int Result = target.sub(i, j);
        System.out.println("[日志] sub 方法结束了，结果是：" + Result);
        return Result;
    }

    @Override
    public int mul(int i, int j) {
        // 附加功能由代理类中的代理方法来实现
        System.out.println("[日志] mul 方法开始了，参数是：" + i + "," + j);
// 通过目标对象来实现核心业务逻辑
        int Result = target.mul(i, j);
        System.out.println("[日志] mul 方法结束了，结果是：" + Result);
        return Result;
    }

    @Override
    public int div(int i, int j) {
        // 附加功能由代理类中的代理方法来实现
        System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);
// 通过目标对象来实现核心业务逻辑
        int Result = target.div(i, j);
        System.out.println("[日志] div 方法结束了，结果是：" + Result);
        return Result;
    }
}
