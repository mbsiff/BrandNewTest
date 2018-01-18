
public class TestCount
{
   public static void main(String[] args) {
       Counter c = new Counter();
       
       c.inc();
       c.inc();
       System.out.println("c ==> " + c.read());
       
    
    }
}
