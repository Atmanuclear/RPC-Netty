package JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DeuBugInvocationHandler implements InvocationHandler {

    private Object target;

    public DeuBugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用方法前..." + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("调用方法后..." + method.getName());
        return result;
    }
}
