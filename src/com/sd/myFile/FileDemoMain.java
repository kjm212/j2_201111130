package com.sd.myFile

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;;
import java.io.Reader;
import java.io.File;
  
public class FileDemoMain{
  public static void main(String[] args) throws Exception{
    File readme = null;
    InputStream isReadme = null;
    InputStreamReader isrReadme = null;
    BufferedReader brReadme = null;
    
    try{
      int i;
      File myhome = new File(System.getProperty("user.home"));
      System.out.println("my home is " +myhome);
      String cwd = new File(".").getCanonicalPath();
      readme = new File(cwd,"hello.txt");
      isReadme = new FileInputStream(readme);
      
      while(i=isReadme.read() != -1){
        System.out.print((char)i);
      }
      
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      if(isReadme != null) isReadme.close();
    }
    
    try{
      isReadme=new FileInputStream(readme);
      isrReadme=new InputStreamReader(isReadme,"euc-kr");
      brReadme= new BufferedReader(isrReadme);
      while((str=brReadme.readLine())!=null){
        System.out.println("--"+str);
      }
    }catch(Exception e){
      e.printStackTrace();
    }finally{
     if(brReadme != null) brReadme.close();
    }
    
  } 
}