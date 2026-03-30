public class Index {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String name = "Mohan Ramasamy";
        String role = "Web Developer";
        int experience = 4;
        printProfile(name, role, experience);
        int[] scores = {85, 90, 78, 94, 88};
        double avg = calculateAverage(scores);
        System.out.printf("Average score: %.2f%n", avg);
        System.out.println("Bonus eligible: " + isBonusEligible(avg, experience));
        String[] tasks = generateTasks(3);
        System.out.println("Tasks:");
        for (String task : tasks) System.out.println(" - " + task);
    }
    private static void printProfile(String name, String role, int years) {
        System.out.println("Profile: " + name);
        System.out.println("Role: " + role);
        System.out.println("Experience: " + years + " years");
    }
    private static double calculateAverage(int[] values) {
        if (values == null || values.length == 0) return 0;
        int sum = 0;
        for (int v : values) sum += v;
        return (double) sum / values.length;
    }
    private static boolean isBonusEligible(double avg, int years) {
        return avg >= 85 && years >= 3;
    }
    private static String[] generateTasks(int n) {
        String[] tasks = new String[n];
        for (int i = 0; i < n; i++) tasks[i] = "Complete module " + (i + 1);
        return tasks;
    }
}   