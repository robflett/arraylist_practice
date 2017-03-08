class DigitalCamera implements Camera{

  private String type;
  private String make;
  private String model;

public DigitalCamera(String make){
  // this.type = type;
  this.make = make;
  // this.model = model;

}

public String printDetails(){
  return this.make;
}

}