package com.bell.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	new Thread(()-> {
    		System.out.println(Thread.currentThread());
    	}).start();
    	
    }
}
