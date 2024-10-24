import exercise.UserExercise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import org.jetbrains.annotations.NotNull;
import userinterfaces.UserInterfaceSATS;
import userprofile.Profile;

public class TrainingApp
{
    public static void main(String[] args)
    {
        //userinterfaces.UserInterfaceSiT uiSIT  = new userinterfaces.UserInterfaceSiT();
        //uiSIT.welcomeAnUser();

        TrainingApp trainingApp = new TrainingApp();
        UserInterfaceSATS uiSATS  = new UserInterfaceSATS();
        uiSATS.welcomeAnUser();
        // les input fra bruker og opprett en profil
        Profile profileJohannes = new Profile("male", 4);
        Profile profileBjørn = new Profile("male", 4);
        Profile profileTinius = new Profile("male", 6);
        Profile profileMarit = new Profile("female", 5);
        Profile profileIda = new Profile("female", 7);


        // Version 1
        HashMap<Profile, ArrayList<UserExercise>> workoutPlanMembers = new HashMap<>();
        workoutPlanMembers.put(profileJohannes, trainingApp.getUserExercises());
        workoutPlanMembers.put(profileBjørn, trainingApp.getUserExercises());
        workoutPlanMembers.put(profileTinius, trainingApp.getUserExercises());
        workoutPlanMembers.put(profileMarit, trainingApp.getUserExercises());
        workoutPlanMembers.put(profileIda, trainingApp.getUserExercises());


        HashMap<String, UserExercise> workOutPlanByDay = new HashMap<>();
        HashMap<Profile, HashMap<String, UserExercise>> workoutPlanMembersByDay = new HashMap<>();

        // Version 2
        /*
        Johannes - Mandag - Økt 1
        Johannes - Tirsdag - Økt 2
        Johannes - Onsdag - Økt 3
        Johannes - Torsdag - Økt 4
        Johannes - Fredag - Økt 5
        Johannes - Lørdag - Økt 6
        Johannes - Søndag - Økt 7


        Arpit - Mandag - Økt 1
        Arpit - Tirsdag - Økt 2
        Arpit - Onsdag - Økt 3
        Arpit - Torsdag - Økt 4
        Arpit - Fredag - Økt 5
        Arpit - Lørdag - Økt 6
        Arpit - Søndag - Økt 7
        */


        /*
        workoutPlanJohannes.put(profileJohannes, userExercisePush);
        workoutPlanJohannes.put(profileJohannes, userExercisePull);
        workoutPlanJohannes.put(profileJohannes, userExercisCardio);
         */


    }
    ArrayList<UserExercise> getExerciseFromUser()
    {
        ArrayList<UserExercise> userExercises = new ArrayList<>();
        Scanner inputScanner = new Scanner(System.in);
        // hvor mange dager
        System.out.println("How many days do you want to train?");
        int totalNumberOfDays = inputScanner.nextInt();
        for (int indexOfDays = 0; indexOfDays < totalNumberOfDays; indexOfDays++)
        {
            // hva slags type økt
            System.out.println("What kind of workout do you want to consider?");
            String typeOfWorkout = inputScanner.nextLine();
            // hva slags øvelse
            System.out.println("hva slags øvelse?");
            String typeOfExercise = inputScanner.nextLine();
            // hvor mange set
            System.out.println("How many sets?");
            int totalSets = inputScanner.nextInt();
            // hvor mange reps
            System.out.println("How many reps?");
            int totalReps = inputScanner.nextInt();
            UserExercise userExercise = new UserExercise(typeOfWorkout, typeOfExercise, totalSets, totalReps);
            userExercises.add(userExercise);
        }

        // for resten av uke, blir det hvile dager

        for (int indexOfDaysRest = 0; indexOfDaysRest < 7 - totalNumberOfDays; indexOfDaysRest++)
        {
            UserExercise userRest = new UserExercise("Rest", "Rest", 0, 0);
            userExercises.add(userRest);
        }
        // TODO - Obvious bug - user cannot decide order of rest.
        // Responsible - Nick
        return userExercises;
    }

    private ArrayList<UserExercise> getUserExercises()
    {
        ArrayList<UserExercise> listOfExercises =  getExerciseFromUser();
        return listOfExercises;
    }
}
