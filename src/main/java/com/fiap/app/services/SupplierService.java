package com.fiap.app.services;

import com.fiap.app.models.Supplier;
import com.fiap.app.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> findAllSuppliers() {
        return supplierRepository.findAll();
    }

    public Optional<Supplier> findSupplierById(Long id) {
        return supplierRepository.findById(id);
    }

    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public List<Supplier> saveSuppliers(List<Supplier> suppliers) {
        return supplierRepository.saveAll(suppliers);
    }

    public void deleteSupplierById(Long id) {
        supplierRepository.deleteById(id);
    }
}
