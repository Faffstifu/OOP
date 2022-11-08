import java.util.Random;

public class Weather {
    
	//data
    public float temperature;
    public float wind;
    public float humidity;
    public float precipitation;
    
	//operation 
    public void generate() {
        Random rand = new Random();
        
    	temperature = rand.nextFloat() * (45 - 20) + 20; 
    	wind = rand.nextFloat() * (50 - 0) + 50; 
    	humidity = rand.nextFloat() * (50 - 0) + 0; 
    	precipitation = rand.nextFloat() * (100 - 0) + 0; 
	
    }
	public void display() {
		System.out.println("Temperature: " + temperature);
		System.out.println("Wind: " + wind);
		System.out.println("Humidity: " + humidity);
		System.out.println("Precipitation: " + precipitation);
		
	}
	
	public float getTemperature(){
		return temperature;
		
	}
	public float getWind(){
		return wind;
		
	}
	public float getHumidity(){
		return humidity;
		
	}
	public float getPrecipitation(){
		return precipitation;
		
	}
	
	public void getTemperature(float temperature){
		if (temperature > 45) { 
        System.out.print("Error"); 
        return;
		}
        
		this.temperature = temperature;
		
	}
	public void getWind(float wind){
		if (wind > 50) { 
        System.out.print("Error"); 
        return;
		}
		this.wind = wind ;
		
	}
	public void getHumidity(float humidity){
		if (humidity > 50) { 
        System.out.print("Error"); 
        return;
		}
		this.humidity = humidity;
		
	}
	public void getPrecipitation(float precipitation){
		if (precipitation > 100) { 
        System.out.print("Error"); 
        return;
		}
		this.precipitation = precipitation;
		
	}
} 

