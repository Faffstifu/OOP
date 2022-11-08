public class Main{
    public static void main (String args[]){
        
        WeatherList weather = new WeatherList();

		System.out.println("Create WeatherList object : " + weather);
        
        weather.readWeather();
        weather.calcWeather();
        weather.display();
		
    }
}