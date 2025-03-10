package cryptography.challenge.cryptography_challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cryptography.challenge.cryptography_challenge.model.SensitiveData;
import cryptography.challenge.cryptography_challenge.service.SensitiveService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/sensitive-data")
public class SensitiveDataController {

    @Autowired
    private SensitiveService sensitiveService;

    @GetMapping
    public List<SensitiveData> getAll() {
        return sensitiveService.findAll();
    }

    @PostMapping
    public SensitiveData create(@RequestBody SensitiveData sensitiveData) {
        return sensitiveService.save(sensitiveData);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        sensitiveService.deleteById(id);
    }
}
