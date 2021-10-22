/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nom.dailton.dsalambda2;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.ScheduledEvent;
import java.util.Collections;
import java.util.Map;

/**
 *
 * @author dailtonalmeida
 */
public class LambdaRequestHandlerFromScheduledEvent implements RequestHandler<ScheduledEvent, Map<String, Object>> {

    @Override
    public Map<String, Object> handleRequest(ScheduledEvent scheduledEvent, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Input: " + scheduledEvent);
        logger.log("Scheduled Event Resources: " + scheduledEvent.getResources());
        return Collections.singletonMap("minhaChave", "meuOutroValor");
    }
    
}
