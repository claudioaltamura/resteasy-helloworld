package de.claudioaltamura.resteasy.helloworld;

import java.io.Serializable;

public class HelloWorld implements Serializable
{
   private String name;

   public HelloWorld() {}

   public HelloWorld(String name)
   {
      this.name = name;
   }

   public String getMessage()
   {
	   return name ;
   }

   public void setMessage(String message)
   {
      this.name = name;
   }
}
