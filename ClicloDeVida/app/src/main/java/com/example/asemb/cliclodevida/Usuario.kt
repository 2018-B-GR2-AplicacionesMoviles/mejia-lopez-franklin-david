package com.example.asemb.cliclodevida

import android.os.Parcel
import android.os.Parcelable
import java.util.*


class User(public val nomnbre:String,
              var edad:Int,
              var fechaNacimiento:Date,
              var sueldo:Double)
              :Parcelable{
    constructor(parcel: Parcel):this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readSerializable() as Date,
        parcel.readDouble()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nomnbre)
        parcel.writeInt(edad)
        parcel.writeSerializable(fechaNacimiento)
        parcel.writeDouble(sueldo)
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun toString():String{
        return "${nomnbre}"
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }


}

//val david = Usuario("asdsadd")