package com.hsq.coreJava;

import java.io.File;
import java.io.IOException;

import com.hsq.coreJava.common.Print;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public void println(String str){
		
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(System.getProperty("user.dir"));
        File file = new File("test.txt");
        if(!file.exists()){
        	try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        if(file.isDirectory()){
        	for(String f:file.list()){
        		Print.println(f);
        	}
        }
    }
    
    
    
    
    
    
    
}
