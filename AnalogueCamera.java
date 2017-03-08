class AnalogueCamera implements Camera{

  private String type;
  private String make;
  private String model;

  public AnalogueCamera(String make){
    // this.type = type;
    this.make = make;
    // this.model = model;
    
  }

 public String printDetails(){
   // return this.type;
   return this.make;

 }
  
  
}