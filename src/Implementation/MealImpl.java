package Implementation;

import API.MealBuilder;
import API.Meal;

public class MealImpl implements Meal {

    private int numberOfPersons;       // Mandatory
    private String location;           // Optional
    private double budget;              // Optional

    private MealImpl(MealBuilderImpl builder){
        this.numberOfPersons = builder.numberOfPersons;
        this.location = builder.location;
        this.budget = builder.budget;
    }

    public static class MealBuilderImpl implements MealBuilder {
        private int numberOfPersons;       // Mandatory
        private String location = "<none defined>";           // Optional
        private double budget = 0;              // Optional

        public MealBuilderImpl (int numberOfPersons){
            this.numberOfPersons = numberOfPersons;
        }

        public MealBuilder setLocation(String location){
            this.location = location;
            return this;
        }

        public MealBuilder setBudget(double budget){
            this.budget = budget;
            return this;
        }

        public Meal build(){
            return new MealImpl(this);
        }
    }

    @Override
    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public double getBudget() {
        return budget;
    }
}
