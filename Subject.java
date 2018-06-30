/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdemo;

import java.util.ArrayList;

/**
 *
 * @author tanvir
 */
public class Subject implements OBservable {
    private String spass="4321";
    private String pass="1234";
    private String sub="";
   private String msg="";
    private String sender="t****@gmail.com";
    private ArrayList<Observer> list=new  ArrayList<Observer>();
    
    @Override
    public void subscribe(Observer a) {
        list.add(a);
    
    }

    @Override
    public void unsubscribe(Observer a) {
        
        list.remove(a);

    }

    @Override
    public void notifyALL() {
        if(msg!=""){
       for(Observer u:list)
       {
           sendmail(sender,u.getmail(),sub,msg);
           u.increase();
           System.out.println(u.getroll());
       }
       sub="";
       msg="";
        }
        
    }

    @Override
    public void setmsg(String p,String sub,String msg) {
        if(p==pass){
        this.sub=sub;
        this.msg=msg;
        }
        else System.out.println("sorry..!!");
       
    }
    @Override
    public boolean  isUsed(int r)
    {
        
        for(Observer u:list)
        {
            if(r==u.getroll())return true;
           
        }
        return false;
    }
    public void sendmail(String sender,String receiver,String sub,String msg)
    {
        /*************
         * 
         */
        System.out.print("send..");
    }

    @Override
    public void setpass(String spass, String pass1, String pass2) {
       
     if(this.spass==spass&&pass1==pass2)
     {
         pass=pass1;
        System.out.println("password change!!"); 
     }
     else System.out.println("Failed..!!");

    }
    
}
