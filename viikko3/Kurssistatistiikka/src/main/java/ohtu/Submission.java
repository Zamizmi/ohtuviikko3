package ohtu;

public class Submission {

    private int week;
    private int hours;
    private int[] exercises;

    public void setWeek(int week) {
        this.week = week;
    }

    public int[] getExercises() {
        return exercises;
    }

    public int getHours() {
        return hours;
    }

    public void setExercises(int[] exercises) {
        this.exercises = exercises;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getWeek() {
        return week;
    }

    @Override
    public String toString() {
        String done = "";
        for (int i = 0; i < exercises.length; i++) {
            done += exercises[i];
            done += " ";
        }
        return "viikko " + week + ": tehtyjä tehtäviä yhteensä: " + exercises.length + ", aikaa kului " + hours + " tuntia, tehdyt tehtävät: " + done;
    }

}
