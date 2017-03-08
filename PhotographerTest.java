import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  Camera camera;
  DigitalCamera digitalcamera;
  AnalogueCamera analoguecamera;

@Before
public void before(){
  photographer = new Photographer("Parker");
  digitalcamera = new DigitalCamera("Canon");
  analoguecamera = new AnalogueCamera("Nikon");

}

@Test
public void cameraListStartsEmpty(){
  assertEquals(0, photographer.cameraCount() );
}

@Test
public void canAddCameras(){
  photographer.addCamera(camera);
  assertEquals(1, photographer.cameraCount() );
}

@Test
public void canRemoveCameras(){
  photographer.addCamera(camera);

  photographer.removeCamera();
  assertEquals(0, photographer.cameraCount() );
}

@Test
public void canPrintDetailsDigital(){
  assertEquals("Canon", digitalcamera.printDetails() );
}

@Test
public void canPrintDetailsAnalogue(){
  assertEquals("Nikon", analoguecamera.printDetails() );
}


@Test
public void canPrintAllDetails(){
  photographer.addCamera(digitalcamera);
  photographer.addCamera(analoguecamera);

  // photographer.printAllDetails(digitalcamera.printDetails(), analoguecamera.printDetails() );
  

  assertEquals("Canon" + "Nikon", photographer.printAllDetails() );
}

}