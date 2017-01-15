//This program will output the bottledWaterCalculator class
package bottledwatercalculatortester;

/**
 *
 * @author David Rocha
 */
public class BottledWaterCalculatorTester {


    public static void main(String[] args) {

        //created the BottledWaterCalculator object
        BottledWaterCalculator myCal = new BottledWaterCalculator("USA", 350000000, 190.0, 8.5, 16.0);

        //will output the name of the country, population, number of times it will circle the earth, avg length, and avg volume
        System.out.println("Country name: " + myCal.getCountry() + "\n"
                + "Population: " + myCal.getPop() + "\n"
                + "Number of times : " + myCal.getNumTimes() + "\n"
                + "Average length : " + myCal.getAvgLen() + "\n"
                + "Average Vol: " + myCal.getAvgVol());

        //will output the total amount of bottles used and avg volume in gallons
        System.out.println("======================================================");
        System.out.println("Total bottles used: " + myCal.totBottles(myCal.getEquatorMiles(),
                myCal.getNumTimes(), myCal.getAvgLen()) + " inches" + "\n" + "Avg gallons per person: "
                + myCal.totGallonsPerPerson(myCal.getEquatorMiles(), myCal.getNumTimes(), myCal.getAvgLen(),
                        myCal.getPop(), myCal.getAvgVol()) + " gallons");
        System.out.println("======================================================");

        //will change the length and volume and output it
        System.out.println("Modified Bottle Length: " + myCal.changelength(9.0) + " inches");
        System.out.println("Modified Bottle Volume: " + myCal.changeVol(21.0) + " ounces");
        System.out.println("======================================================");

        //will output the new values
        System.out.println("Country name: " + myCal.getCountry() + "\n"
                + "Population: " + myCal.getPop() + "\n"
                + "Number of times : " + myCal.getNumTimes() + "\n"
                + "Average length : " + myCal.getAvgLen() + "\n"
                + "Average Vol: " + myCal.getAvgVol());

        //will output total amount of bottles used and avg volume in gallons
        System.out.println("======================================================");
        System.out.println("Total bottles used: " + myCal.totBottles(myCal.getEquatorMiles(),
                myCal.getNumTimes(), myCal.getAvgLen()) + " inches" + "\n" + "Avg gallons per person: "
                + myCal.totGallonsPerPerson(myCal.getEquatorMiles(), myCal.getNumTimes(), myCal.getAvgLen(),
                        myCal.getPop(), myCal.getAvgVol()) + " gallons");

    }

}
