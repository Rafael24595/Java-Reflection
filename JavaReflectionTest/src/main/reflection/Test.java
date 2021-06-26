package main.reflection;

public class Test {
	
	public static void instanceObjectByString(String className, String... args) {
		
		try {
			Class<?> clazz = Class.forName(className);
			Object instance = clazz.getConstructors()[0].newInstance(args);
			
			StringBuilder sbuilder = new StringBuilder();
			sbuilder.append("[");
			sbuilder.append(clazz.getMethod("getId", null).invoke(instance, null));
			sbuilder.append("] - ");
			sbuilder.append(clazz.getMethod("getLeader", null).invoke(instance, null));
			sbuilder.append(" from ");
			sbuilder.append(clazz.getMethod("getName", null).invoke(instance, null));
			sbuilder.append(" says: ");
			sbuilder.append(clazz.getMethod("getWarcry", null).invoke(instance, null));
			sbuilder.append(".");
			
			System.out.println(sbuilder);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
