package com.project.app.provider;

import com.project.app.entity.Client;
import com.project.app.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClientProvider {
    @Autowired
    private ClientRepository clientRepository;

    public void add(Client client){
        client.setEnrollmentDate(LocalDate.now());
        clientRepository.save(client);
    }

    public void addAll(List<Client> clients){

        clientRepository.saveAll(clients);
    }

}
