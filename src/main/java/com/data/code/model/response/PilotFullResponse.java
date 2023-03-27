package com.data.code.model.response;

import lombok.Data;

import java.util.List;

@Data
public class PilotFullResponse extends PilotResponse{
     private List<String> constructors;
}
