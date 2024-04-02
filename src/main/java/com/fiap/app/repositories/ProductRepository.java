package com.fiap.app.repositories;

import com.fiap.app.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query(value="SELECT e FROM Product e WHERE e.productPrice>= :price and e.productName= :name",nativeQuery = false)
    List<Product> findByPrice(@Param("price") double price,@Param("name") String name);

    @Query(value="SELECT e FROM Product e WHERE e.productName= :name",nativeQuery = false)
    List<Product> findByName(@Param("name") String name);

    @Query(value="SELECT e FROM Product e WHERE e.productName= :name AND e.productPrice<=:price and e.productQuantity>=:quantity")
    List<Product> findByFeatures(@Param("name") String name,@Param("price") double price,@Param("quantity") int quantity);


}
