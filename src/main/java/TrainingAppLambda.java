import exercise.UserExercise;
import java.util.ArrayList;
import java.util.Iterator;

public class TrainingAppLambda
{

    public static void main(String[] args)
    {
        TrainingAppLambda appInstance = new TrainingAppLambda();

        UserExercise userExercise1 = new UserExercise("Bein", "Bein", 1, 2);
        UserExercise userExercise2 = new UserExercise("Pushups", "PushupsLegs", 1, 2);
        UserExercise userExercise3 = new UserExercise("Cardio", "Running", 1, 2);
        UserExercise userExercise4 = new UserExercise("Rest", "Rest", 0, 0);
        ArrayList<UserExercise> exercises = new ArrayList<>();
        exercises.add(userExercise1);
        exercises.add(userExercise2);
        exercises.add(userExercise3);
        exercises.add(userExercise4);

        ArrayList<UserExercise> manyExercises = new ArrayList<>();
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);
        manyExercises.addAll(exercises);





        Iterator<UserExercise> it = exercises.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getNameOfExercise());
        }

        for (UserExercise exercise : exercises) {
            System.out.println(exercise.getNameOfExercise()); // 2 sec
        }

        exercises.forEach(exercise -> System.out.println(exercise.getNameOfExercise()));
        exercises.forEach(System.out::println);


        ArrayList<UserExercise> manyExercisesWithoutCardio  = new ArrayList<>();
        exercises.forEach(exercise ->
        {
            if(!exercise.getNameOfExercise().equals("Cardio"))
            {
                System.out.println(exercise.getNameOfExercise());
                manyExercisesWithoutCardio.add(exercise);
            }
        });


    }
}