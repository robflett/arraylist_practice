import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;


@Before
public void before(){
  photographer = new Photographer("Parker");
}

@Test
public void cameraListStartsEmpty(){
  assertEquals(0, photographer.cameraCount() );
}


}