package dead;

class Multi extends Thread{
    public static void main(String args[]){
        final String customer_name = "Diya";
        final String order_id = "ORD123456";

        Multi t1 = new Multi(){
            public void run(){
                System.out.println("Thread currently running is " + Thread.currentThread().getName());

                synchronized (customer_name){
                    System.out.println("Locked customer "  + customer_name + " by " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (order_id){
                        System.out.println("Locked order " + order_id + " by " + Thread.currentThread().getName());

                    }
                }
            }
        };
        Multi t2 = new Multi(){
            public void run(){
                System.out.println("Thread currently running is " + Thread.currentThread().getName());

                synchronized (order_id){
                    System.out.println("Locked order " + order_id + " by " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (customer_name){
                        System.out.println("Locked customer "  + customer_name + " by " + Thread.currentThread().getName());

                    }
                }

            }
        };
        t1.start();
        t2.start();
    }
}