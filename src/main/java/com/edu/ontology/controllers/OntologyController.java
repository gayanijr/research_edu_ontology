package com.edu.ontology.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OntologyController {

	

	@RequestMapping("/viewontology")
	public String showCreate() {
		return "index" ;
	}
/*
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Ontology ontology, ModelMap modelMap) {
		Ontology locationSaved = service.saveLocation(ontology);
		String msg = "Ontology saved with id: " + locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		//emailUtil.sendEmail("springxyzabc@gmail.com", "Ontology Saved",
		//		"Ontology Saved Successfully and about to return a response");
		return "createLocation";
	}

	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Ontology> ontologies = service.getAllLocations();
		modelMap.addAttribute("locations", ontologies);
		return "displayLocations";
	}

	@RequestMapping("deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		// Ontology location = service.getLocationById(id);
		Ontology ontology = new Ontology();
		ontology.setId(id);
		service.deleteLocation(ontology);
		List<Ontology> ontologies = service.getAllLocations();
		modelMap.addAttribute("locations", ontologies);
		return "displayLocations";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Ontology ontology = service.getLocationById(id);
		modelMap.addAttribute("location", ontology);
		return "updateLocation";
	}

	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Ontology ontology, ModelMap modelMap) {
		service.updateLocation(ontology);
		List<Ontology> ontologies = service.getAllLocations();
		modelMap.addAttribute("locations", ontologies);
		return "displayLocations";
	}
	*/



}
