class Theatre1
{
public static void main(String[]args)
{
Theatre1 raja=new Theatre1();
 int balance=raja.book_ticket(200);
System.out.println("AFTER BOOKING TICKET"+" "+balance);
}
int book_ticket(int book_ticket)
{
int ticket_price=120;
int balance=(book_ticket-ticket_price);
return balance;
}
}
