class marketplace{
    int balance = 1000;


    public String checkbalance(){
        return "balance:" + balance;
    }
    public String deposit(int amt)
    {
        balance+=amt;
        return "balance: " + balance;
    }


    public String pen(int cost)
    {
        if (cost>=100) {
            if(balance>=100) {
                balance -= 100;
                System.out.println("balance left: " + balance);
                return ("1 pen bought");
            }
            else{
                System.out.println("balance left: " + balance);
                return "insufficient balance";
            }
        }
        else
            return "insufficient money";

    }


    public String book(int cost)
    {
        if (cost>=500) {
            if(balance>=500) {
                balance -= 500;
                System.out.println("balance left: " + balance);
                return ("1 book bought");
            }
            else{
                System.out.println("balance left: " + balance);
                return "insufficient balance";
            }
        }
        else
            return("insufficient money");

    }


    public String stationary(int cost)
    {
        if (cost>=700) {
            if(balance>=700) {
                balance -= 700;
                System.out.println("balance left: " + balance);
                return ("1 stationary set bought");
            }   
            else{
                System.out.println("balance left: " + balance);
                return "insufficient balance";
            }
        }
        else
            return("insufficient money");

    }

}




public class Shop
{
    public static void main(String[] args){
        marketplace user = new marketplace();
        System.out.println("welcome to the shop");
        System.out.println(user.pen(900));
        System.out.println(user.book(800));
        System.out.println(user.deposit(1000));
        System.out.println(user.stationary(500));
        System.out.println(user.stationary(900));
        System.out.println(user.checkbalance());

    }
}