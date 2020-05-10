package com.flight.exception;

@SuppressWarnings("serial")
public class RecordNotFound extends  RuntimeException{
	public RecordNotFound(String errorMsg){
		super(errorMsg);
	}
	public RecordNotFound(String msg,Throwable e){
        super(msg,e);
 
	}
}