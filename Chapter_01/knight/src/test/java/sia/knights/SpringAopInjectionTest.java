package sia.knights;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.PrintStream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringAopConfig.class, KnightConfig.class})
public class SpringAopInjectionTest {

  @Autowired
  Knight knight;

  @Autowired
  PrintStream printStream;



  @Test
  public void aopMinstrel(){
      knight.embarkOnQuest();
  }

  @Test
  public void print(){
    printStream.println("hahah wos shi ");
  }

}
