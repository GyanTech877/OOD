package com.gojek.parkinglot;

import com.gojek.parkinglot.processors.CommandProcessor;
import com.gojek.parkinglot.processors.CommandProcessorFactory;

public class Main 
{
    public static void main( String[] args )
    {
       CommandProcessor processor=CommandProcessorFactory.getCommandProcessor(args);
       processor.process();
    }
}
