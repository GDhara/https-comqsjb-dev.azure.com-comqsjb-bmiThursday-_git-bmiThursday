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
        float height = Float.parseFloat(h);
        float weight = Float.parseFloat(w);
        if (!useM) height = inchesToMetres(height);
        if (!useKg) weight = lbsToKg(weight);
        setFlHeightInMetres(height);
        setFlWeightInKg(weight);
        
        
    }
    
    private void calculateBMI()
    {
        if (flHeightInMetres==0) return;
        flResult = flWeightInKg/(flHeightInMetres*flHeightInMetres);
        setChanged();
        notifyObservers(flResult);
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
    private float flHeightInMetres;
    private float flWeightInKg;
    private float flResult;
    private String strResult;
}
