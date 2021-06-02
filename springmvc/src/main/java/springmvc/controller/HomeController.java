package springmvc.controller;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home Page is here!!");
		model.addAttribute("name","Vicks");
		model.addAttribute("id", "1001");
		
		List<String> dost = new ArrayList<String>();
		dost.add("Vikas");
		dost.add("Sayan");
		model.addAttribute("fr", "dost");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("console m ABOUT!!");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("Help page !!");
		//Creating the object of model and view
		ModelAndView modelandview = new ModelAndView();
		//setting the data
		modelandview.addObject("name", "Sunny");
		
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("QWE");
		modelandview.addObject("li", "list");
		
		// implementing data in help page
		modelandview.setViewName("help");
		return modelandview;
	}
	

}