class Plc 
{
    int Sr_no;
    String Place;

    void getValue()
    {
        Sr_no=1;
        Place="ADL";
    }
    
    void setValue()
    {
        System.out.println("Sr_Number:"+Sr_no);
        System.out.println("Place:"+Place);
    }
}

class clss_1
{
    public static void main(String args[])
    {
        Plc P1 = new Plc();
        P1.getValue();
        P1.setValue();
    }
}