package com.centennialcollege.comp228_lesson13;

import javax.swing.JOptionPane;

public class MyRunnable implements Runnable {

	private int _term;
	
	public MyRunnable(int num) 
	{
		this._term = num;
	}

	@Override
	public void run() {
		
		int answer = fibonacciRecusion(this._term);

        System.out.println("Fibonacci series upto " + _term +" numbers: ");
        //printing Fibonacci series upto number
        for(int i=1; i<=_term; i++){
            System.out.print(fibonacciRecusion(i) +" ");
        }
	}
	
	public static int fibonacciRecusion(int number){
        if(number == 1 || number == 2){
            return 1;
        } 
        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); //tail recursion
    }

}
