public class Profit_loss {
    public static void main(String args[]){
        int cp=129;
        int sp=191;
        double profit = sp-cp;
        double p_p=(profit / cp) * 100;
        System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp);
        System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+p_p);
    }
}
