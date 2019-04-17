package com.grape.repository.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class LimittableKey implements Serializable {
	@Column(name = "accountno", nullable = false, length = 19)
	private String accountno;//贷款账号

	@Column(name = "areaid", nullable = false, length = 19)
	private String areaid;//区域id

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
		public boolean equals(Object obj) {
			if((obj!=null)&&(obj instanceof LimittableKey)){
				LimittableKey temp = (LimittableKey)obj;
				if(

					accountno!=null&&accountno.equals(temp.accountno)

					&&areaid!=null&&areaid.equals(temp.areaid)
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