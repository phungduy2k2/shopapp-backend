package com.example.shoppappspring.responses;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductListResponse {
    private List<ProductResponse> products;
    private int totalPages;
}
