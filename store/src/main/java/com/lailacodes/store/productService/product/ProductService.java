package com.lailacodes.store.productService.product;

import com.lailacodes.store.productService.sales.Sale;
import com.lailacodes.store.productService.sales.SaleItem;
import com.lailacodes.store.productService.sales.SaleRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class ProductService {

    private final SaleRepository saleRepository;

    public ProductService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<ProductView> getAllProducts() {

        Map<String, ProductAccumulator> accumulatorMap = new HashMap<>();

        for (Sale sale : saleRepository.findAll()) {
            for (SaleItem item : sale.getItems()) {

                accumulatorMap.compute(item.getName(), (name, acc) -> {
                    if (acc == null) {
                        return new ProductAccumulator(
                                item.getName(),
                                item.getTags(),
                                item.getPrice(),
                                item.getQuantity()
                        );
                    }
                    acc.addQuantity(item.getQuantity());
                    return acc;
                });
            }
        }

        return accumulatorMap.values().stream()
                .map(ProductAccumulator::toProductView)
                .toList();
    }

    public Optional<ProductView> getProductByName(String name) {
        return getAllProducts().stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    /* helper */
    private static class ProductAccumulator {
        private final String name;
        private final List<String> tags;
        private final BigDecimal price;
        private int quantity;

        ProductAccumulator(String name, List<String> tags, BigDecimal price, int quantity) {
            this.name = name;
            this.tags = tags;
            this.price = price;
            this.quantity = quantity;
        }

        void addQuantity(int q) {
            this.quantity += q;
        }

        ProductView toProductView() {
            return new ProductView(name, tags, price, quantity);
        }
    }
}
