import java.io.*;
import java.util.Scanner;
class Invoice{
        //Define instance variables here
        private String id;
        private String name;
        private int quantity;
        private double price;
        public Invoice(){ }
        //Define parameterized constructor here
        public Invoice(String id,String name,int quantity,double price){
            this.id=id;
            this.name=name;
            if (quantity>0){
            this.quantity=quantity;
            }
            else{
                this.quantity=0;
            }
            if(price>0){
            this.price=price;
            }
            else{
                this.price=0;
            }
        }
       // Setters
       public void setId(String id){
          this.id=id; 
       }
       public void setName(String name){
          this.name=name; 
       }
       public void setQuantity(int quantity){
           if (quantity>0){
          this.quantity=quantity; 
           }
           else{
               this.quantity=0;
           }
       }
       public void setPrice(double price){
           if (price>0){
           this.price=price;
           }
           else{
               this.price=0;
           }
       }
       // Getters
       public String getId(){
           return id;
       }
       public String getName(){
           return name;
       }
       public int getQuantity(){
           return quantity;
       }
       public double getPrice(){
           return price;
       }

       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                invoiceAmount= quantity*price;
                return invoiceAmount;
       }
}
public class Experiment_1{
         public static void main(String []args){
                   Invoice myInvoice = new Invoice();
                    //Write your code here
                   //setting values
                   myInvoice.setId("1101");
                   myInvoice.setName("Wheat");
                   myInvoice.setQuantity(2);
                   myInvoice.setPrice(102.50);
                   //getting values
                   String id=myInvoice.getId();
                   String name=myInvoice.getName();
                   int quantity=myInvoice.getQuantity();
                   double price=myInvoice.getPrice();
                //   printing values
                   System.out.println("Id : "+id);
                   System.out.println("Name : "+name);
                   System.out.println("quantity : "+quantity);
                   System.out.println("price : "+price);
                   System.out.println("Total price : "+myInvoice.getInvoiceAmount());
                //   System.out.printf("/-");
                // intialising parameterized constructor
                   Invoice myInvoice2=new Invoice("1102","Rice",5,98.75);
                   
                   String id2=myInvoice2.getId();
                   String name2=myInvoice2.getName();
                   int quantity2=myInvoice2.getQuantity();
                   double price2=myInvoice2.getPrice();
                //   printing values
                   System.out.println();
                   System.out.println("Id : "+id2);
                   System.out.println("Name : "+name2);
                   System.out.println("quantity : "+quantity2);
                   System.out.println("price : "+price2);
                   System.out.println("Total price : "+myInvoice2.getInvoiceAmount());
         }
}


