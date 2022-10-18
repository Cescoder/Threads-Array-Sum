package threadarraysum;

public class ThreadsArraySum {
    static int n = 10000000;
    static int sum;
    
    public static void main(String[] args) throws InterruptedException {
        
        //Array allocation
        int[] Array;  
        Array = new int[n];
        
        //Filling array with random numbers
        for(int i = 0; i<Array.length; i++)
            Array[i] = (int)(Math.random()*100);
        
        //Creation of two threads 
        Sum t1 = new Sum(0, Array.length/4, Array);
        Sum t2 = new Sum(Array.length/4, Array.length/2, Array);
        Sum t3 = new Sum(Array.length/2, Array.length*(3/4), Array);
        Sum t4 = new Sum(Array.length*(3/4), Array.length, Array);
        
        //Run the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        //Wait them to finish
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        
        //Get final sum
        sum = t1.getSum()+t2.getSum()+t3.getSum()+t4.getSum();
       
        
        //Print the result
        println("Sum: "+sum);
        
        
    }
    
    public static void println(Object string){
        System.out.println(string);
    }
    
}
