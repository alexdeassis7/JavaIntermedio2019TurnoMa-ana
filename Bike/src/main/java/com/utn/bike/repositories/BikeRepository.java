package com.utn.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utn.bike.models.Bike;

//esta clase de tipo Repositorio 
//nos permite gestionar las operaciones CRUD de nuestra base de datos

//Se puede observar que el interface Repositorio Para
//almacenar los objetos Bike extiende de JPArepository
//Eeta es una clase que pertenece a SpringData.
//
//la mera declaracion del inteface ha sido suficiente
//para poder salvar informacion
//Al utilizar Spring Data la mayor parte del codigo
//que tendriamos que implementar es aportada por el
//propio framework 

public interface BikeRepository extends JpaRepository<Bike, Long> {

//	extends JpaRepository<Bike , Long>
}
