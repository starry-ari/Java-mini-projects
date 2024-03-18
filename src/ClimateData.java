public class ClimateData {

    //Data fields
    private int amount;

    public String type;

    //Default constructor
   public ClimateData(){

    }
    public String toString(String t, int am){
       this.type = t;
       this.amount = am;
    return "The " + type + " in Catonsville is " + amount + " degrees.";
    }
    //Overloaded constructor
    public ClimateData( String type){
       this.type = type;
    }
    //Setter
    public void setAmount(int am ){
        this.amount = am;

    }
    //Getter
    public int getAmount(){
    return amount;
    }
}
