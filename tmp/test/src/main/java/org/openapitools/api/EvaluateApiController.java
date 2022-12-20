package org.openapitools.api;

import org.openapitools.model.EvaluatePost200Response;
import org.openapitools.model.EvaluatePost400Response;
import org.openapitools.model.Welcome3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-20T08:40:50.935496100-05:00[America/New_York]")
@Controller
@RequestMapping("${openapi.eADECS.base-path:/arcsite/EADECS/1}")
public class EvaluateApiController implements EvaluateApi {

    private final NativeWebRequest request;

    @Autowired
    public EvaluateApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    
    @Override
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/evaluate",
            produces = { "application/json" },
            consumes = { "application/json" }
        )
    public ResponseEntity<EvaluatePost200Response> evaluatePost() {
    	System.out.println("made it to evaluate");
    	EvaluatePost200Response theResponse = new EvaluatePost200Response();
    	theResponse.setFilterName("ExpenseVsRevenue-Regression");
    	theResponse.setFilterType("Regression");
    	theResponse.setFilterScore(1);
    	return ResponseEntity.ok(theResponse);
    	
    }
    		

}
