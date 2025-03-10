package cryptography.challenge.cryptography_challenge.util;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;

@Convert
public class EncryptionConverterUtil implements AttributeConverter<String, String> {

    @Override
    public String convertToDatabaseColumn(String attribute) {
        return EncryptionUtil.encrypt(attribute);
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        return EncryptionUtil.decrypt(dbData);
    }
}
