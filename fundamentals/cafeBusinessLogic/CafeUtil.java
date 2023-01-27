import java.util.ArrayList;
public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int listSum = 0;
        ArrayList<Integer> myStreak = new ArrayList<Integer> (numWeeks);
        for (int i = 0 ; i < numWeeks; i++){
            myStreak.add(i+1);
            listSum += myStreak.get(i);
        }
        return(listSum);
    }
    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for (int i = 0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menu){
        for (int i = 0; i < menu.size(); i++){
            System.out.println(menu.get(i));
        }
    }
    public void addCustomers(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() +" customers ahead of you.");
        customers.add(userName);
    }
}
