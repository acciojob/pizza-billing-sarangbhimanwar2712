package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


    private int cheeseExtra;
    private int topping;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isBillGenerated=false;
        this.isExtraCheeseAdded=false;
        this.isExtraToppingAdded=false;
        this.isTakeAwayAdded=false;
        this.bill ="";

        this.isVeg = isVeg;
        if(isVeg==true){
            this.price=300;
            this.topping = 70;

        }
        else{
            price=400;
            this.topping=120;

        }
        this.cheeseExtra=80;
        this.bill += "Base Price Of The Pizza: "+this.price +"\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(isExtraCheeseAdded==false){
            this.price=this.price+cheeseExtra;
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(isExtraToppingAdded==false){
            this.price=this.price+topping;
            isExtraToppingAdded=true;
        }

    }

    public void addTakeaway(){
        if(isTakeAwayAdded==false){
            this.price=this.price+20;
            isTakeAwayAdded=true;
        }

    }

    public String getBill(){
        if(isBillGenerated==false){
            if(isExtraCheeseAdded){
                this.bill += "Extra Cheese Added: "+this.cheeseExtra +"\n";
            }
            if(isExtraToppingAdded){
                this.bill += "Extra Toppings Added: "+this.topping+"\n";
            }
            if(isTakeAwayAdded){
                this.bill+="Paperbag Added: "+"20"+"\n";
            }

            this.bill +="Total Price: "+this.price+"\n";
            isBillGenerated=true;

        }

        return this.bill;
    }
}

