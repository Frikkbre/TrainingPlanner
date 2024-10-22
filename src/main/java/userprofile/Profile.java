/**
 * Class to create user profile for training planner app
 * @author Frikk Brændsrød
 * @since 14.10.2024
 * @version 0.0.1
 */

package userprofile;

public class Profile
{
    /**
     * Created fields required by the program.
     */
    private int height;    //Hvorfor er height int???
    private float weight;
    private String gender;
    private int totalWorkoutPerWeek;

    /**
     * Constructor
     * @param gender
     * @param totalWorkoutPerWeek
     *
     */
    public Profile(String gender, int totalWorkoutPerWeek)
    {
        this.height = -1;
        this.weight = -1;
        setGender(gender);
        setTotalWorkoutPerWeek(totalWorkoutPerWeek);
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        if (height > 0){
            this.height = height;
        }
        else{
            throw new IllegalArgumentException("Height must be postive");
        }

    }

    public float getWeight()
    {
        return weight;
    }

    public void setWeight(float weight)
    {
        if (weight < 0){
            this.weight = weight;
        }
        else{
            throw new IllegalArgumentException("Weight must be postive");
        }
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        if (!gender.isEmpty() || !gender.isBlank()){     //Is !gender legal?   | = option + 7
            this.gender = gender;
        }
       else{
           throw new IllegalArgumentException("Gender must be either Male or Female");
        }

    }

    public int getTotalWorkoutPerWeek()
    {
        return totalWorkoutPerWeek;
    }


    public void setTotalWorkoutPerWeek(int totalWorkoutPerWeek)
    {
        if (totalWorkoutPerWeek > 0){
              this.totalWorkoutPerWeek = totalWorkoutPerWeek;
        }
        else{
            throw new IllegalArgumentException("Total workouts per week must be between 0 and 14");
        }
    }
}
