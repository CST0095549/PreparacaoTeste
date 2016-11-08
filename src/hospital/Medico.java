/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Userpl022pc19
 */
public class Medico {
    
    int anDouturamento;
    String instEnsino;
    String idLicenca;

    public Medico(int anDouturamento, String instEnsino) {
        this.anDouturamento = anDouturamento;
        this.instEnsino = instEnsino;
    }

    public int getAnDouturamento() {
        return anDouturamento;
    }

    public void setAnDouturamento(int anDouturamento) {
        this.anDouturamento = anDouturamento;
    }

    public String getInstEnsino() {
        return instEnsino;
    }

    public void setInstEnsino(String instEnsino) {
        this.instEnsino = instEnsino;
    }

    public String getIdLicenca() {
        return idLicenca;
    }

    public void setIdLicenca(String idLicenca) {
        this.idLicenca = idLicenca;
    }
    
    public void prescreverTratamento() {
        
    }
    
}
