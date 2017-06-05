package com.test;

/**
 * Created by ac on 2016/11/14.
 */

public class MockModel {

    private Logger logger = new Logger();

    public class Logger{
        public void log(String value){

        }
    }


    public int add(int first, int second){
        int sum = first + second;
        if(sum < 0)
            logger.log(String.valueOf(sum));
        return first + second;
    }

//    void log(String value){
//
//    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
