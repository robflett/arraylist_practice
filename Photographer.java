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

  }