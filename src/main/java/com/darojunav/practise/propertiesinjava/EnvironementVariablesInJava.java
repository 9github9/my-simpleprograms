package com.darojunav.practise.propertiesinjava;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class EnvironementVariablesInJava {
    public static void main (String[] args) {
// Getting the environment properties
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
// geting the system properties

        Properties properties = System.getProperties();
        Iterator<Object> iterator = properties.keySet().iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println("key :" + iterator + "    value :" + System.getProperties().get(iterator.next()));
        }

    }

}
