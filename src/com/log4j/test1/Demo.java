package com.log4j.test1;

import org.apache.logging.log4j.*;



public class Demo
{
    private static Logger Log = LogManager.getLogger(Demo.class.getName());
    public static void main(String[] args)
    {
        Log.debug("Iam debugging");
        Log.error("This is error");
        Log.info("this is information");
        Log.fatal("This is fatal");
    }
}
