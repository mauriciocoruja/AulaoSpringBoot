package com.mauriciocoruja.SpringProject.repositories;

import com.mauriciocoruja.SpringProject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
