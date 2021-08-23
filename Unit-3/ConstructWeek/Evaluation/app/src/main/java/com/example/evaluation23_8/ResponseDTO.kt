package com.example.evaluation23_8

import java.io.Serializable

data class ResponseDTO(
	val resultCount: Int? = null,
	val results: List<ResultsDTO?>? = null
)