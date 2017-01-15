/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottledwatercalculatortester;

/**
 *
 * @author David Rocha
 */
public class BottledWaterCalculator {

    private String conName; //Country name
    private int population; //Population
    private double numTimes; //Number of times it will circle the earth
    private double avgLen; // average length
    private double avgVol; // average volume
    public static double equatorMiles = 24902.00;//contains equator miles
    public static double ozToGal = 128.00;//contains ounces to gallons
    public static double inchesToMiles = 63360.00;//contains inches to miles

    //Will store the bottle water cal with @para string, int, double, double
    public BottledWaterCalculator(String theName, int thePop, double theNum, double theLen, double theVol) {
        conName = theName;
        //makes it start at zero these values cannot be negative
        population = Math.max(thePop, 0);
        numTimes = Math.max(theNum, 0);
        avgLen = Math.max(theLen, 0);
        avgVol = Math.max(theVol, 0);

    }

    //will return the country
    public String getCountry() {
        return conName;
    }

    //will return the population
    public int getPop() {
        return population;
    }

    //will return the population
    public double getNumTimes() {
        return numTimes;
    }

    //will return average length
    public double getAvgLen() {
        return avgLen;
    }

    //return average volume
    public double getAvgVol() {
        return avgVol;
    }

    //will return equator miles
    public double getEquatorMiles() {
        return equatorMiles;
    }

    //will convert the ounces to gallons
    public double getOzToGal() {
        return ozToGal;
    }

    //will change the length when called
    public double changelength(double newLength) {
        avgLen = newLength;
        return avgLen;
    }

    // will change the volume when called
    public double changeVol(double newVol) {
        avgVol = newVol;
        return avgVol;
    }

    //will return the total bottles used
    public double totBottles(double equatorMiles, double numTimes, double avgLen) {
        double totMilesAroundEquator = numTimes * equatorMiles;
        double totInchesAroundEquator = totMilesAroundEquator * inchesToMiles;
        double totBottlesUsed = totInchesAroundEquator / avgLen;
        return totBottlesUsed;
    }

    //return average water consumed in gallons
    public double totGallonsPerPerson(double equatorMiles, double numTimes, double avgLen, int population, double avgVol) {
        double totMilesAroundEquator = numTimes * equatorMiles;
        double totInchesAroundEquator = totMilesAroundEquator * inchesToMiles;
        double totBottlesUsed = totInchesAroundEquator / avgLen;
        double avgOzPerPerson = (totBottlesUsed / population) * avgVol;
        double avgGalPerPerson = avgOzPerPerson / ozToGal;
        return avgGalPerPerson;
    }
}
