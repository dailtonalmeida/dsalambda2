/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nom.dailton.dsalambda2;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dailtonalmeida
 */
public class LambdaRequestHandlerFromMap
        implements RequestHandler<Map<String, Object>, Map<String, Object>> {

    @Override
    public Map<String, Object> handleRequest(Map<String, Object> inputMap, Context context) {
        context.getLogger().log("Input: " + inputMap);
        
        Map<String, Object> outputMap = new HashMap<>();

        if (inputMap == null) {
            outputMap.put("input map size", 0);
        } else {
            outputMap.put("input map keys", inputMap.keySet());
            outputMap.put("input map values", inputMap.values());
            outputMap.put("input map size", inputMap.size());
        }

        return outputMap;
    }
    
}
