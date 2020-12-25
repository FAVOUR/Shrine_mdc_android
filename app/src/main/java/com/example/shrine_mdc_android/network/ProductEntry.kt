package com.example.shrine_mdc_android.network

import android.accounts.AuthenticatorDescription
import android.content.res.Resources
import com.example.shrine_mdc_android.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.util.ArrayList

class ProductEntry(val title:String,dynamicUrl:String,val url:String,val description: String) {

     companion object{
         /**
          * Loads a raw JSON at R.raw.products and converts it into a list of ProductEntry objects
          */

         fun initProductEntryList(resources: Resources): List<ProductEntry> {
            val inputStream = resources.openRawResource(R.raw.products)
             val jsonProductsString = inputStream.bufferedReader().use(BufferedReader::readText)
             val gson = Gson()
             val productListType = object : TypeToken<ArrayList<ProductEntry>>() {}.type
             return gson.fromJson<List<ProductEntry>>(jsonProductsString, productListType)
         }

         }


}