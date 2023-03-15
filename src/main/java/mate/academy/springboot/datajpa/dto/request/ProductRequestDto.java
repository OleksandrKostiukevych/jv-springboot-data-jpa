package mate.academy.springboot.datajpa.dto.request;

import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductRequestDto {
    @NotNull
    private String title;
    @NotNull
    private BigDecimal price;
    private Long categoryId;
}