/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertysample;
import java.util.*;

/**
 *
 * @author napas
 */
public class BoundPropertySample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPropertyBean mySource = new MyPropertyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Score Thai vs UAE: " );
        int n = in.nextInt();
        
        int i = 1;
        while ( i <= n ) {
            i++;
        }
        
        mySource.setValue("live result: Thai " + n +"-0 UAE" );
        mySource.setValue("live result: Thai " + n +"-0 UAE" );     
    }
    
}
