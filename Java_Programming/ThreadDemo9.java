
class BankAccount
{
    public int Balanace = 1000;

    public void Withdrawal(int Amount)
    {
        if(Amount <= Balanace)
        {
            System.out.println(Thread.currentThread().getName()+"successfuly windraw the Amount..!");
            Balanace = Balanace - Amount; 
            System.out.println("Balance Amount is : "+Balanace);
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+"Unable to windraw the Amount..!");
        }
    }
}

class Customer extends Thread
{
    public BankAccount bobj;

    public Customer(BankAccount obj , String Name)
    {
        super(Name);
        this.bobj = obj;
    }
    public void run()
    {
        bobj.Withdrawal(800);
    }
    
}

class ThreadDemo9
{
    public static void main(String A[]) throws Exception
    {
        BankAccount bobj = new BankAccount();

        Customer cobj1 = new Customer(bobj,"Sagar ");
        Customer cobj2 = new Customer(bobj,"Sumit ");

        cobj1.start();
        cobj2.start();

        cobj1.join();
        cobj2.join();

        System.out.println("End of Banking Application...!");

    }
}