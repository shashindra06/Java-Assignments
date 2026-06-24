
public class Wealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0; // Keep track of the highest sum we find

        // Outer loop: goes through each customer
        for (int i = 0; i < accounts.length; i++) {
            int currentCustomerWealth = 0; // Reset sum to 0 for the new customer

            // Inner loop: goes through each bank account of the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                currentCustomerWealth += accounts[i][j];
            }

            // After counting all bank accounts, check if this customer is the richest
            if (currentCustomerWealth > maxWealth) {
                maxWealth = currentCustomerWealth;
            }
        }

        return maxWealth;
    }
}