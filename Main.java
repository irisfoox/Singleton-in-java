package SingletonImplementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*a singleton class is a class that can have only 1 object(instance)
		at a time. after first initialization, every new initialization would be
		just a pointer for the first object. 
		if we change the new object/pointer, the original object will be changed accordingly*/
		Singleton x=Singleton.Singleton();
		Singleton y=Singleton.Singleton();
		Singleton z=Singleton.Singleton();
		x.str=x.str.toUpperCase(); // x was changed & they all change
		System.out.println("String from x is "+x.str);
		System.out.println("String from y is "+y.str);
		System.out.println("String from z is "+z.str);
		z.str=z.str.toLowerCase(); // z was changed & they all change
		System.out.println("String from x is "+x.str);
		System.out.println("String from y is "+y.str);
		System.out.println("String from z is "+z.str);
	}

}
