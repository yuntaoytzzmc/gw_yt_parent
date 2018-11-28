import sun.plugin2.message.Message;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class socket1 {
    /*
       这个是服务端
     */
    public static void main(String[] args) {
        try {
            ServerSocket  sc  = new ServerSocket(9999);
            System.out.println("服务端正在开始~");
            Socket ters = sc.accept();
            InputStream in = ters.getInputStream();

            ObjectInputStream ois = new ObjectInputStream(in);
            Message msg = (Message) ois.readObject();
            System.out.println(msg.getID()+"===========================");
            //接送到消息
            DataInputStream  da  = new DataInputStream(in);
            String name  =da.readUTF();
            System.out.println(name);
            //把消息指定发个那个客户端呢？
            DataOutputStream  das  =new DataOutputStream(ters.getOutputStream());
            das.writeUTF(name);

        }catch (Exception e){

        }

    }
}
