package userprofile;

import exercise.UserExercise;

public class Profile
{
    private int height;
    private float weight;
    private String gender;
    private int totalWorkoutPerWeek;

    public Profile(String gender, int totalWorkoutPerWeek)
    {
        this.height = 0;
        this.weight = 0;
        setGender(gender);
        setTotalWorkoutPerWeek(totalWorkoutPerWeek);
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        if (height < 0)
        {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.height = height;
    }

    public float getWeight()
    {
        return weight;
    }

    public void setWeight(float weight)
    {
        if (weight < 0)
        {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.weight = weight;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        if (gender == null || gender.isEmpty() || gender.isBlank())
        {
            throw new IllegalArgumentException("Gender cannot be null, empty or blank.");
        }
        this.gender = gender;
    }

    public int getTotalWorkoutPerWeek()
    {
        return totalWorkoutPerWeek;
    }

    public void setTotalWorkoutPerWeek(int totalWorkoutPerWeek)
    {
        if (totalWorkoutPerWeek < 0)
        {
            throw new IllegalArgumentException("Total work out per week cannot be negative");
        }
        this.totalWorkoutPerWeek = totalWorkoutPerWeek;
    }
}
