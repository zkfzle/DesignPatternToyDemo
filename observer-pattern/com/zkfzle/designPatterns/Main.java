package com.zkfzle.designPatterns;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Implent one");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1,2,3);
        weatherData.setMeasurements(2,3,4);
        System.out.println("Implent two");
        WeatherDataUsingJDKimplents weatherDataTwo = new WeatherDataUsingJDKimplents();
        CurrentConditionDisplayUsingJDKImplement currentConditionDisplayUsingJDKImplement = new CurrentConditionDisplayUsingJDKImplement(weatherDataTwo);
        weatherDataTwo.setMeasurements(1,3,5);
        weatherDataTwo.setMeasurements(2,4,6);

    }
}
