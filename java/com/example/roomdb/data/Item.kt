package com.example.roomdb.data


import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Items")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val price: Double,
    val quantity: Int
)
