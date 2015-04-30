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
package com.speedment.codegen.java.views;

import com.speedment.codegen.base.Generator;
import com.speedment.codegen.lang.models.Initalizer;
import com.speedment.util.CodeCombiner;
import java.util.Optional;
import static com.speedment.codegen.Formatting.*;
import com.speedment.codegen.base.Transform;

/**
 *
 * @author Emil Forslund
 */
public class InitalizerView implements Transform<Initalizer, String> {

    @Override
    public Optional<String> transform(Generator cg, Initalizer model) {
        return Optional.of(
            cg.onEach(model.getModifiers()).collect(CodeCombiner.joinIfNotEmpty(SPACE, EMPTY, SPACE)) +
            block(model.getCode().stream())
        );
    }
    
}