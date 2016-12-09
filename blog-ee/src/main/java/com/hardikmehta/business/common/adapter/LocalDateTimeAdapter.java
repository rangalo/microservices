package com.hardikmehta.business.common.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author hardikm
 * @since 07/12/16
 * <p>
 * Class description
 */
public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

    @Override
    public LocalDateTime unmarshal(String v) throws Exception {

        if (null == v) {
            return  null;
        }

        return LocalDateTime.parse(v);
    }

    @Override
    public String marshal(LocalDateTime v) throws Exception {

        if (null == v) {

            return null;
        }

        return DateTimeFormatter.ISO_DATE_TIME.format(v);
    }
}
