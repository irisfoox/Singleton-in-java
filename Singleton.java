package SingletonImplementation;

public class Singleton {
    //initializing method with the same name as class
	private static Singleton single_instance=null;
	public String str;
	private Singleton() {
		str="Hello I'm Iris Foox & I wrote this nonsense";
	}
	public static Singleton Singleton() {   //overloading instead of using getInstance method-see readme 
		if(single_instance==null) {
			single_instance=new Singleton();//single_inst is STATIC & as such can be changed to other value than the original
		}
		return single_instance;             //in the if statement the object's being initialized once & all the others are just pointers to the same one object
	}
}
