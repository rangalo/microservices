package com.hardikmehta.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author hardikm
 * @since 09/12/16
 * <p>
 * Class description
 */

@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime attribute) {

        if (null == attribute) {

            return null;
        }

        return Timestamp.valueOf(attribute);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp dbData) {

        if (null == dbData) {

            return null;
        }

        return dbData.toLocalDateTime();
    }
}
