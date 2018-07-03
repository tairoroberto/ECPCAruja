package br.com.trmasolutions.pibaruja.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(

        @SerializedName("uid")
        var uid: String = "",

        @SerializedName("name")
        var name: String = "",

        @SerializedName("email")
        var email: String = "",

        @SerializedName("password")
        var password: String = "",

        @SerializedName("birthday")
        var birthday: String = "",

        @SerializedName("image")
        var image: String = "",

        @SerializedName("cep")
        var cep: String = "",

        @SerializedName("address")
        var address: String = "",

        @SerializedName("city")
        var city: String = "",

        @SerializedName("created_at")
        var createdAt: String = ""): Parcelable