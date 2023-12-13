package com.example.rent2gojavaproject.services.dtos.requests.brandRequest;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {
    @NotNull(message = "The brand id cannot be null.")
    @Positive(message = "Id must be a positive number.")
    private int id;
    @NotNull(message = "The brand name cannot be null.")
    @NotBlank(message = "The brand name can't be empty.")
    @Size(min = 3, max = 15, message = "Brand name should be between 3 and 15 digits.")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "The brand name should only contain letters.")
    private String name;
}
