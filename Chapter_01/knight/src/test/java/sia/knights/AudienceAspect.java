package sia.knights;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author yuanxipei
 * @date 2020/6/23 10:04
 */
@Aspect
public class AudienceAspect {

  /*  @Pointcut("execution(* sia.knights.Quest.embark(..))")
    public void executeMethod(){};

    @Before("executeMethod()")
    public void say(){
        System.out.println("saying");
    }


    @AfterReturning("executeMethod()")
    public void notSay(){
        System.out.println("not say");
    }*/


    @Pointcut("execution(* java.io.PrintStream.println(String)) && args(stream)")
    public void print(String stream){};

    @Before("print(stream)")
    public void stream(String stream){
        System.out.println("loging loging " + stream);;
    }

}
