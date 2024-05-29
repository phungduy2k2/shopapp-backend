package com.example.shoppappspring.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateCategoryRespopnse {
    @JsonProperty("message")
    private String message;
}
