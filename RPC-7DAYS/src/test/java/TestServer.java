public class TestServer {
//    public static void main(String[] args) {
//        HelloService helloService = new HelloServiceImpl();
//        RpcServer rpcServer = new RpcServer();
//        rpcServer.register(helloService, 9000);
//    }
public static void main(String[] args) {
    HelloService helloService = new HelloServiceImpl();
    ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
    serviceRegistry.register(helloService);
    SocketServer socketServer = new SocketServer(serviceRegistry);
    socketServer.start(9000);

}

}
