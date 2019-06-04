package com.utn.bike.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.utn.bike.models.Bike;
import com.utn.bike.repositories.BikeRepository;

@RestController
//Esta anotacion publicara automaticamente nuestra clase 
//como un Spring REST Service 

@RequestMapping("api/v1/bikes") // esta es la URL base
public class BikeController {

	@Autowired // inyectamos BikeRepository para poder utilizar los metodos CRUD
	private BikeRepository BK;

	// metodo Get que nos devuelve la lista de bicicletas de nuestra base de datos
	@GetMapping // http://localhost:9090/api/v1/bikes
	public List<Bike> lista() {
//		List<Bike> Bikes = new ArrayList<>();
//		Bike b1 = new Bike();
//		Bike b2 = new Bike();
//		Bike b3 = new Bike();
//b2.setModel("123123123");
//		Bikes.add(b1);
//		Bikes.add(b2);
//		Bikes.add(b3);

		return BK.findAll();

	}
	
	
	

	// url : localhost:8080/api/v1/bikes/agregar
	// metodo para insertar un nueva bike en la base de datos
	@PostMapping("/agregar")
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {

		BK.save(bike);// guardamos la Bike que nos vino por parametro

	}

//	url : localhost:8080/api/v1/bikes/2
	@GetMapping("/{id}")
	public Bike get(@PathVariable("id") long id) {
		// validamos si el id enviado por el PathVariable existe en nuestra tabla
		// si exite lo enviamos al navegador y si no existe retornamos Null
		if (BK.existsById(id)) {

			return BK.getOne(id);
		} else {

			return null;
		}
	}

	// metodo para eliminar una bike mediante su ID de la Base de datos
//	localhost:8080/api/v1/bikes/borrar/2
	@GetMapping("/borrar/{id}")
	public String delete(@PathVariable long id) {
		// primero validamos si existe la Bike en la base y, si es asi la eliminamos
		// y retornamos true , si no existe retornamos False
		if (BK.existsById(id)) {
			BK.deleteById(id);
			return "se elimino el dato de la base ";
		} else {
			return "el dato no existe en la base por lo que no se pudo eliminar";
		}

	}

}
