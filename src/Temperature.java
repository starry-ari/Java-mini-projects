//Inheritance subclass, Temperature.
//Implements Comparable interface
//Compares degree int from object
public class Temperature extends ClimateData implements Comparable<Temperature> {

//Data fields

    public String location;
    private int tempVal;

    public Temperature() {
        super();
    }

    public Temperature(int tempVal, String location) {

        this.location = location;
        this.tempVal = tempVal;
    }

    // Override toString method
    public String toString() {
        return "Temperature: " + tempVal + " degrees," + " Location: " + location;
    }

    //setter
    public void setTemp(String location, int tempVal) {
        this.location = location;
        this.tempVal = tempVal;
    }

    //Getters
    public int getTempVal() {
        return tempVal;
    }

    public String getLocation() {
        return location;
    }
//Overridden CompareTo method
    @Override
    public int compareTo(Temperature obj) {
        if (this.tempVal > obj.tempVal) {
            return 1;
        } else if (this.tempVal < obj.tempVal) {
            return -1;
        } else {
            return 0;
        }
    }
}
