/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abstractquiz.view;

import ec.espe.edu.abstractquiz.model.*;
import java.util.ArrayList;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class AbstractQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A[] as;
        B[] bs;
        D d;
        C c;
        E e;
        H h;
        F f;
        G g;
        ArrayList<G> gs;  
        ArrayList<C> cs;
        ArrayList<H> hs;
        
        
        int z = 2;
        int x = 3;
        int y = 4;
        float ff = 5.5F;
        double doub = 6.6F;
        int aa = 7;
        int bb = 8;
        
        as = new A[2];
        bs = new B[5];   
        gs = new ArrayList<>();
        cs = new ArrayList<>();
        hs = new ArrayList<>();
        
        g = new G(z);
        gs.add(g);
        g = new G(z+3);
        gs.add(g);
        h = new H();
        hs.add(h);
        hs.add(h);
        hs.add(h);
        f = new F("hello Steven");
        
        c = new C(hs);
        c.m(f);
        
        
        for(int i=0; i<5; i++){
            //TODO read from keyboard, x, y, f, doub
            //TODO loop to read one or more gs with ints
            //TODO how many gs do you need 
                //for(int i =0; i<max; i++){ ... (read from keyboard)}
            //TODO When fo you need to stop? 
                //While(value<0){ ... (read from keyboard)}
            bs[i] = new D(x+i, y+i, ff*i, doub*i, gs);
        }
        
        for(int i=0; i<2; i++){
            as[i] = new A(aa, bb, as, bs, cs);
            System.out.println("a -> " + as[i]);
        }
        
        //for(int j=0; j<5; j++){
        //    System.out.println("bs[" + j + "] -> " + bs[j]);
        //}
        
    }
    
}
