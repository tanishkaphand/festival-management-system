
package com.example.SpringExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestivalService {

    @Autowired
    private FestivalRepository repository;

    public List<Festival> getAllFestivals() {
        return repository.findAll();
    }

    public Festival addFestival(Festival festival) {
        return repository.save(festival);
    }

    public void deleteFestival(Long id) {
        repository.deleteById(id);
    }

    public Festival updateFestival(Festival festival) {
        return repository.save(festival);
    }

    public Festival getFestivalById(Long id) {
        return repository.findById(id).orElse(null);
    }

	public List<Festival> searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Festival> filterByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Festival> sortByField(String field) {
		// TODO Auto-generated method stub
		return null;
	}
}
