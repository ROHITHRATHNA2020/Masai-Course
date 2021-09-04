package com.example.scopefunctions

import java.io.Serializable

data class ResponseDTO(
	val data: DataDTO? = null,
	val support: SupportDTO? = null
)