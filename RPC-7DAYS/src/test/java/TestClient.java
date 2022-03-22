public class TestClient {
    public static void main(String[] args) {
        RpcClient rpcClient = new SocketClient("127.0.0.1", 9000);
        RpcClientProxy proxy = new RpcClientProxy(rpcClient);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
    }
}
//