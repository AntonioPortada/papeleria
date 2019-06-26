package com.controller;

import java.util.Calendar;

import javax.swing.JLabel;

/**
 *
 * @author Administrador
 */
public class HoraActual extends Thread {
    
    private JLabel label;
    private static String fecha;
    
    public HoraActual(JLabel label){
        this.label = label;
    }
    
    @Override
    public void run(){
        while(true){
            Calendar date = Calendar.getInstance();
            String currentDay = date.get(Calendar.DATE)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR)+ " " 
                              +date.get(Calendar.HOUR_OF_DAY)+ ":" +minutos(date.get(Calendar.MINUTE))+":"+minutos(date.get(Calendar.SECOND));  
            label.setText(currentDay);
            
            try{
                sleep(1000);
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
            
            //System.out.println("fecha desde clase: "+currentDay);
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
