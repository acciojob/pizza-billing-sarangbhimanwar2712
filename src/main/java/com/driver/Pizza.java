package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill ;
    private int cheese ;
    private int topping ;


    boolean isExtraCheeseAdded ;
    boolean isExtraToppingsAdded ;
    boolean isTakeAwayAdded ;
    boolean isBillGenerated ;


    public Pizza(Boolean isVeg){
        this.isExtraCheeseAdded = false ;
        this.isExtraToppingsAdded = false ;
        this.isTakeAwayAdded = false ;
        this.isBillGenerated = false ;
        this.bill="";

        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300 ;
            this.topping = 70 ;
        }
        else{
            this.price = 400 ;
            this.topping = 120 ;
        }
        this.cheese = 80 ;
        this.bill = "Base Price Of The Pizza: "+this.price +"\n" ;


    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(!isExtraCheeseAdded){
            this.price += cheese ;
            isExtraCheeseAdded = true ;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            this.price+= topping ;
            isExtraToppingsAdded= true ;
        }
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded){
            this.price+=20 ;
            isTakeAwayAdded = true ;
        }
    }

    public String getBill(){

        if(!isBillGenerated){

            if(isExtraCheeseAdded){
                this.bill +="Extra Cheese Added: "+this.cheese+"\n" ;
            }
            if(isExtraToppingsAdded){
                this.bill +="Extra Toppings Added: "+this.topping +"\n" ;
            }
            if(isTakeAwayAdded){
                this.bill += "Paperbag Added: "+"20" + "\n" ;
            }

            this.bill += "Total Price: "+this.price +"\n" ;
        }

        return this.bill;
    }
}
