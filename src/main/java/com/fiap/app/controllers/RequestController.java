package com.fiap.app.controllers;

import com.fiap.app.models.Request;
import com.fiap.app.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/request")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @GetMapping
    public ResponseEntity<List<Request>> getAllRequests() {
        return ResponseEntity.ok(requestService.findAllRequests());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Request> getRequestById(@PathVariable Long id) {
        Optional<Request> request = requestService.findRequestById(id);
        if (!request.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(request.get());
    }

    @PostMapping
    public ResponseEntity<Request> createRequest(@RequestBody Request request) {
        return ResponseEntity.ok(requestService.saveRequest(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Request> updateRequest(@PathVariable Long id, @RequestBody Request request) {
        if (requestService.findRequestById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        request.setId(id);
        return ResponseEntity.ok(requestService.saveRequest(request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRequestById(@PathVariable Long id) {
        if (requestService.findRequestById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        requestService.deleteRequestById(id);
        return ResponseEntity.noContent().build();
    }
}
