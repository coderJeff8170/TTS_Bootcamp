package classes;

public class StringedInstrument {
	
	private int numStrings;
	private String material;
	private boolean isElectric;
	private int volume;
	
	//no args constructor
	public StringedInstrument() {
		
	}
	//two args constructor
	public StringedInstrument(int numStrings, String material ) {
		this.numStrings = numStrings;
		this.material = material;
	}
	//all args constructor
	public StringedInstrument(int numStrings, String material, boolean isElectric, int volume ) {
		
		this.numStrings = numStrings;
		this.material = material;
		this.isElectric = isElectric;
		this.volume = volume;
	}
	
	//getters
	public int getStrings() {
		return this.numStrings;
	}
	public String getMaterial() {
		return this.material;
	}
	public int getisElectric() {
		return this.numStrings;
	}
	public int getVolume() {
		return this.volume;
	}
	
	//setters
	public void setStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void setisElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
    //methods 1 boolean 1 string
	public boolean isLoud() {
		if (this.isElectric = true && volume > 10) {
			return true;
		}else {
			return false;
		}
	}
	
	public String play() {
		if(this.isElectric = true) {
			return "far out, man!";
		}else {
			return "Sweet, sweet music!";
		}
	}
}
