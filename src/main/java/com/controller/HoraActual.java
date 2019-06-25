package com.controller;

import java.util.Calendar;

/**
 *
 * @author Administrador
 */
public class HoraActual extends Thread {
    
    private static String fecha;
    
    public void setFecha(String fecha){ this.fecha = fecha; }
    
    public String getFecha(){ return fecha; }
    
    @Override
    public void run(){
        while(true){
            Calendar date = Calendar.getInstance();
            String curretDay = date.get(Calendar.DATE)+"/"+minutos(date.get(Calendar.MONTH+1))+"/"+date.get(Calendar.YEAR)+ " " 
                              +date.get(Calendar.HOUR_OF_DAY)+ ":" +minutos(date.get(Calendar.MINUTE))+":"+date.get(Calendar.SECOND);  

            try{
                sleep(1000);
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
            
            setFecha(curretDay);
            System.out.println("fecha desde clase: "+curretDay);
        }
    }
    
    private String minutos(int i){
        String r;
        
        if(i < 10)
            r="0"+i;
        else
            r=""+i;

        return r;
    }
}
