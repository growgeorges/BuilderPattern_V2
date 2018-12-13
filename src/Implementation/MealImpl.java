package Implementation;

import API.Meal;

public class MealImpl implements Meal {

    private int numberOfPersons;       // Mandatory
    private String location;           // Optional
    private double budget;              // Optional

    private MealImpl(MeatBuilder builder){
        this.numberOfPersons = builder.numberOfPersons;
        this.location = builder.location;
        this.budget = builder.budget;
    }

    public static class MeatBuilder{
        private int numberOfPersons;       // Mandatory
        private String location = "<none defined>";           // Optional
        private double budget = 0;              // Optional

        public MeatBuilder (int numberOfPersons){
            this.numberOfPersons = numberOfPersons;
        }

        public MeatBuilder setLocation(String location){
            this.location = location;
            return this;
        }

        public MeatBuilder setBudget(double budget){
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
