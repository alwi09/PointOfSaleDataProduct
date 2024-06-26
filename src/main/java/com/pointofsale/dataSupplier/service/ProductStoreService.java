package com.pointofsale.dataSupplier.service;

import com.pointofsale.dataSupplier.dto.request.NewProductStoreRequest;
import com.pointofsale.dataSupplier.dto.request.SearchProductStoreRequest;
import com.pointofsale.dataSupplier.dto.request.UpdateProductStoreRequest;
import com.pointofsale.dataSupplier.dto.response.ProductStoreResponse;
import com.pointofsale.dataSupplier.entity.ProductStore;

import org.springframework.data.domain.Page;

public interface ProductStoreService {
    ProductStoreResponse createProductStore(NewProductStoreRequest request);
    Page<ProductStoreResponse> getAllProductStore(SearchProductStoreRequest request, Integer page, Integer size);
    ProductStoreResponse getProductStoreById(String id);
    ProductStoreResponse getProductStoreByProductStoreCode(String productStoreCode);
    ProductStoreResponse updateProductStore(UpdateProductStoreRequest request, String id);
    void deleteProductStore(String id);

    ProductStore getByProductCode(String productCode);
    ProductStore updateProductStoreStock(Integer stock, String id);
}
