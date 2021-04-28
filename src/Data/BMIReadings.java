/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Observable;

/**
 *
 * @author Stiv
 */
public class BMIReadings extends Observable{

    /**
     * @return the mostRecentFirst
     */
    public boolean isMostRecentFirst() {
        return mostRecentFirst;
    }

    /**
     * @param mostRecentFirst the mostRecentFirst to set
     */
    public void setMostRecentFirst(boolean mostRecentFirst) {
        this.mostRecentFirst = mostRecentFirst;
        setChanged();
        notifyObservers(toString());
    }
    
    ArrayList<BMIData> readings = new ArrayList<BMIData>();
    private boolean mostRecentFirst=false;
    
    public void addReading(BMIData bmid)
    {
        if (bmid.getFlResult()==0.0f) return;
        readings.add(bmid);
        setChanged();
        notifyObservers(toString());
    }
    
    public String toString()
    {
        int i=0;
        String retval = "";
        int numItems =  readings.size();
        if (mostRecentFirst)  for(i=numItems-1;i>=0;i--) retval += readings.get(i).toString() + "\n";
        else for(i=0;i<numItems;i++) retval += readings.get(i).toString() + "\n";
        return retval; 
    }
    
}
