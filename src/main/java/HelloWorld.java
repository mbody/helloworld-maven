import java.util.ResourceBundle;

import org.apache.commons.lang.StringUtils;

public class HelloWorld {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("project");
		String version = rb.getString("project.version");
		String message = "HelloWorld " + version + " :\n";
		//List<String> myList = new ArrayList<>();
		if (args.length > 0 && StringUtils.isNotEmpty(args[0])) {
			message += "Hello " + args[0] + "!";
		} else {
			message += "USAGE : mvn compile exec:java -Dexec.mainClass=HelloWorld  -Dexec.args=\"Homer Simpson\"";
		}
		System.out.println(message);
	}
}
