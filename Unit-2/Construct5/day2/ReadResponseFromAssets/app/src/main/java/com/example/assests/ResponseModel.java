package com.example.assests;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseModel implements Serializable {

	@SerializedName("formulas")
	private List<FormulasModel> formulas;

	public List<FormulasModel> getFormulas(){
		return formulas;
	}
}