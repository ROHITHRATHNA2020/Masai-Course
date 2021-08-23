package com.example.evaluation23_8

import java.io.Serializable

data class ResultsDTO(
	val wrapperType: String? = null,
	val artistId: Int? = null,
	val collectionId: Int? = null,
	val artistName: String? = null,
	val collectionName: String? = null,
	val collectionCensoredName: String? = null,
	val artistViewUrl: String? = null,
	val collectionViewUrl: String? = null,
	val artworkUrl60: String? = null,
	val artworkUrl100: String? = null,
	val collectionPrice: Any? = null,
	val collectionExplicitness: String? = null,
	val trackCount: Int? = null,
	val copyright: String? = null,
	val country: String? = null,
	val currency: String? = null,
	val releaseDate: String? = null,
	val primaryGenreName: String? = null,
	val previewUrl: String? = null,
	val description: String? = null
)