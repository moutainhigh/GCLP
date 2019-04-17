package com.grape.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CodetableKey implements Serializable {
	@Column(name = "codtyp", nullable = false, length = 20)
	private String codtyp;//码表类型

	@Column(name = "codflg", nullable = false, length = 20)
	private String codflg;//码表标识

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
		public boolean equals(Object obj) {
			if((obj!=null)&&(obj instanceof CodetableKey)){
				CodetableKey temp = (CodetableKey)obj;
				if(

					codtyp!=null&&codtyp.equals(temp.codtyp)

					&&codflg!=null&&codflg.equals(temp.codflg)
			){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}