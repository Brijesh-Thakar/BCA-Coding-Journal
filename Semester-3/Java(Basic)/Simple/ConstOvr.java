class book
{
    String Title;
    int Price;

    book()
    {
        Title="OOp Using C++";
        Price=189;
    }
    book(int P, String T)
    {
        Price=P;
        Title=T;
    }

    void Show()
    {
        System.out.println("Title Of Book:"+Title);
        System.out.println("Price Of Book:"+Price);
    }
}

class ConstOvr
{
    public static void main(String args[])
    {
        book B1 = new book();
        book B2 = new book(1812,"OOp Using C++");
        B1.Show();
        B2.Show();
    }
}