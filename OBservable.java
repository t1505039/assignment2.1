/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdemo;

/**
 *
 * @author tanvir
 */
public interface OBservable {
    
    public void setmsg(String p,String sub,String msg);
    public void subscribe(Observer a);
    public void unsubscribe(Observer a);
    public void notifyALL();
   public  boolean  isUsed(int r);
   public void setpass(String spass,String pass1,String pass2);
   public void sendmail(String sender,String receiver,String sub,String msg);
  
    
}
