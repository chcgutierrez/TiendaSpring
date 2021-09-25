package com.tienda.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.app.dao.TipoDocDao;
import com.tienda.app.model.TipoDocuModelo;

@RestController
@RequestMapping("api/tienda/tipodoc")
public class TipoDocController {

	//http://localhost:8080/api/tienda/tipodoc/traertipodoc/CC
	
	@Autowired
	private TipoDocDao objDao;

	@GetMapping("/traertipodoc/{tipodoc}")
	public List<TipoDocuModelo> TraerTipoDoc(@PathVariable String tipodoc) {
		
		return objDao.TraerTipoDoc(tipodoc);
		
	}

}
