package cryptography.challenge.cryptography_challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cryptography.challenge.cryptography_challenge.model.SensitiveData;

public interface SensitiveRepository extends JpaRepository<SensitiveData, Long> {

}
