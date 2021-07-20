package com.danisable.appconsumenservices.data.remote.responses

import com.google.gson.annotations.SerializedName

data class PriceResponse (
    @SerializedName( "activity") val activity: String,
    @SerializedName( "type") val type: String,
    @SerializedName( "participants") val participants: Int,
    @SerializedName( "price") val price: Double,
    @SerializedName( "link") val link: String,
    @SerializedName( "key") val key: String,
    @SerializedName( "accessibility") val accessibility: Double
)
