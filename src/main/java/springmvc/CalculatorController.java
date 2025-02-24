package springmvc;

import springmvc.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
	
    @Autowired
    private CalculatorService calcService;

    // This annotation maps to the calculator.jsp view defined
    @RequestMapping("/calculator")
    public String showCalculator() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation, Model model) {
        int result;
        
//        Using the services defined in calculatorService to perform operations
        try {
            switch (operation) {
                case "add":
                    result = calcService.add(num1, num2);
                    break;
                case "subtract":
                    result = calcService.subtract(num1, num2);
                    break;
                case "multiply":
                    result = calcService.multiply(num1, num2);
                    break;
                case "divide":
                    result = calcService.divide(num1, num2);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation");
            }
            model.addAttribute("result", result);
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("operation", operation);
        return "calculator"; // redirects to calculator.jsp page with model attributes
    }
}
