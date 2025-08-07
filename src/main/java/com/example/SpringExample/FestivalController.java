
package com.example.SpringExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festivals")
@CrossOrigin(origins = "*") // for frontend integration
public class FestivalController {

    @Autowired
    private FestivalService service;

    @GetMapping
    public List<Festival> getAll() {
        return service.getAllFestivals();
    }

    @PostMapping
    public Festival add(@RequestBody Festival festival) {
        return service.addFestival(festival);
    }

    @PutMapping
    public Festival update(@RequestBody Festival festival) {
        return service.updateFestival(festival);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteFestival(id);
    }

    @GetMapping("/{id}")
    public Festival getById(@PathVariable Long id) {
        return service.getFestivalById(id);
    }
}
