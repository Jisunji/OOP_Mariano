class BloodData {
    private String bloodType;
    private String rhFactor;
    
    public BloodData(){
        this.bloodType = "O";
        this.rhFactor = "+";
    }
    
    public void setBloodType(String newBloodType){
    	this.bloodType = newBloodType;
    }
    
    public String getBloodType(){
    	return bloodType;
    }
    
    public void setRhFactor(String newRhFactor){
    	this.rhFactor = newRhFactor;
    }
    
    public String getRhFactor(){
    	return rhFactor;
    }
    
    public void display(){
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");

    }
    
}