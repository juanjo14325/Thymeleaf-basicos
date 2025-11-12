package org.iesvdm.thymeleafbasicos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CalculadoraDTO {
    private int nota1, nota2, nota3;

}
