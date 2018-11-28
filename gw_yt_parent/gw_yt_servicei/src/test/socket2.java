import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class socket2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.1.102", 9999);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("yuntaosss");
            DataInputStream  da  = new DataInputStream(socket.getInputStream());
            System.out.println( da.readUTF());

        }catch (Exception e){

        }
    }
}
