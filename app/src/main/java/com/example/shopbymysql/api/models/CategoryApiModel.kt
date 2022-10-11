package com.example.shopbymysql.api.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CategoryApiModel (
    @SerializedName("id") @Expose
    var id: Int? = null,
    @SerializedName("name") @Expose
    var name: String? = null
)

//класс иодель полей таблицы базы данных по сути конструктор