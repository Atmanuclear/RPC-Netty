package JdkProxy;

public class Solution {
    public static void main(String[] args) {
        DemoInterface service = (DemoInterface) JdkProxyFactory.getProxy(new DemoImpl());
        service.hello("java");
    }

}
