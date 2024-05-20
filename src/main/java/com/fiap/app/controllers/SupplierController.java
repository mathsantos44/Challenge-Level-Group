package com.fiap.app.controllers;

import com.fiap.app.models.Supplier;
import com.fiap.app.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSuppliers() {
        return ResponseEntity.ok(supplierService.findAllSuppliers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Supplier> getSupplierById(@PathVariable Long id) {
        Optional<Supplier> supplier = supplierService.findSupplierById(id);
        if (!supplier.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(supplier.get());
    }

    @PostMapping
    public ResponseEntity<Supplier> createSupplier(@RequestBody Supplier supplier) {
        return ResponseEntity.ok(supplierService.saveSupplier(supplier));
    }

    @PostMapping("/suppliers")
    public ResponseEntity<List<Supplier>> createSuppliers(@RequestBody List<Supplier> suppliers) {
        List<Supplier> savedSuppliers = supplierService.saveSuppliers(suppliers);
        return ResponseEntity.ok(savedSuppliers);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Supplier> updateSupplier(@PathVariable Long id, @RequestBody Supplier supplier) {
        if (supplierService.findSupplierById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        supplier.setSupplierId(id);
        return ResponseEntity.ok(supplierService.saveSupplier(supplier));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSupplierById(@PathVariable Long id) {
        if (supplierService.findSupplierById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        supplierService.deleteSupplierById(id);
        return ResponseEntity.noContent().build();
    }
}
