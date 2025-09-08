package com.company.systemappbackend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDTO {

    private Integer id;

    @NotNull
    @Size(min=2, max=10)
    private String number;

    @NotNull
    @Size(min=3, max=50)
    private String type;

    @NotNull
    @Min(0)
    @Max(99999)
    private Double price;

    @NotNull
    private Boolean available;
}
