# Singleton-in-java
How to use Singleton in java & what is it for?
A singleton class is a class that can have only 1 object(instance)
at a time. after first initialization, every new initialization would be
just a pointer for the first object. 
if we change the new object/pointer, the original object will be changed accordingly.
In this project I used an initializing method with the same name as class.
which means I had to use overloading instead of using the getInstance method, otherwise it was like this:
the getInstance method:
in class Singleton:
public static Singleton getInstance(){
if (single_instance==null)
    single_instance=new Singleton();
return single_instance;
}
in class main:
Singleton x=Singleton.getInstance();
and so on

