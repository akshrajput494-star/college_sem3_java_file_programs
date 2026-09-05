// Grade classifier — build a nested if / switch-based grading system comparing both approaches side by side

public class problem_08 {
    public static void main(String[] args) {
        int score = 85;
        char gradeIf, gradeSwitch;

        // Nested IF approach
        if (score >= 90) gradeIf = 'A';
        else if (score >= 80) gradeIf = 'B';
        else if (score >= 70) gradeIf = 'C';
        else gradeIf = 'F';

        // Switch approach
        switch (score / 10) {
            case 10:
            case 9: gradeSwitch = 'A'; break;
            case 8: gradeSwitch = 'B'; break;
            case 7: gradeSwitch = 'C'; break;
            default: gradeSwitch = 'F'; break;
        }
        System.out.println("If Grade: " + gradeIf + " | Switch Grade: " + gradeSwitch);
    }
}

