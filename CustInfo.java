public class CustInfo extends OrderInfo
{
   static  String FCustName;
   static  String LCustName;
   static String cuisine;
   static String payment;
   static String total;
   static String perHead;

    
    public static String getCustFName()
    {
        return FCustName;
    }
    public static String getCustLName()
    {
        return LCustName;
    }
    
    public static void setCustFName(String newName)
    {
        FCustName = newName;
    }
    
    public static void setCustLName(String newName)
    {
        LCustName = newName;
    }
    
    public static String getCuisineType()
    {
        return cuisine;
    }
    
    public static void setCuisineType(String cuisineType)
    {
        cuisine = cuisineType;
    }
    
    public static void setMOP(String paymentType)
    {
        payment = paymentType;
    }
    
    public static String getMOP()
    {
        return payment;
    }
    
    public static void setTotal(String subTotal)
    {
        total = subTotal;
    }
    
    public static String getTotal()
    {
        return total;
    }
    
    public static void setPerHead(String pHead)
    {
        perHead = pHead;
    }
    
    public static String getPerHead()
    {
        return perHead;
    }

    
    
}
