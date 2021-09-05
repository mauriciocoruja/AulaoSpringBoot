package com.mauriciocoruja.SpringProject.repositories;

import com.mauriciocoruja.SpringProject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
