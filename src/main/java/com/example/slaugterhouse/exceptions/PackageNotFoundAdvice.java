package com.example.slaugterhouse.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PackageNotFoundAdvice {
  @ResponseBody
  @ExceptionHandler(PackageNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public String animalPartNotFoundHandler(PackageNotFoundException ex){
    return ex.getMessage();
  }
}
