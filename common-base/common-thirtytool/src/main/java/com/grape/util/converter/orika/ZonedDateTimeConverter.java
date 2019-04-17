package com.grape.util.converter.orika;

import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;

import java.time.ZonedDateTime;

public class ZonedDateTimeConverter extends BidirectionalConverter<ZonedDateTime, ZonedDateTime> {
    @Override
    public ZonedDateTime convertTo(ZonedDateTime odt, Type<ZonedDateTime> type, MappingContext mappingContext) {
        return ZonedDateTime.from(odt);
    }

    @Override
    public ZonedDateTime convertFrom(ZonedDateTime odt, Type<ZonedDateTime> type, MappingContext mappingContext) {
        return ZonedDateTime.from(odt);
    }
}
