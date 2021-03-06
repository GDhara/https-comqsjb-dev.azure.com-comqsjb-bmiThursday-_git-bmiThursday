/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Observable;

/**
 *
 * @author comqsjb
 */
public class BMIData extends Observable {

    /**
     * @return the useM
     */
    public boolean isUseM() {
        return useM;
    }

    /**
     * @param useM the useM to set
     */
    public void setUseM(boolean useM) {
        this.useM = useM;
    }

    /**
     * @return the useKg
     */
    public boolean isUseKg() {
        return useKg;
    }

    /**
     * @param useKg the useKg to set
     */
    public void setUseKg(boolean useKg) {
        this.useKg = useKg;
    }

    /**
     * @return the flHeightInMetres
     */
    public float getFlHeightInMetres() {
        return flHeightInMetres;
    }
    
    private float inchesToMetres(float inches)
    {
        return inches*2.54F/100.0F;
    }
    
    private float lbsToKg(float lbs)
    {
        return lbs/2.2F;
    }
    
    public void setHeightWeightAndUnits(String h, String w, boolean useM, boolean useKg)
    {
        try
        {
        float height = Float.parseFloat(h);
        float weight = Float.parseFloat(w);
        this.useM = useM;
        this.useKg = useKg;
        if (!useM) height = inchesToMetres(height);
        if (!useKg) weight = lbsToKg(weight);
        setFlHeightInMetres(height);
        setFlWeightInKg(weight);
        }
        catch (Exception e)
        {
         setChanged();
         notifyObservers("Invalid numbers");   
        }
        
        
    }
    
    private void calculateBMI()
    {
        if (flHeightInMetres==0) return;
        flResult = flWeightInKg/(flHeightInMetres*flHeightInMetres);
        setChanged();
        notifyObservers("BMI " + flResult);
    }

    /**
     * @param flHeightInMetres the flHeightInMetres to set
     */
    public void setFlHeightInMetres(float flHeightInMetres) {
        this.flHeightInMetres = flHeightInMetres;
        calculateBMI();
    }

    /**
     * @return the flWeightInKg
     */
    public float getFlWeightInKg() {
        return flWeightInKg;
    }

    /**
     * @param flWeightInKg the flWeightInKg to set
     */
    public void setFlWeightInKg(float flWeightInKg) {
        this.flWeightInKg = flWeightInKg;
        calculateBMI();
    }

    /**
     * @return the flResult
     */
    public float getFlResult() {
        return flResult;
    }

    /**
     * @param flResult the flResult to set
     */
    public void setFlResult(float flResult) {
        this.flResult = flResult;
    }
    
    
    public String toString()
    {
        strResult = String.format("W: %.0f; H: %.1f; BMI: %.1f", flWeightInKg, flHeightInMetres, flResult);
        return strResult;
    }
    private float flHeightInMetres=0.0f;
    private float flWeightInKg=0.0f;
    private float flResult=0.0f;
    private String strResult="";
    
    private boolean useM;
    private boolean useKg;
}
