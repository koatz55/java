public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double machaPrice = 3.5;
        double amricanPrice = 2.0;
        double deluxePrice = 5.5;
        
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Kovu";
        String customer3 = "Aizen";
        String customer4 = "Moise";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // Order totals
        double customerOrderTotal1 = 2.0;
        double customerOrderTotal2 = 3.5;
        double customerOrderTotal3 = 7.0;
        double customerOrderTotal4 = 2.0;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);
        System.out.println(generalGreeting + customer2);
        System.out.println(customer2 + pendingMessage);
        if (isReadyOrder2){
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + customerOrderTotal2 + ", " + customer2);
        }
        System.out.println(displayTotalMessage + customerOrderTotal3 + ", " + customer3);
        if (isReadyOrder3){
            System.out.println(customer3 + readyMessage);
        }
        else{
            System.out.println(customer3 + pendingMessage);
        }
        System.out.println(generalGreeting + customer4);
        System.out.println(customer4 + pendingMessage);
        if (isReadyOrder2){
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + customerOrderTotal4 + ", " + customer4);
        }
        double customerOrderTotal4 = deluxePrice - customerOrderTotal4;
        System.out.println(displayTotalMessage + customerOrderTotal4 + ", " + customer4);
    }
}
