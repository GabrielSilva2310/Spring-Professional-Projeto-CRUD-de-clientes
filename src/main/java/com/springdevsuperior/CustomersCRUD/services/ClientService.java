package com.springdevsuperior.CustomersCRUD.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springdevsuperior.CustomersCRUD.dto.ClientDTO;
import com.springdevsuperior.CustomersCRUD.entities.Client;
import com.springdevsuperior.CustomersCRUD.repositories.ClientRepository;


@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAll(Pageable pageable){
		Page<Client> result=repository.findAll(pageable);
		return result.map(x-> new ClientDTO(x));
		
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Client client=repository.findById(id).get();
		return new ClientDTO(client);		
	}
	
	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client client=new Client();
		CopyDTOtoClient(dto,client);
		client=repository.save(client);
		return new ClientDTO(client);
	
	}
	
	@Transactional
	public ClientDTO update(Long id, ClientDTO dto) {
		Client updateClient=repository.getReferenceById(id);
		CopyDTOtoClient(dto, updateClient);
		updateClient=repository.save(updateClient);
		return new ClientDTO(updateClient);
		
	}
	
	@Transactional
	public void delete(Long id) {
		repository.deleteById(id);
	}

	private void CopyDTOtoClient(ClientDTO dto, Client client) {
		client.setName(dto.getName());
		client.setCpf(dto.getCpf());
		client.setIncome(dto.getIncome());
		client.setBirthDate(dto.getBirthDate());
		client.setChildren(dto.getChildren());
		
	}
	
	
	
	
	
	
	

}
