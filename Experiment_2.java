class Electricity{
    private int c_num;
    private String c_name;
    private int p_month_reading;
    private int c_month_reading;
    private String type;
    public Electricity(int c_num,String c_name,int p_month_reading,int c_month_reading,String type){
        this.c_num=c_num;
        this.c_name=c_name;
        this.p_month_reading=p_month_reading;
        this.c_month_reading=c_month_reading;
        this.type=type;
    }
    public double bill(){
        double units=c_month_reading-p_month_reading;
        if (type=="domestic"){
            if (units<=100){
                return units*1.0;
            }
            else if (units>=101 && units <=200){
                return units*2.50;
            }
            else if (units>=201 && units<=500){
                return units*4.0;
            } 
            else{
                return units*6.0;
            }
        }
        else{
            if (units<=100){
                return units*2.0;
            }
            else if (units>=101 && units <=200){
                return units*4.50;
            }
            else if (units>=201 && units<=500){
                return units*6.0;
            } 
            else{
                return units*7.0;
            }
        }
    }
}

class Experiment_2{
    public static void main(String[] args){
        Electricity myBill=new Electricity(201,"John",1587,1720,"domestic");
        System.out.println("Total bill : "+myBill.bill());
    }
}



