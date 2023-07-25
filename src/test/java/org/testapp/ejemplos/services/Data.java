package org.testapp.ejemplos.services;

import org.testapp.ejemplos.models.Examen;

import java.util.Arrays;
import java.util.List;

public class Data {
    public static  final List<Examen> EXAMS = Arrays.asList(new Examen(1L,"Primera"),
            new Examen(2L,"Segunda"),
            new Examen(3L,"Tercera"),
            new Examen(4L,"Cuarta")
    );

    public static final List<String> PREGUNTAS = Arrays.asList("primera","segunda","tercera","cuarta");
}
