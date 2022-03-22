package JdkProxy;

public class DemoImpl implements DemoInterface{
    @Override
    public String hello(String msg) {
        System.out.println("msg = " + msg);
        return "msg";
    }
}
