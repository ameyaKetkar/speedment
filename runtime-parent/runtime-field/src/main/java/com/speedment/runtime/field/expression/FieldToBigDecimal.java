package com.speedment.runtime.field.expression;

import com.speedment.runtime.compute.ToBigDecimalNullable;

import java.math.BigDecimal;
import java.util.function.Function;

/**
 * Specific {@link FieldMapper} implementation that also implements
 * {@link ToBigDecimalNullable}.
 *
 * @param <ENTITY>  the entity type
 * @param <T>       the column type before mapped
 *
 * @author Emil Forslund
 * @since  3.1.0
 */
public interface FieldToBigDecimal<ENTITY, T>
extends FieldMapper<ENTITY, T, BigDecimal, Function<T, BigDecimal>>,
        ToBigDecimalNullable<ENTITY> {}