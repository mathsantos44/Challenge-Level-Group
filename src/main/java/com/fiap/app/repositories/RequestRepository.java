package com.fiap.app.repositories;

import com.fiap.app.models.Product;
import com.fiap.app.models.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request,Long> {


}
