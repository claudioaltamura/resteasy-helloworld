
package de.claudioaltamura.resteasy.helloworld;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class HelloWorldApplication extends Application
{
   private Set<Object> singletons = new HashSet<Object>();
   private Set<Class<?>> empty = new HashSet<Class<?>>();

   public HelloWorldApplication()
   {
      singletons.add(new HelloWorldResource());
   }

   @Override
   public Set<Class<?>> getClasses()
   {
      return empty;
   }

   @Override
   public Set<Object> getSingletons()
   {
      return singletons;
   }

}
