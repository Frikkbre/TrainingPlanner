package exercise;

import org.jetbrains.annotations.NotNull;

public class UserExercise
{
    

    private String typeOfWorkout;
    private String nameOfExercise;
    private int totalSets;
    private int totalRepetitions;


    public UserExercise()
    {

    }

    public UserExercise(String typeOfWorkout, String nameOfExercise, int totalSets, int totalRepetitions)
    {

        /*
        this.nameOfExercise = nameOfExercise;
        this.totalSets = totalSets;
        this.totalRepetitions = totalRepetitions;
         */
        setTypeOfWorkout(typeOfWorkout);
        setNameOfExercise(nameOfExercise);
        setTotalSets(totalSets);
        setTotalRepetitions(totalRepetitions);
    }

    public String getTypeOfWorkout()
    {
        return typeOfWorkout;
    }

    public void setTypeOfWorkout(String typeOfWorkout)
    {
        this.typeOfWorkout = typeOfWorkout;
    }

    public String getNameOfExercise()
    {
        return nameOfExercise;
    }

    public void setNameOfExercise(@NotNull String nameOfExercise)
    {
        // Her skal vi sjekke navnet opp mot bestemet øvelser
        // bla igjennom liste og sjekke
        if(nameOfExercise.isEmpty())
        {
            throw new IllegalArgumentException("Invalid name of exercise");
        }
        this.nameOfExercise = nameOfExercise;

    }

    public int getTotalSets()
    {
        return totalSets;
    }

    public void setTotalSets(int totalSets)
    {
        this.totalSets = totalSets;
    }

    public int getTotalRepetitions()
    {
        return totalRepetitions;
    }

    public void setTotalRepetitions(int totalRepetitions)
    {
        this.totalRepetitions = totalRepetitions;
    }
}
