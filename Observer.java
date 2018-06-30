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
public interface Observer {
   
      public String getmail();
      public int getroll();
      public  void increase();
      public void unsubscribe();
      public void subscribe(String mail,int roll);
      public void msgreceive();
}
