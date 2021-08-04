package com.example.resourceapi;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseModel implements Serializable {

	@SerializedName("page")
	private int page;

	@SerializedName("per_page")
	private int perPage;

	@SerializedName("total")
	private int total;

	@SerializedName("total_pages")
	private int totalPages;

	@SerializedName("data")
	private List<DataModel> data;

	@SerializedName("support")
	private SupportModel support;

	public int getPage(){
		return page;
	}

	public int getPerPage(){
		return perPage;
	}

	public int getTotal(){
		return total;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public List<DataModel> getData(){
		return data;
	}

	public SupportModel getSupport(){
		return support;
	}
}