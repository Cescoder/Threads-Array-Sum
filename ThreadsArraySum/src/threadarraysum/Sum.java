/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadarraysum;

/**
 *
 * @author Admin
 */
public class Sum extends Thread{
    int start;
    int finish;
    int[] Array;
    int sum;

    public Sum(int start, int finish, int Array[]) {
        this.start = start;
        this.finish = finish;
        this.Array = Array;
    }
    
    @Override
    public void run(){
        this.sum = 0;
        
        for(int i = this.start; i<this.finish; i++)
            this.sum += Array[i];
        
    }

    public int getSum() {
        return sum;
    }
    
    
    
    
    
    
}
