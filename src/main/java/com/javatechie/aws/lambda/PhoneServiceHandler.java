package com.javatechie.aws.lambda;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.javatechie.aws.lambda.model.Phone;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import java.util.List;


public class PhoneServiceHandler extends SpringBootRequestHandler<APIGatewayProxyRequestEvent, List<Phone>> {
}
