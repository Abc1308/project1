package shubham_project_in_spring;

@Controller
@EnableAutoConfiguration

public class SampleController {
	
	@RequestMapping
	@ResponseBody
	String home() {
	return "Hello World !";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		SpringApplication.run(SampleController.class, args);
	}
	}

}
