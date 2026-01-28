package com.example.Clase3_Devops.Repositorio;

import com.example.Clase3_Devops.Model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public class TareaRepository extends JpaRepository <Tarea, Long> {
}
