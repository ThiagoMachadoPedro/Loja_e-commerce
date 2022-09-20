package br.com.lojavirtual.th;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.lojavirtual.th.modelDTO.ObjetoErroDTO;

//class de excessoes para nossa api
@RestControllerAdvice
@ControllerAdvice
public class ControllerExcecoes extends ResponseEntityExceptionHandler {

	/* Captura Excessoes do projeto */
	@ExceptionHandler({ Exception.class, RuntimeException.class, Throwable.class })
	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
			HttpStatus status, WebRequest request) {

		ObjetoErroDTO objetoErrorDTO = new ObjetoErroDTO();
		String msg = "";
		if (ex instanceof MethodArgumentNotValidException) {
			List<ObjectError> list = ((MethodArgumentNotValidException) ex).getBindingResult().getAllErrors();
			for (ObjectError objecterErro : list) {
				msg += objecterErro.getDefaultMessage() + "\n";

			}
		} else {
			msg = ex.getMessage();
		}

		objetoErrorDTO.setError(msg);
		objetoErrorDTO.setCode(status.value() + "==>" + status.getReasonPhrase());

		return new ResponseEntity<Object>(objetoErrorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	/* capetura erro do banco */
	@ExceptionHandler({ DataIntegrityViolationException.class, ConstraintViolationException.class, SQLException.class })
	protected ResponseEntity<Object> handleExceptionDataIntegry(Exception ex) {

		ObjetoErroDTO objetoErrorDTO = new ObjetoErroDTO();

		String msg = "";
		if (ex instanceof DataIntegrityViolationException) {
			msg ="Erro de Integridade do banco "+ ((DataIntegrityViolationException) ex).getCause().getCause().getMessage();
		} else {
			msg = ex.getMessage();
		}

		if (ex instanceof ConstraintViolationException) {
			msg = "Erro de chave estrageira "+((ConstraintViolationException) ex).getCause().getCause().getMessage();
		} else {
			msg = ex.getMessage();
		}

		if (ex instanceof SQLException) {
			msg ="Erro SQL banco de Dados " +((SQLException) ex).getCause().getCause().getMessage();
		} else {
			msg = ex.getMessage();
		}

		objetoErrorDTO.setError(msg);
		objetoErrorDTO.setCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());

		return new ResponseEntity<Object>(objetoErrorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
