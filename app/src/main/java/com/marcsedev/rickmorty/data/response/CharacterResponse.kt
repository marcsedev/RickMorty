package com.marcsedev.rickmorty.data.response

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("id") val id:Int,
    @SerializedName("name") val name: String,
    @SerializedName("status") val status:String,
    @SerializedName("image") val image:String,
)
