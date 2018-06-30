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
public class ObserverDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OBservable ob=new Subject();
        User u1=new User(ob,"t");
        u1.subscribe("t@gmail.com", 1505000);
        u1.msgreceive();
        User u2=new User(ob,"a");
         u2.subscribe("t@gmail.com", 1505038); 
        ob.setmsg("1234", "con","hello");
        ob.notifyALL();
        //u1.msgreceive();
    }
    
}
