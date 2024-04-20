import java.util.Arrays;

public class Activity_Selection {
    //Also add the code for Sorting the code if the end time is not already sorted
    public static String[] MaxActivity(int[] start, int[] end) {
        int count = 0;
        int[] ActNo = new int[end.length];
        int currAct;
        for (int i = 0; i < end.length; i++) {
            currAct = end[i];
            if (i == end.length - 1 || currAct >= start[i + 1]) {
                count++;
                ActNo[count - 1] = i; // Store the index of the selected activity
            }
        }

        // Create a new array to store the selected activities
        String[] selectedActivities = new String[count];
        for (int i = 0; i < count; i++) {
            selectedActivities[i] = "A" + (ActNo[i]-1);
        }

        return selectedActivities;
    }

    public static void main(String[] arg) {
        int[] start = {2, 5, 9, 12, 17, 20, 25};
        int[] end = {3, 8, 15, 19, 27, 30, 35};

        String[] activityList = MaxActivity(start, end);
        System.out.println("The List of Activities according to the End time that can be performed are: " + Arrays.toString(activityList));
        System.out.println("And the Maximum Number of Activities:  " + activityList.length);
    }
}
