package com.Loja_ecommerce.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "imagens_produto")
@SequenceGenerator(name = "seq_imagens_produto",sequenceName = "seq_imagens_produto",allocationSize = 1,initialValue = 1)
public class ImagemProduto implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_imagens_produto")
	private Long id;
	
	
	
	
	
	
	
	
	
}
