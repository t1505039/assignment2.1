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
public class User implements Observer{
   private OBservable obs;
   private String email;
   private String name;
   private int roll;
   private int msgn;
   public User(OBservable o,String name )
   {
       obs=o;
       this.name=name;
       roll=0;
       email="";
       msgn=0;
       
   }
   
   
    public void subscribe(String mail,int roll)
    {
        if((roll<1505001||roll>1505120)||(mail.isEmpty()))
        {
            System.out.println("Subscribed failed..!!\n");
            return;
        }
        
        if(obs.isUsed(roll))
        {
           return;
        }
        email=mail;
        this.roll=roll;
        obs.subscribe(this);
        
    }
    
    public void unsubscribe()
    {
        if(roll==0)return;
        obs.unsubscribe(this);
        email="";
        roll=0;
        
    }
    public String getmail()
    {
        return email;
    }
     public int getroll()
    {
        return roll;
    }
    public  void increase()
     {
         msgn++;
     }
   @Override
    public void msgreceive()
    {
        System.out.println(msgn);
    }
    
}
