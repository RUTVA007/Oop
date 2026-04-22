public class VotingApp {

    // Method to check voting eligibility
    public static void checkEligibility(int age) {
        if (age < 18) {
            // Explicitly throwing exception
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote (Age: " + age + ")");
        }
    }

    public static void main(String[] args) {

        int[] testAges = {16, 18, 21, 15}; // Different test inputs

        for (int age : testAges) {
            try {
                System.out.println("Checking age: " + age);
                checkEligibility(age);
            } 
            catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            } 
            finally {
                System.out.println("Validation process completed\n");
            }
        }
    }
}
