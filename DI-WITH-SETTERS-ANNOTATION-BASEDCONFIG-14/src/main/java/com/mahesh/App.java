package com.mahesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
        MobileBean mb=(MobileBean)ctx.getBean("id3");
        //calling the create table method
       // mb.createTable();
        
        //insert the data into mobile 
       // mb.insertRecord();
        
        //update the record 
       // mb.updateRecord();
        
        //get mobile record
       // mb.getMobile();
        
        //get all mobiles
        mb.getAllMobile();
    }
}
