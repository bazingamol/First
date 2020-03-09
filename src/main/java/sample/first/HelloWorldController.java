
package sample.first;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author manoj.bardhan
 *
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {
@RequestMapping("/hello")
@ResponseBody
public String sayHello() {
return "Hello World Developer!!!";
}
@RequestMapping("/hi")
@ResponseBody
public String sayHi() {
	
	return "Hello world Devops";
}
}