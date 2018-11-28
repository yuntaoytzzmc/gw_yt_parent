public class Testspring {
    public static void main(String[] args) {
        /*Thread  th  = new Thread(new tests("yuntaosss"));
        //开启一个线程  就绪状态
        th.start();
        Thread  th1  = new Thread(new test1(th,"wangying"));
        th1.start();

        //如何把th1   加入到th  里面呢   需要在th  里面new  出线程 th1
       try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int  i=0;i<10;i++){
            System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        }*/
        Object  obj = new Object();
        Thread  th2  = new Thread(new test2("yt",obj));
        th2.start();
        Thread  th3  = new Thread(new Test3(obj));
        th3.start();
        System.out.println(2<<3);

    }
}
