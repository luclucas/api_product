package com.lulu.projeto_dois.repositories;

import com.lulu.projeto_dois.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {


}
