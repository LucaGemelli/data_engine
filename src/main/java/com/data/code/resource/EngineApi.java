package com.data.code.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(value = "Code V1")
@RequestMapping("/api/code/v1")
public interface EngineApi {

    @ApiOperation(
            value = "Add Items",
            nickname = "AddItems")
    @ApiResponses(
            @ApiResponse(code = 200, message = "OK", response = String.class))
    @PostMapping(
            value = "",
            produces = "application/json")
    ResponseEntity<String> add(@RequestBody Object item);

    @ApiOperation(
            value = "Add Items",
            nickname = "AddItems")
    @ApiResponses(
            @ApiResponse(code = 200, message = "OK", response = String.class))
    @DeleteMapping(
            value = "",
            produces = "application/json")
    ResponseEntity<String> remove(Long id);
}
