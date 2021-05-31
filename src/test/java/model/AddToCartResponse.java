package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddToCartResponse {

    private String
            message,
            updateflyoutcartsectionhtml,
            updatetopcartsectionhtml;

    private boolean success;

}
