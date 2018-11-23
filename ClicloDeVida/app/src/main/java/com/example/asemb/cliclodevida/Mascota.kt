package com.example.asemb.cliclodevida

import android.os.Parcel
import android.os.Parcelable
import java.util.*


class Mascota(public val nomnbre:String,
           var edad:Int,
           var fechaNacimiento:Date,
           var raza:String)
    :Parcelable{
    constructor(parcel: Parcel):this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readSerializable() as Date,
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nomnbre)
        parcel.writeInt(edad)
        parcel.writeSerializable(fechaNacimiento)
        parcel.writeString(raza)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Mascota> {
        override fun createFromParcel(parcel: Parcel): Mascota {
            return Mascota(parcel)
        }

        override fun newArray(size: Int): Array<Mascota?> {
            return arrayOfNulls(size)
        }
    }
}