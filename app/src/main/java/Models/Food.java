package Models;

import java.util.Date;

public class Food {
    public String name;
    public Date date;
    public String URI;
    public String measure;
    public double calories;
    public double fat;
    public double saturated_fat;
    public double trans_fat;
    public double monounsaturated_fat;
    public double polyunsaturated_fat;
    public double carbs;
    public double fiber;
    public double sugars;
    public double added_sugars;
    public double protein;
    public double cholesterol;
    public double sodium;
    public double calcium;
    public double magnesium;
    public double potassium;
    public double iron;
    public double zinc;
    public double phosphorus;
    public double vitamin_A;
    public double vitamin_C;
    public double thiamin;
    public double riboflavin;
    public double niacin;
    public double vitamin_B6;
    public double folate_equivalent;
    public double folate;
    public double folic_acid;
    public double vitamin_B12;
    public double vitamin_D;
    public double vitamin_E;
    public double vitamin_K;

    public Food(){
        this.name = "";
        this.URI = "";
        this.measure = "";
        this.calories = 0;
        this.fat = 0;
        this.saturated_fat = 0;
        this.trans_fat = 0;
        this.monounsaturated_fat = 0;
        this.polyunsaturated_fat = 0;
        this.carbs = 0;
        this.fiber = 0;
        this.sugars = 0;
        this.added_sugars = 0;
        this.protein = 0;
        this.cholesterol = 0;
        this.sodium = 0;
        this.calcium = 0;
        this.magnesium = 0;
        this.potassium = 0;
        this.iron = 0;
        this.zinc = 0;
        this.phosphorus = 0;
        this.vitamin_A = 0;
        this.vitamin_C = 0;
        this.thiamin = 0;
        this.riboflavin = 0;
        this.niacin = 0;
        this.vitamin_B6 = 0;
        this.folate_equivalent = 0;
        this.folate = 0;
        this.folic_acid = 0;
        this.vitamin_B12 = 0;
        this.vitamin_D = 0;
        this.vitamin_E = 0;
        this.vitamin_K = 0;
    }

    public Food( String name, Date date, String URI, String measure, double calories, double fat, double saturated_fat, double trans_fat, double monounsaturated_fat, double polyunsaturated_fat, double carbs, double fiber, double sugars, double added_sugars, double protein, double cholesterol, double sodium, double calcium, double magnesium, double potassium, double iron, double zinc, double phosphorus, double vitamin_A, double vitamin_C, double thiamin, double riboflavin, double niacin, double vitamin_B6, double folate_equivalent, double folate, double folic_acid, double vitamin_B12, double vitamin_D, double vitamin_E, double vitamin_K){
        this.name = name;
        this.date = date;
        this.URI = URI;
        this.measure = measure;
        this.calories = calories;
        this.fat = fat;
        this.saturated_fat = saturated_fat;
        this.trans_fat = trans_fat;
        this.monounsaturated_fat = monounsaturated_fat;
        this.polyunsaturated_fat = polyunsaturated_fat;
        this.carbs = carbs;
        this.fiber = fiber;
        this.sugars = sugars;
        this.added_sugars = added_sugars;
        this.protein = protein;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.calcium = calcium;
        this.magnesium = magnesium;
        this.potassium = potassium;
        this.iron = iron;
        this.zinc = zinc;
        this.phosphorus = phosphorus;
        this.vitamin_A = vitamin_A;
        this.vitamin_C = vitamin_C;
        this.thiamin = thiamin;
        this.riboflavin = riboflavin;
        this.niacin = niacin;
        this.vitamin_B6 = vitamin_B6;
        this.folate_equivalent = folate_equivalent;
        this.folate = folate;
        this.folic_acid = folic_acid;
        this.vitamin_B12 = vitamin_B12;
        this.vitamin_D = vitamin_D;
        this.vitamin_E = vitamin_E;
        this.vitamin_K = vitamin_K;

    }
}
