package com.example.demo.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class StudentRestExceptionHandler {
    @ExceptionHandler
    fun handeException(exception: StudentNotFoundException): ResponseEntity<StudentErrorResponse> {
        val error = StudentErrorResponse(
            status = HttpStatus.NOT_FOUND.value(),
            message = exception.message,
            timeStamp = System.currentTimeMillis()
        )
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error)
    }

    @ExceptionHandler
    fun handleException(exception: Exception): ResponseEntity<StudentErrorResponse> {
        val error = StudentErrorResponse(
            status = HttpStatus.BAD_REQUEST.value(),
            message = exception.message,
            timeStamp = System.currentTimeMillis()
        )
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error)
    }
}