package com.hardikmehta.business.common.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author hardikm
 * @since 06/12/16
 * <p>
 * Class description
 */

@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime localDateTime) {

        return null == localDateTime ? null : Timestamp.valueOf(localDateTime);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp timestamp) {

        return null == timestamp ? null : timestamp.toLocalDateTime();
    }
}
