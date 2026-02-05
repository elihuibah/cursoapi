package com.cursoapi.cursoapi.repositorio;
import com.cursoapi.cursoapi.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteRepositorio {
    private final List<Estudiante> estudiantes = new ArrayList<>(
            List.of(
                    new Estudiante("Máximo","García","13209",19),
                    new Estudiante("Manuel","Riveros","14444",20),
                    new Estudiante("Mariana","Flores","14489",19)
                    )
    );

    public List<Estudiante> buscarTodos() {
        return estudiantes;
    }



}
