public class Fitbyte {
    // Declare instance variables
    private int age;
    private int restingHeartRate;

    // Create a constructor
    public Fitbyte(int age, int restHR) {
        // Initialize instance variables using constructor parameters
        this.age = age;
        this.restingHeartRate = restHR;
    }

    // Calculate the maximum heart rate using the Karvonen method
    public double maxHeartRate() {
        return 206.3 - (0.711 * this.age); // Formula to calculate maximum heart rate
    }

    // Calculate target heart rate based on a percentage of the maximum heart rate
    public double targetHeartRate(double percentageOfMaximum) {
        // Formula to calculate target heart rate
        return (maxHeartRate() - this.restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }

    public static void main(String[] args) {
        // Create an instance of Fitbyte with specific age and resting heart rate
        Fitbyte assistant = new Fitbyte(30, 60);

        // Initialize the target heart rate percentage
        double percentage = 0.5;

        // Loop through target heart rate percentages and calculate the target heart rates
        while (percentage < 1.0) {
            // Calculate target heart rate for the current percentage
            double target = assistant.targetHeartRate(percentage);

            // Print the calculated target heart rate
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);

            // Increment the percentage by 0.1 for the next iteration
            percentage = percentage + 0.1;
        }
    }
}
