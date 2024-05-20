package com.fiap.app.controllers;

import com.fiap.app.models.Client;
import com.fiap.app.models.Product;
import com.fiap.app.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;
    /*
    @GetMapping
    public String menu(Model model){
        model.addAttribute("client",clientService.findAllClients());
        return "sign_up";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("client", new Client());
        return "sign_up";
    }

    @PostMapping
    public String saveClient(@ModelAttribute Client client) {
        clientService.saveClient(client);
        return "redirect:client";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Client client = clientService.findClientById(id).orElseThrow(() -> new IllegalArgumentException("Usuário não encotrado Id: " + id));
        model.addAttribute("client", client);
        return "sign_up";
    }

    @GetMapping("/update/{id}")
    public String updateClient(@PathVariable Long id, @ModelAttribute Client client) {
        clientService.saveClient(client);
        return "sign_up";
    }

    @GetMapping("/delete/{id}")
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteClientById(id);
        return "redirect:/client";
    }
    */

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients(){
        return ResponseEntity.ok(clientService.findAllClients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id){
        Optional<Client> product = clientService.findClientById(id);
        if (!product.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product.get());
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client){
        return ResponseEntity.ok(clientService.saveClient(client));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id,@RequestBody Client client){
        if(clientService.findClientById(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        client.setClientId(id);
        return ResponseEntity.ok(clientService.saveClient(client));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClientById(@PathVariable Long id){
        if(clientService.findClientById(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        clientService.deleteClientById(id);
        return ResponseEntity.noContent().build();
    }


}
