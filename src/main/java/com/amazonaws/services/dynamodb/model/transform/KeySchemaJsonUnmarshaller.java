/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.dynamodb.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Key Schema JSON Unmarshaller
 */
@Deprecated
public class KeySchemaJsonUnmarshaller implements Unmarshaller<KeySchema, JsonUnmarshallerContext> {

    

    public KeySchema unmarshall(JsonUnmarshallerContext context) throws Exception {
        KeySchema keySchema = new KeySchema();

        
        
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("HashKeyElement", targetDepth)) {
                    context.nextToken();
                    keySchema.setHashKeyElement(KeySchemaElementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RangeKeyElement", targetDepth)) {
                    context.nextToken();
                    keySchema.setRangeKeyElement(KeySchemaElementJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) break;
            }
            

            token = context.nextToken();
        }
        
        return keySchema;
    }

    private static KeySchemaJsonUnmarshaller instance;
    public static KeySchemaJsonUnmarshaller getInstance() {
        if (instance == null) instance = new KeySchemaJsonUnmarshaller();
        return instance;
    }
}
    