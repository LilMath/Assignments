/*
 * The purpose of this class is to model a television
 * Matthew Proctor 2/21/2019
 */
public class Television {
	
	//class variables
	private final String MANUFACTURER; //holds name
	private final int SCREEN_SIZE; //holds screen size
	private boolean powerOn; //holds power state
	private int channel; //holds channel value
	private int volume;	//holds volume value
	
	//initializes television object
	public Television(String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;	
	}
	
	//get methods
	
	/**
	 * 
	 * @return volume
	 */
	public int getVolume() {
		return volume;
	}
	
	/**
	 * 
	 * @return channel
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * 
	 * @return MANUFACTURER
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**
	 * 
	 * @return SCREEN_SIZE
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	
	//mutator methods
	/**
	 * 
	 * @param c
	 */
	
	public void setChannel(int c) {
		channel = c;
	}
	
	public void power() {
		powerOn = !powerOn;
	}
	
	public void increaseVolume() {
		++volume;
	}
	
	public void decreaseVolume() {
		--volume;
	}
}
