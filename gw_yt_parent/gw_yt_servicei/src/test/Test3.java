public class Test3 implements  Runnable {
    Object  ob ;
  public Test3(Object  obj){
      this.ob =obj;
  }
    @Override
    public void run() {
      synchronized (ob) {
          System.out.println("lk===================================");
          for (int i = 0; i < 10; i++) {
              if (i % 2 == 0) {
                  try {
                      ob.notify();
                  } catch (Exception e) {
                      e.printStackTrace();
                  }

              }
          }
      }
    }
}
