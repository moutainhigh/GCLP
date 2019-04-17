package com.grape.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BnkcomKey implements Serializable {
	@Column(name = "comno", nullable = false, length = 5)
	private String comno;//

	@Column(name = "bnkno", nullable = false, length = 5)
	private String bnkno;//

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
		public boolean equals(Object obj) {
			if((obj!=null)&&(obj instanceof BnkcomKey)){
				BnkcomKey temp = (BnkcomKey)obj;
				if(

					comno!=null&&comno.equals(temp.comno)

					&&bnkno!=null&&bnkno.equals(temp.bnkno)
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