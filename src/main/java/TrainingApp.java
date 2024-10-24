import exercise.UserExercise;
import java.util.ArrayList;
import java.util.HashMap;
import userinterfaces.UserInterfaceSATS;
import userprofile.Profile;

public class TrainingApp
{
    public static void main(String[] args)
    {
        //userinterfaces.UserInterfaceSiT uiSIT  = new userinterfaces.UserInterfaceSiT();
        //uiSIT.welcomeAnUser();

        UserInterfaceSATS uiSATS  = new UserInterfaceSATS();
        uiSATS.welcomeAnUser();
        // les input fra bruker og opprett en profil
        Profile profileJohannes = new Profile("male", 4);

        UserExercise userExerciseLeg = new UserExercise("Bein", 3, 10);
        UserExercise userExercisePush = new UserExercise("Push", 3, 10);
        UserExercise userExercisePull = new UserExercise("Pull", 3, 10);
        UserExercise userExercisCardio = new UserExercise("Cardio", 3, 10);

        ArrayList<UserExercise> listOfExercises = new ArrayList<>();
        listOfExercises.add(0, userExerciseLeg);
        listOfExercises.add(1, userExercisePull);
        listOfExercises.add(2, userExercisePush);
        listOfExercises.add(3, userExercisCardio);

        
        HashMap<Profile, ArrayList<UserExercise>> workoutPlanJohannes = new HashMap<>();
        workoutPlanJohannes.put(profileJohannes, listOfExercises);
        /*
        workoutPlanJohannes.put(profileJohannes, userExercisePush);
        workoutPlanJohannes.put(profileJohannes, userExercisePull);
        workoutPlanJohannes.put(profileJohannes, userExercisCardio);
         */



    }
}
