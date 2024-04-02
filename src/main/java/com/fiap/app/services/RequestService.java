package com.fiap.app.services;

import com.fiap.app.models.Client;
import com.fiap.app.models.Product;
import com.fiap.app.models.Request;
import com.fiap.app.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public List<Request> findAllRequests(){
        return requestRepository.findAll();
    }

    public Optional<Request> findRequestById(Long id){
        return requestRepository.findById(id);
    }

    public Request saveRequest(Request request){
        return requestRepository.save(request);
    }

    public void deleteRequestById(Long id){
        requestRepository.deleteById(id);
    }
}
