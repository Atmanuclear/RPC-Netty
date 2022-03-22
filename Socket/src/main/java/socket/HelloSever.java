package socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloSever {
    private static Logger logger = LoggerFactory.getLogger(HelloSever.class);

    public void start(int port) {
        try (ServerSocket sever = new ServerSocket(port);){
            Socket socket;
            while ((socket = sever.accept()) != null) {
                logger.info("client connected");
                try (ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                     ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream())) {
                    Message message = (Message) objectInputStream.readObject();
                    logger.info("sever receive message:"+message.getContent());
                    message.setContent("new content");
                    objectOutputStream.writeObject(message);
                    objectOutputStream.flush();
                }catch (IOException | ClassNotFoundException  e){
                    logger.error("occer exception",e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HelloSever helloSever = new HelloSever();
        helloSever.start(6666);
    }
}
