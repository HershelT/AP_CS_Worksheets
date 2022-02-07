public class WeeklyWeatherInfo{
    public static void main(String[] args) {
        System.out.println(toStr());
    }

    public static double average = 0;
    public static double[] dailyHighTemps = new double[]{86.7, 88, 80, 89.3, 82.4, 83.5};

    public  static double getAverageHighTemp() {
        for (int i = 0; i < dailyHighTemps.length; i++) {
            average += dailyHighTemps[i];
        }
        return average / dailyHighTemps.length;
    }
    public static String toStr() {
        String[] days = {"Monday: ", "Tuesday: ", "wednesday: ", "Thursday: ", "Friday: ", "Saturday: ", "Sunday: "};
        String output = "";
        for (int i = 0; i < 6; i++) {
            output += days[i] + dailyHighTemps[i] + "\n";
        }
        output += "Average High Temperature: " + getAverageHighTemp();
        return output;
    }
}









