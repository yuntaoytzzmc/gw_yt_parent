public class test2 implements Runnable{
    String name ;
    Object  obj ;
    public   test2(String name,Object  obj){
        this.name =name;
        this.obj =obj;
    }
    @Override
    public void run() {
        synchronized (obj) {
            System.out.println("yt+++++++++++++++++++=");
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("ttt+++++++++++++++++++=");
        }
    }
}
