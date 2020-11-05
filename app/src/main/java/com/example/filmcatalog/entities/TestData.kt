package com.example.filmcatalog.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TestData(
        val transmittedString: String = "String to transmit",

        val transmittedInt: Int = 12,

        val transmittedBoolean: Boolean = false,
) : Parcelable