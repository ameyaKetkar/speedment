/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.internal.core.field2.predicate.impl.reference;

import static com.speedment.field2.predicate.PredicateType.IS_NULL;
import com.speedment.field2.predicate.SpeedmentPredicate;
import com.speedment.field2.methods.Getter;
import com.speedment.field2.trait.FieldTrait;
import java.util.Objects;
import com.speedment.internal.core.field2.predicate.impl.SpeedmentPredicateImpl;
import com.speedment.internal.core.field2.predicate.iface.type.UnaryOperation;

/**
 *
 * @author pemi
 * @param <ENTITY> the entity type
 */
public class IsNullPredicate<ENTITY, V> extends SpeedmentPredicateImpl<ENTITY, V> implements SpeedmentPredicate<ENTITY, V>, UnaryOperation {

    public IsNullPredicate(FieldTrait field, Getter<ENTITY, V> getter) {
        super(IS_NULL, field, getter);
    }

    @Override
    public boolean testField(V fieldValue) {
        return Objects.isNull(fieldValue);
    }

}
