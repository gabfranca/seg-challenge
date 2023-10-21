package com.java.seg.challenge.infra.adpaters.rest.out.dto.result;

public class ResultDTOBuilder {
    public ResultDTO result;

    public ResultDTOBuilder builder(){
        this.result = new ResultDTO();
        return this;
    }
    public ResultDTOBuilder withContent(Object content){
        this.result.content = content;
        return this;
    }
    public ResultDTOBuilder withMessage(String message){
        this.result.message = message;
        return this;
    }
    public ResultDTO build(){
        return this.result;
    }
}
