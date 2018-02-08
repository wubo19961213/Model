package ObserverPattern.Test;

import ObserverPattern.Dao.CurrentConditionsDisplay;
import ObserverPattern.Dao.WeatherData;

public class WeaterStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80,65,30.4f);
	}

}
