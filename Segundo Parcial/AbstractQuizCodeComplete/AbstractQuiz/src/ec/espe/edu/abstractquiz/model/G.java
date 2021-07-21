/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abstractquiz.model;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class G {
    private int Z;

    @Override
    public String toString() {
        return "G{" + "Z=" + Z + '}';
    }

    public G(int Z) {
        this.Z = Z;
    }

    /**
     * @return the Z
     */
    public int getZ() {
        return Z;
    }

    /**
     * @param Z the Z to set
     */
    public void setZ(int Z) {
        this.Z = Z;
    }
    
    
}
