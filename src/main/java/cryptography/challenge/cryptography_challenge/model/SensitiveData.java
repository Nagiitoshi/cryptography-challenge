package cryptography.challenge.cryptography_challenge.model;

import cryptography.challenge.cryptography_challenge.util.EncryptionConverterUtil;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_sensitive_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SensitiveData {
    @Id
    @GeneratedValue(strategy = GenerationType  .IDENTITY)
    private Long id;

    @Convert(converter = EncryptionConverterUtil.class)
    @Column(name = "user_document", nullable = false)
    private String userDocument;

    @Convert(converter = EncryptionConverterUtil.class)
    @Column(name = "credit_card_token", nullable = false)
    private String creditCardToken;

    @Column(name = "value_credit", nullable = false)
    private Long value;



}
