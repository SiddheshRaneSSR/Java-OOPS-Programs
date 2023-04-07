/*
 * 
 * attributes : number , name , balance  
 * methods  :  deposit, withdraw ,check balance
 * 
 */

 class bank{
    String name;
    int number ;
    int balance;

    bank(String name,int number, int balance){
      this.name=name;
      this.number=number;
      this.balance= balance;
    }

    public void deposit(int amount){

      this.balance+=amount;
      System.out.printf("******DEPOSIT*******\ndeposited : %d$\naccount number : %d\nNew balace : %s$\n",amount,this.number,this.balance);

  }

    public void withdraw(int amount){
      if(amount>this.balance){
        System.out.println("******WITHDRAW*******\nInsufficient balance");
      }else{
      this.balance-=amount;
      System.out.printf("******WITHDRAW*******\naccount number : %d\nwithdraw : %d$\nnew balace : %s$\n",this.number,amount,this.balance);
      }
    }

    public void balance(){
        System.out.printf("******BALANCE*******\nBalace : %d\n",this.balance);
    }


 }



 public class bankMain{

   
  public static void main(String [] args) {



    bank account1 = new bank("Siddhesh",1,10000);
    bank account2 = new bank("Vivek", 2,10000);
    bank account3=new bank ("abhishek",3,10000);
    

    System.out.println("***************Account 1 *******************");
    account1.balance();
    account1.deposit(10000);
    account1.withdraw(50000);
    account1.balance();

    System.out.println("\n\n\n\n\n***************Account 2 *******************");
    account2.deposit(15000);
    account2.withdraw(15000);
    account2.balance();


    System.out.println("\n\n\n\n\n***************Account 3 *******************");
    account3.deposit(20000);
    account3.withdraw(5000);
    account3.balance();


  }
 }