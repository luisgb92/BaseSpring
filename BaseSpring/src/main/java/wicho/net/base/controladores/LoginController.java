package wicho.net.base.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import wicho.net.base.modelos.Cuenta;

@Controller
public class LoginController {
		
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String inicio(Model modelo) {
		modelo.addAttribute("cuenta", new Cuenta());
		return "login";
	}	
	
	@ResponseBody
	@RequestMapping(value="/validarCuenta", method = RequestMethod.POST)
	public boolean validarCuenta(@RequestBody Cuenta cuenta) {
		return false;
	}
}
