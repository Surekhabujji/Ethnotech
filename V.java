public class V{
    private static boolean ready = true;
    private static  int number = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized(lock){
                while (!ready) Thread.yield();
                System.out.println(number); 
            //System.out.println(ready); 
        }).start();
{
            number = 42;
            ready = true; 
        }
        
    }
}
