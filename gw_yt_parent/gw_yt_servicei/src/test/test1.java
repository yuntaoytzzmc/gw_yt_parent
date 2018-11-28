public class test1 implements  Runnable {
    Thread tests;
    String   name;
    public test1(Thread  tests,String name) {
        this.name =name;
        this.tests=tests;
    }
    @Override
    public synchronized void run() {
        for(int  i =0;i<100;i++){
            if(i%10==0){

                //让运行状态进入就绪状态
                Thread.yield();
            }


            try {
               /* this.notifyAll();*/
                tests.join();  //合并线程tests 运行完  ，才运行这个线程
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(name+i+"tet*************************************8888");
        }
    }
}

