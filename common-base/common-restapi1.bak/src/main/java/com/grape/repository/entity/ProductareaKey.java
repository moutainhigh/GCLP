package com.grape.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProductareaKey implements Serializable {
	@Column(name = "areaid", nullable = false, length = 19)
	private String areaid;//区域id

	@Column(name = "productno", nullable = false, length = 6)
	private String productno;//产品id

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
		public boolean equals(Object obj) {
			if((obj!=null)&&(obj instanceof ProductareaKey)){
				ProductareaKey temp = (ProductareaKey)obj;
				if(

					areaid!=null&&areaid.equals(temp.areaid)

					&&productno!=null&&productno.equals(temp.productno)
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