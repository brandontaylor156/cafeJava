import java.util.ArrayList;
import java.util.Arrays;
import java.text.NumberFormat;

public class TestCafe {
    public static void main(String[] args) {
        
        CafeUtil appTest = new CafeUtil();
            
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(10));
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};

        ArrayList<Double> items = new ArrayList<Double>();
        items.add(3.5);
        items.add(1.5);
        items.add(4.0);
        items.add(4.5);

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.printf("Order total: %s \n\n",formatter.format(appTest.getOrderTotal(lineItems)));
        
        System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        // for (int i = 0; i < 4; i++) {
        //     // appTest.addCustomer(customers);
        //     // System.out.println("\n");
        // }

        appTest.printPriceChart("Turkey", 3.5, 12);
        appTest.displayMenu(menu, items);
        appTest.addCustomers(customers);
    }

}
