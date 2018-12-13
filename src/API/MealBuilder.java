package API;

public interface MealBuilder {
    MealBuilder setLocation(String location);
    MealBuilder setBudget(double budget);
    Meal build();
}
