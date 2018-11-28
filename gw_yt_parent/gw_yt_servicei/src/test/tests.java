/**
 *
 * th
 */
public class tests  implements    Runnable{
    String   name;
    public tests(String name) {
        this.name =name;
    }
    @Override
    public synchronized void run() {
        for(int  i =0;i<100;i++){
            if(i%10==0){
                 //让运行状态进入就绪状态
                Thread.yield();
            }
            try {

            }catch (Exception e){

            }
          /*  try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(name+i+"yuntao*************************************8888");
        }
    }
}

