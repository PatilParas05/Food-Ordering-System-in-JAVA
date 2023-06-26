import java.util.*;
import java.io.*; 
import java.text.SimpleDateFormat; 
class HungryHelpers implements Serializable 
{ 
     protected int choice1,choice2,choice3, 
        quanƟty,price,sizeprice,
        totalbill,order; 
    public static int corder;
    protected String food,size,daƟ;
 
        void pizza() 
        { 
                Date date=new Date(); 
                 SimpleDateFormat formaƩer = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                 char re='j'; 
                boolean exit=true; 
 
                 Scanner in=new Scanner(System.in); 
    do 
{ 
        System.out.println("1.Golden Corn Pizza---------->89"); 
        System.out.println("2.Veg Loaded Pizza----------->119"); 
        System.out.println("3.Non-Veg Loaded Pizza------->149"); 
        System.out.println("4.Chessy Pizza--------------->109"); 
        
        System.out.println("Enter the choice..."); 
        choice1=in.nextInt(); 
        if(choice1>=1 && choice1<=4) 
 { 
 switch (choice1) 
 { 
        case 1:price=89; 
        food="Golden Corn Pizza";break; 
        case 2:price=119; 
        food="Veg Loaded Pizza";break; 
        case 3:price=149; 
        food="Non-Veg Loaded Pizza";break; 
        case 4:price=109; 
        food="Chessy Pizza";break; 
        } 
            System.out.println("1.Small---------->"+price); 
            System.out.println("2.Regular-------->"+(price+30)); 
            System.out.println("3.Large---------->"+(price+60)); 
            System.out.println("Enter the Pizza Size"); 
            choice2=in.nextInt(); 
 do 
 { 
    if (choice2>3 || choice2<1 ) 
    { 
        System.out.println("!!Invalid choice \n Re-enter the choice"); 
        choice2=in.nextInt(); 
        } 
 if(choice2>=1 && choice2<=3) 
 { 
    System.out.println("Enter the quanƟty");
    quanƟty=in.nextInt();
    switch(choice2) 
        { 
        case 1:totalbill=price*quanƟty;
        size="Small Size";break; 
        case 2:totalbill=(price+30)*quanƟty;
        size="Regular Size";break; 
        case 3:totalbill=(price+60)*quanƟty;
        size="Large Size";break; 
        } 
        System.out.println("\n\n Enter any Character to see your order.............."); 
        re=in.next().charAt(0); 
        corder++; 
        order=corder; 
        daƟ=formaƩer.format(date);
        exit=false; 
        
 } 
 
 
 
    }while(choice2>3 || choice2<1 ); 
    } 
    else 
    { 
    System.out.println("!!Invalid choice \n Enter any Character to Re-Enter choice"); 
    re=in.next().charAt(0); 
    } 
 
    }while(exit ); 
 } 
        void burger() 
    { 
            Date date=new Date(); 
            SimpleDateFormat formaƩer = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            char re='j'; 
            boolean exit=true; 
            
            Scanner in=new Scanner(System.in); 
 do 
 { 
                System.out.println("1.Veg Double Whopper---------->229"); 
                System.out.println("2.Veg Whopper----------------->179"); 
                System.out.println("3.Veg Whopper With Chesse----->194"); 
                System.out.println("4.Indie Chicken Whopper------->239"); 
                
                System.out.println("Enter the choice..."); 
                choice1=in.nextInt(); 
        if(choice1>=1 && choice1<=4) 
 { 
        switch (choice1) 
    { 
        case 1:price=229; 
        food="Veg Double Whopper";break; 
        case 2:price=179; 
        food="Veg Whopper";break; 
        case 3:price=194; 
        food="Veg Whopper With Chesse";break; 
        case 4:price=239; 
        food="Indie Chicken Whopper";break; 
        } 
                System.out.println("1.Small---------->"+price); 
                System.out.println("2.Regular-------->"+(price+30)); 
                System.out.println("3.Large---------->"+(price+60)); 
                System.out.println("Enter the Burger Size"); 
                choice2=in.nextInt(); 
                do 
 { 
    if (choice2>3 || choice2<1 ) 
 { 
        System.out.println("!!Invalid choice \n Re-enter the choice"); 
        choice2=in.nextInt(); 
 } 
        if(choice2>=1 && choice2<=3) 
 { 
            System.out.println("Enter the quanƟty");
                quanƟty=in.nextInt();
                    switch(choice2) 
                    { 
                    case 1:totalbill=price*quanƟty;
                    size="Small Size";break; 
                    case 2:totalbill=(price+30)*quanƟty;
                    size="Regular Size";break; 
                    case 3:totalbill=(price+60)*quanƟty;
                    size="Large Size";break; 
                    } 
                          System.out.println("\n\n Enter any Character to see your order.............."); 
                           re=in.next().charAt(0); 
                             corder++; 
                            order=corder; 
                             daƟ=formaƩer.format(date);
                             exit=false; 
 
 } 
 
 
 
        }while(choice2>3 || choice2<1 ); 
    } 
     else 
    { 
        System.out.println("!!Invalid choice \n Enter any Character to Re-Enter choice"); 
        re=in.next().charAt(0); 
    } 
 
     }while(exit ); 
 } 
    void dosa() 
 { 
            Date date=new Date(); 
            SimpleDateFormat formaƩer = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            char re='j'; 
            boolean exit=true; 
            
            Scanner in=new Scanner(System.in); 
        do 
 { 
            System.out.println("1.Cheese Masala Dosa---------->105"); 
            System.out.println("2.Plain Dosa------------------>80"); 
            System.out.println("3.BuƩer Plain Dosa----------->95"); 
            System.out.println("4.BuƩer Masala Dosa---------->100"); 
            
            System.out.println("Enter the choice..."); 
            choice1=in.nextInt(); 
            if(choice1>=1 && choice1<=4) 
            { 
            switch (choice1) 
            { 
            case 1:price=105; 
            food="Cheese Masala Dosa";break; 
            case 2:price=80; 
            food="Plain Dosa";break; 
            case 3:price=95; 
            food="BuƩer Plain Dosa";break;
            case 4:price=100; 
            food="BuƩer Masala Dosa";break;
            } 
                System.out.println("1.Small---------->"+price); 
                System.out.println("2.Regular-------->"+(price+30)); 
                System.out.println("3.Large---------->"+(price+60)); 
                System.out.println("Enter the Dosa Size"); 
                choice2=in.nextInt(); 
 do 
 { 
        if (choice2>3 || choice2<1 ) 
              { 
                    System.out.println("!!Invalid choice \n Re-enter the choice"); 
                    choice2=in.nextInt(); 
             } 
                    if(choice2>=1 && choice2<=3) 
                    { 
                         System.out.println("Enter the quanƟty");
                         quanƟty=in.nextInt();
                             switch(choice2) 
                        { 
                            case 1:totalbill=price*quanƟty;
                            size="Small Size";break; 
                            case 2:totalbill=(price+30)*quanƟty;
                            size="Regular Size";break; 
                            case 3:totalbill=(price+60)*quanƟty;
                            size="Large Size";break; 
                         } 
                System.out.println("\n\n Enter any Character to see your order.............."); 
                re=in.next().charAt(0); 
                corder++; 
                order=corder; 
                daƟ=formaƩer.format(date);
                exit=false; 
 
 } 
 
 
 
    }while(choice2>3 || choice2<1 ); 
 } 
     else 
 { 
        System.out.println("!!Invalid choice \n Enter any Character to Re-Enter choice"); 
        re=in.next().charAt(0); 
 } 
 
 }while(exit ); 
 } 
 void Biryani() 
 { 
        Date date=new Date(); 
        SimpleDateFormat formaƩer = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        char re='j'; 
        boolean exit=true; 
        
        Scanner in=new Scanner(System.in); 
do 
 { 
        System.out.println("1.Dum Biryani----------------------------->394"); 
        System.out.println("2.Paneer Makhani Biryani ----------------->369"); 
        System.out.println("3.Smoked BuƩer Chicken Biryani----------->399"); 
        System.out.println("4.Afghani Chicken Tikka Biryani ---------->399"); 
        
        System.out.println("Enter the choice..."); 
        choice1=in.nextInt(); 
 if(choice1>=1 && choice1<=4) 
 { 
 switch (choice1) 
 { 
        case 1:price=394; 
        food="Dum Biryani";break; 
        case 2:price=369; 
        food="Paneer Makhani Biryani ";break; 
        case 3:price=399; 
        food="Smoked BuƩer Chicken Biryani";break;
        case 4:price=399; 
        food="Afghani Chicken Tikka Biryani ";break; 
 } 
        System.out.println("1.Half---------->"+price); 
        System.out.println("2.Regular------->"+(price+30)); 
        System.out.println("3.Full---------->"+(price+60)); 
        System.out.println("Enter the Biryani Size"); 
        choice2=in.nextInt(); 
 do 
 { 
        if (choice2>3 || choice2<1 ) 
        { 
        System.out.println("!!Invalid choice \n Re-enter the choice"); 
        choice2=in.nextInt(); 
        } 
        if(choice2>=1 && choice2<=3) 
        { 
        System.out.println("Enter the quanƟty");
        quanƟty=in.nextInt();
 switch(choice2) 
 { 
        case 1:totalbill=price*quanƟty;
        size="Half";break; 
        case 2:totalbill=(price+30)*quanƟty;
        size="Regular";break; 
        case 3:totalbill=(price+60)*quanƟty;
        size="Full";break; 
 } 
                System.out.println("\n\n Enter any Character to see your order.............."); 
                re=in.next().charAt(0); 
                corder++; 
                order=corder; 
                daƟ=formaƩer.format(date);
                exit=false; 
                
 } 
 
 
 
 }while(choice2>3 || choice2<1 ); 
 } 
 else 
 { 
    System.out.println("!!Invalid choice \n Enter any Character to Re-Enter choice"); 
    re=in.next().charAt(0); 
 } 
 
 }while(exit ); 
 } 
 void paratha() 
 { 
        Date date=new Date(); 
        SimpleDateFormat formaƩer = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        char re='j'; 
        boolean exit=true; 
        
        Scanner in=new Scanner(System.in); 
 do 
 { 
        System.out.println("1.Keema Paratha--------------->174"); 
        System.out.println("2.Paneer Makhani Biryani ----->139"); 
        System.out.println("3.Gobi Paratha---------------->159"); 
        System.out.println("4.Methi Paratha -------------->134"); 
        
        System.out.println("Enter the choice..."); 
        choice1=in.nextInt(); 
 if(choice1>=1 && choice1<=4) 
 { 
 switch (choice1) 
 { 
            case 1:price=174; 
            food="Keema Paratha";break; 
            case 2:price=139; 
            food="Aloo Paratha ";break; 
            case 3:price=159; 
            food="Gobi Paratha";break; 
            case 4:price=134; 
            food="Methi Paratha";break; 
 } 
                System.out.println("1.Small---------->"+price); 
                System.out.println("2.Regular-------->"+(price+30)); 
                System.out.println("3.Large---------->"+(price+60)); 
                System.out.println("Enter the paratha Size"); 
                choice2=in.nextInt(); 
 do 
 { 
 if (choice2>3 || choice2<1 ) 
 { 
            System.out.println("!!Invalid choice \n Re-enter the choice"); 
            choice2=in.nextInt(); 
            } 
            if(choice2>=1 && choice2<=3) 
            { 
            System.out.println("Enter the quanƟty");
            quanƟty=in.nextInt();
            switch(choice2) 
            { 
            case 1:totalbill=price*quanƟty;
            size="Small";break; 
            case 2:totalbill=(price+30)*quanƟty;
            size="Regular";break; 
            case 3:totalbill=(price+60)*quanƟty;
            size="Large";break; 
 } 
        System.out.println("\n\n Enter any Character to see your order.............."); 
        re=in.next().charAt(0); 
        corder++; 
        order=corder; 
        daƟ=formaƩer.format(date);
        exit=false; 
 
 } 
 
 
 
 }while(choice2>3 || choice2<1 ); 
 } 
 else 
 { 
        System.out.println("!!Invalid choice \n Enter any Character to Re-Enter choice"); 
        re=in.next().charAt(0); 
 } 
 
 }while(exit ); 
 } 
 
 
 void display() 
 { 
 
        System.out.println("\n\n!!ORDER NO."+order+"!!"); 
        System.out.println(quanƟty+" "+size+" "+food);
        System.out.println("Your Total Bill is "+totalbill); 
        System.out.println("Thank you For Ordering From Hungry Helpers"); 
        System.out.println(daƟ+"\n"); 
 } 
} 
class User extends HungryHelpers 
{ 
 public static final String USERNAME="HPVA";
 public static final String PASSWORD="hpva@2005"; 
 void totalOrder(Vector<HungryHelpers> v) 
 { 
    int to=0; 
    for(HungryHelpers h: v) 
        { 
        to++; 
        } 
        System.out.println("Your Total order's Are="+to); 
 } 
 void allOrder(Vector<HungryHelpers> v) 
 { 
        for(HungryHelpers h: v) 
 { 
        h.display(); 
 } 
 } 
 
