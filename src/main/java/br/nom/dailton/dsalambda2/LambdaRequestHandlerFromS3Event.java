/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nom.dailton.dsalambda2;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.event.S3EventNotification;
import com.amazonaws.services.s3.event.S3EventNotification.S3EventNotificationRecord;
import java.util.Collections;
import java.util.Map;

/**
 *
 * @author dailtonalmeida
 */
public class LambdaRequestHandlerFromS3Event implements RequestHandler<S3Event, Map<String, Object>> {

    @Override
    public Map<String, Object> handleRequest(S3Event s3Event, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("S3 Event: " + s3Event.toJson());

        S3EventNotification x = (S3EventNotification) s3Event;
        for (S3EventNotificationRecord s3EventNotificationRecord: x.getRecords()) {
            logger.log("S3 Event Notification Record Event Name: " + s3EventNotificationRecord.getEventName() + "\n");
        }

        return Collections.singletonMap("minhaChave", "meuOutroValor");
    }
    
}
