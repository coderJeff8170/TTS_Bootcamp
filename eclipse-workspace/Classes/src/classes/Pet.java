package classes;

public class Pet {
	//instance variables
    private String name;
    private int age;
    private String location;
    private String type;
    private boolean isLiving;
    
    //constructor no params
//    public Pet() {
//        this.name = "Muggles";
//        this.age = 100;
//        this.location = "Behind you";
//        this.type = "unknown";
//    }
    public Pet() {
    	
    }
    
    //constructor all params
    public Pet(String name, int age, String location, String type) {
    	
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    //getters name, age type
    public String getName() {
    	return this.name;
    }
    
    public int getAge() {
    	return this.age;
    }
    
    public String getType() {
    	return this.type;
    }
    
    //setters name, age location
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public void setLocation (String location) {
    	this.location = location;
    }

    
    


}
