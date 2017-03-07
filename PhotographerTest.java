import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  Camera camera;

@Before
public void before(){
  photographer = new Photographer("Parker");

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

}