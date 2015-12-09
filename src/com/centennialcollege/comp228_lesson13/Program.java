package com.centennialcollege.comp228_lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JOptionPane;

//DRIVER CLASS
public class Program {

	public static void main(String[] args) {
		
		//Declare variables
        int term;
        String first;
        
        //Get term number from user
        first = JOptionPane.showInputDialog("Enter number upto which Fibonacci series to print: ", 20);
        term = Integer.parseInt(first);
        
        MyRunnable myRunnable1 = new MyRunnable(term);
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.execute(myRunnable1);
        executor.shutdown();
		
	}

}
