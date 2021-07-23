/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abstractquiz.model;

import java.util.ArrayList;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class A {
    private int a;
    private int b;
    private A[] as = new A[2];
    private B[] bs = new B[5];
    private ArrayList<C> cs = new ArrayList<>();
    
    
    public A m(int m, int n){
        return new A(m, n, as, bs, cs);
    }
    
    public A m(){
        return new A(0, 0, as, bs, cs);
    }

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + 
                ", as=" + as + ", bs=" + bs + ", cs=" + cs + '}';
    }

    public A(int a, int b, A[] as, B[] bs, ArrayList<C> cs) {
        this.a = a;
        this.b = b;
        //this.as = as; this may not work
        for(int i=0; i<as.length; i++){
            this.as[i] = as[i];
        }
        //this.bs = bs; this may not work
        for(int i=0; i<bs.length; i++){
            this.bs[i] = bs[i];
        }
        this.cs = cs;
    }
    
    public A() {
        this.a = 0;
        this.b = 0;
        for(int i=0; i<as.length; i++){
            this.as[i] = new A(0, 0, as, bs, cs);
        }
        for(int i=0; i<bs.length; i++){
            ArrayList<G> gs = new ArrayList<>();
            this.bs[i] = new D(0, 1, 0.0F, 1.0F, gs);
        }
        this.cs = cs;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the as
     */
    public A[] getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(A[] as) {
        this.as = as;
    }

    /**
     * @return the bs
     */
    public B[] getBs() {
        return bs;
    }

    /**
     * @param bs the bs to set
     */
    public void setBs(B[] bs) {
        this.bs = bs;
    }

    /**
     * @return the cs
     */
    public ArrayList<C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }
    
    
}
