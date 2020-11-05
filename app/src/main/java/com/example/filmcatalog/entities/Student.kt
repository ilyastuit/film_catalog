package com.example.filmcatalog.entities

import android.os.Parcel
import android.os.Parcelable

class Student(
    val name: String,
    val age: Int) : Parcelable {

    companion object {
        @JvmField
        val CREATOR = object : Parcelable.Creator<Student> {
            override fun createFromParcel(parcel: Parcel) = Student(parcel)
            override fun newArray(size: Int) = arrayOfNulls<Student>(size)
        }
    }

    private constructor(parcel: Parcel) : this(
        name = parcel.readString().toString(),
        age = parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(age)
    }

    override fun describeContents() = 0
}
