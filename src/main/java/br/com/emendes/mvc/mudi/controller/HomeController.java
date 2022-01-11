package br.com.emendes.mvc.mudi.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.emendes.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 8");
		pedido.setUrlImage("https://http2.mlstatic.com/D_NQ_NP_785908-MLA44528370864_012021-O.webp");
		pedido.setUrlProduto("https://www.mercadolivre.com.br/xiaomi-redmi-note-8-dual-sim-64-gb-neptune-blue-4-gb-ram/p/MLB15188554");
		pedido.setDescricao("Descrição qualquer para esse pedido.");
		pedido.setValorNegociado(new BigDecimal("1587.20"));
		pedido.setDataDaEntrega(LocalDate.now());
		
		List<Pedido> pedidos = Arrays.asList(pedido, pedido, pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