 void profit(Vector<HungryHelpers> v) 
 { 
        int tp=0; 
        for(HungryHelpers h: v) 
        { 
        tp=h.totalbill+tp; 
        } 
        System.out.println("Total Bill is="+tp); 
 } 
} 
class Delete extends HungryHelpers 
{ 
         boolean delete(Vector<HungryHelpers> v) 
 { 
        Scanner in=new Scanner(System.in); 
        int no,i=0; 
        boolean invalid=true; 
        System.out.println("Enter the Order no"); 
        no=in.nextInt(); 
 for(i=0;i<v.size();i++) 
 { 
        HungryHelpers dele=v.get(i); 
        if(dele.order==no) 
        { 
        System.out.println("Your order no."+dele.order+" is deleted"); 
        v.remove(dele); 
        invalid=false; 
        
 break; 
 } 
 } 
 if(invalid) 
 { 
        System.out.println("Invalid order no!!"); 
        return false; 
 } 
       else 
       return true; 
 } 
} 
class ReadWriteFile extends HungryHelpers 
{ 
 int readFood(Vector<HungryHelpers> v,HungryHelpers [] hh) throws Exception
 { 
        int i=0; 
        boolean or=false; 
 
 try 
 { 
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("FoodFile.txt")); 
        try 
 { 
              while(true) 
              { 
              hh[i]=(HungryHelpers) in.readObject(); 
              v.add(hh[i]); 
              i++; 
              or=true; 
              } 
 } 
       catch(IOException e)
 { 
       in.close(); 
 } 
 } 
              catch (IOException e)
 { 
 
 } 
 
