import java.util.*;

  public class Photographer{

    private String name;
    private ArrayList<Camera> listofcameras;

  public Photographer(String name){
    this.name = name;
    this.listofcameras = new ArrayList<Camera>();

  }

  public int cameraCount(){
    return listofcameras.size();
  }

  public void addCamera(Camera camera){
    listofcameras.add(camera);
  }

  public void removeCamera(){
    listofcameras.remove(0);
  }

  public String printAllDetails(){
    String details ="";
    for (int i = 0; i < listofcameras.size(); i++){
      details += (listofcameras.get(i).printDetails() );
      System.out.println(details);
      
    }
      return details;
    // for(Camera camera : listofcameras){
    //   return System.out.println(camera);
    // }

  }



  }