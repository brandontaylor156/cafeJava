import java.util.ArrayList;
import java.text.NumberFormat;

public class CafeUtil{

    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        for (double price : prices){
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        for (int i = 1; i <= maxQuantity; i++){
            System.out.println(product);
            double quantity_price = 0;
            if (i == 1)
                quantity_price = i * price;
            else
                quantity_price = i * (price - .5);
            
            System.out.println(i + " - " + formatter.format(quantity_price));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size() != prices.size()){
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i) + " -- " + formatter.format(prices.get(i)));
        }
        return true;
    }

    public void addCustomers(ArrayList<String> customers){
        String userName;
        do {
            System.out.println("Please enter customer name: ('q' when all inputs complete)");
            userName = System.console().readLine();
            System.out.println(userName.toLowerCase());
            customers.add(userName);
        } while (!(userName.equals("q")));
    }
}