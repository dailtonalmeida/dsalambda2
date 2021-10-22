/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nom.dailton.dsalambda2;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 *
 * @author dailtonalmeida
 */
public class LambdaRequestHandlerFromPOJO implements RequestHandler<PairOfIntegers, PairOfIntegers> {

    @Override
    public PairOfIntegers handleRequest(PairOfIntegers input, Context context) {
        context.getLogger().log("Input: " + input);
        PairOfIntegers result = new PairOfIntegers();
        result.setLeft(input.getRight());
        result.setRight(input.getLeft());
        return result; //inverte o par
    }
    
}
