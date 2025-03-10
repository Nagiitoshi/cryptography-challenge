package cryptography.challenge.cryptography_challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cryptography.challenge.cryptography_challenge.model.SensitiveData;
import cryptography.challenge.cryptography_challenge.repository.SensitiveRepository;



@Service
public class SensitiveService {

    @Autowired
    private SensitiveRepository sensitiveDataRepository;
    
    public List<SensitiveData> findAll(){
        return sensitiveDataRepository.findAll();
    }

    public SensitiveData save(SensitiveData sensitiveData){
        return sensitiveDataRepository.save(sensitiveData);
    }

    public void deleteById(Long id){
        sensitiveDataRepository.deleteById(id);
    }
}