 if(or) 
       HungryHelpers.corder=v.lastElement().order; 
       return i; 
 } 
 void writeFood(Vector<HungryHelpers> v) throws Exception
       { 
       ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FoodFile.txt")); 
       for(HungryHelpers hp: v) 
 { 
 out.writeObject(hp); 
 } 
 out.close(); 
 } 
} 
public class Food_Ordering_System
{ 
 public static void main(String[] args) throws Exception
 { 
 
 
       Scanner in=new Scanner(System.in); 
       int c,maina=2,mainb; 
       boolean a=true,ret=false,uspa=true; 
       String un,pw; 
       int i=0; 
       Delete d=new Delete(); 
       HungryHelpers [] h=new HungryHelpers[700]; 
       Vector<HungryHelpers> v=new Vector<HungryHelpers>(15,5); 
       ReadWriteFile r=new ReadWriteFile(); 
              i=r.readFood(v, h); 
              System.out.println("Are you a customer or user??\n1.CUSTOMER\n2.USER"); 
              mainb=in.nextInt(); 
              while(mainb!=1 && mainb!=2 ) 
              { 
              
              System.out.println("!!Invalid Answer Type:-\n 1.CUSTOMER \n 2.USER"); 
              mainb=in.nextInt(); 
              } 
                     if(mainb==1) 
                     { 
                     System.out.println("\n\t\t\t----------Hungry Helpers-----------"); 
                     System.out.println("\n*WELCOME*\n"); 
                     System.out.println("Please Enter Your Name: "); 
                     in.nextLine(); 
                     String name=in.nextLine(); 
                     System.out.println("Hello "+name+" What would you like to order?\n\n"); 
       do 
       { 
       System.out.println("\t\t\t\t--------Menu--------"); 
       System.out.println("1.Pizza"); 
       System.out.println("2.Burger"); 
       System.out.println("3.Dosa"); 
       System.out.println("4.Biryani"); 
       System.out.println("5.Paratha"); 
       System.out.println("6.Exit"); 
       System.out.println("PLease Enter the choice"); 
       c=in.nextInt(); 
              if (c<6) 
              { 
              h[i]=new HungryHelpers(); 
              
              } 
              switch(c) 
              { 
              case 1:h[i].pizza();break; 
              case 2:h[i].burger();break; 
              case 3:h[i].dosa();break; 
              case 4:h[i].Biryani();break; 
              case 5:h[i].paratha();break; 
              case 6:System.out.println("Good Bye<^>");break; 
              
              default:System.out.println("!! Invalid choice"); 
              
              } 
              if(c!=6 && c<6) 
              { 
              
              v.add(h[i]); 
              v.get(i).display(); 
              while(ret!=true) 
              { 
              System.out.println("\n\n\nDo you want to delete your order??\n 1.YES \n 2.NO"); 
              maina=in.nextInt(); 
              while(maina!=1 && maina!=2 ) 
                 { 
                            
                     System.out.println("!!Invalid Answer Type:-\n 1.YES \n 2.NO"); 
                     maina=in.nextInt(); 
                   } 
                   if(maina==1) 
                     { 
                            ret=d.delete(v); 
                            i--; 
                     } 
                            else 
                            ret=true; 
              } 
 System.out.println("\n\n\nAre you willing to order again something else in menu??\n 1.YES \n 2.NO"); 
 maina=in.nextInt(); 
       while(maina!=1 && maina!=2 ) 
       { 
       
       System.out.println("!!Invalid Answer Type:-\n 1.YES \n 2.NO"); 
       maina=in.nextInt(); 
       } 
       if(maina==1) 
       { 
       a=true; 
       i++; 
       ret=false; 
       } 
       else 
       { 
       System.out.println("Good Bye<^>"); 
       a=false; 
       } 
 } 
 
              }while(a && c!=6); 
              } 
              else 
              { 
              uspa=true; 
              int count=0,k=0,chance1=3,chance2=3; 
              boolean whi=true; 
              User u=new User(); 
 
                     while(uspa) 
                     { 
                     in.nextLine(); 
                     System.out.println("Enter the USERNAME You have "+chance1+" chance"); 
                     un=in.nextLine(); 
                     int x=un.compareTo(User.USERNAME); 
                     if(x==0) 
                     { 
                     boolean bool=true; 
                     while(bool) 
                     { 
                     System.out.println("Enter the PASSWORD You have "+chance2+" chance"); 
                     pw=in.nextLine(); 
                     int y=pw.compareTo(User.PASSWORD); 
                     if(y==0) 
                     { 
                     
                     System.out.println("\n\t\t\t----------Hungry Helpers-----------"); 
                     System.out.println("\n*WELCOME*\n"); 
                     while(whi) 
                     { 
                     System.out.println("\t\t\t\t--------Menu--------"); 
                     System.out.println("1.Total Order's"); 
                     System.out.println("2.Display All Orders "); 
                     System.out.println("3.Todays Profit"); 
                     System.out.println("4.Exit"); 
                     System.out.println("PLease Enter the choice"); 
                     c=in.nextInt(); 
                     while(c>4 ) 
                     { 
                     
                     System.out.println("!!Invalid Choice Re-Enter the choice"); 
                     c=in.nextInt(); 
                     } 
       switch(c) 
       { 
       case 1:u.totalOrder(v);break; 
       case 2:u.allOrder(v);break; 
       case 3:u.profit(v); 
       case 4:System.out.println("Good Bye<^>");whi=false;break; 
       
       } 
       System.out.println("\n\n Do you want to see more data??\n 1.YES \n 2.NO"); 
       maina=in.nextInt(); 
       
       while(maina!=1 && maina!=2 ) 
       { 
       
       System.out.println("!!Invalid Answer Type:-\n 1.YES \n 2.NO"); 
       maina=in.nextInt(); 
       
       } 
       if(maina==1) 
       { 
       whi=true; 
       } 
       else 
       { 
       System.out.println("Good Bye<^>"); 
       whi=false; 
       bool=false; 
       uspa=false; 
       } 
 } 
 } 
       else 
       { 
       chance2--; 
       count++; 
       if(count==3) 
       { 
       System.out.println("You enter 3 Ɵmes wrong Password Try again later.............");
       bool=false; 
       uspa=false; 
       } 
              else 
              { 
              
              System.out.println("!!Invalid Password!! Re-enter :-"); 
              } 
              
              } 
              
 } 
 } 
 else 
 { 
       chance1--; 
       k++; 
              if(k==3) 
              { 
              System.out.println("You enter 3 Ɵmes wrong Username Try again later.............");
              uspa=false; 
              } 
 else 
 { 
 System.out.println("!!Invalid Username!! Re-enter :-"); 
 } 
 
                            } 
                     } 
              }             
 r.writeFood(v); 
        }      
}