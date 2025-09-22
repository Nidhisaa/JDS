
class Billing {
    public static void main(String[] args) {
        int iteama = 200;
        int iteamb = 75;
        int iteamc = 500;
        double price;

        price = ((iteama * 2) + (iteamb) + (iteamc * 3)) / 1975.0;

        price = price - (0.1 * price);  
        price = price + (0.05 * price);  

        System.out.println(price);
    }
}
