package com.yrc.main

import com.yrc.converter.BiliSuitDetailConverter
import com.yrc.converter.BiliSuitListConverter
import com.yrc.util.ApiUitl

fun main () {
    val converter = BiliSuitListConverter(ApiUitl.suitListApi)
    converter.printItemList(converter.getItems())
}
