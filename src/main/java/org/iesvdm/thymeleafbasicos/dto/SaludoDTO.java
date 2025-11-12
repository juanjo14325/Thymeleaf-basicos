package org.iesvdm.thymeleafbasicos.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
    // DTO = Data Transfer Object, subcategoria de beans o POJOs
    //para recibir y enviar datos a la vista (capa view)

public class SaludoDTO {

    private String nombre;
    private String idioma;
}
