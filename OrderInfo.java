/**
 *
 * @author Jaafary
 */
public class OrderInfo {
    static String EventType;
    static String Pax;
    static String Date;
    
    static String WestPrice;
    static String WestSubTotal;
    static String WestMenu;
    
    static String FilPrice;
    static String FilSubTotal;
    static String FilMenu;
    
    static String MedPrice;
    static String MedSubTotal;
    static String MedMenu;
    
    //Event type
    public static String getEventType(){
        return EventType;
    }
    public void setEventType(String nEventType){
        EventType = nEventType;
    }
    
    //Number of Attendees
    public static String getPax(){
        return Pax;
    }
    public void setPax(String nPax){
        Pax = nPax;
    }
    
    //Date
    public static String getDate(){
        return Date;
    }
    public void setDate(String nDate){
        Date = nDate;
    }
    
    //Western Menu
    public String getWestPrice(){
        return WestPrice;
    }
    public void setWestPrice(String nWestPrice){
        WestPrice = nWestPrice;
    }
    public String getWestSubTotal(){
        return WestSubTotal;
    }
    public void setWestSubTotal(String nWestSubTotal){
        WestSubTotal = nWestSubTotal;
    }
    public String getWestMenu(){
        WestMenu=("Wester Menu");
        return WestMenu;
    }
    
    //Filipino Menu
    public String getFilPrice(){
        return FilPrice;
    }
    public void setFilPrice(String nFilPrice){
        FilPrice = nFilPrice;
    }
    public String getFilSubTotal(){
        return FilSubTotal;
    }
    public void setFilSubTotal(String nFilSubTotal){
        FilSubTotal = nFilSubTotal;
    }
    public String getFilMenu(){
        FilMenu=("Filipino Menu");
        return FilMenu;
    }
    
    //Mediterranean Menu
    public String getMedPrice(){
        return MedPrice;
    }
    public void setMedPrice(String nMedPrice){
        MedPrice = nMedPrice;
    }
    public String getMedSubTotal(){
        return MedSubTotal;
    }
    public void setMedSubTotal(String nMedSubTotal){
        MedSubTotal = nMedSubTotal;
    }
    public String getMedMenu(){
        MedMenu = ("Mediterranean Menu");
        return MedMenu;
    }
}
