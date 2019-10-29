package com.example.listviewcustomexample

import android.widget.TextView
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter


class CityAdapter(val context: Context, val cityData: Array<City>) : BaseAdapter() {
    override fun getCount(): Int {
        return cityData.size
    }

    override fun getItem(position: Int): City {
        return cityData[position]
    }

    override fun getItemId(position: Int): Long {
        return cityData[position].name.hashCode().toLong()
    }

    override fun getView(position: Int, convertView: View?, container: ViewGroup): View {
        val convertView = LayoutInflater.from(context).inflate(R.layout.city_item,
                container, false)

        val cityCountry: TextView = convertView.findViewById(R.id.city_country)
        val cityName: TextView = convertView.findViewById(R.id.city_name)

        cityCountry.text = getItem(position).country
        cityName.text = getItem(position).name

        return convertView
    }

//region
//    override fun getView(position: Int, convertView: View?, container: ViewGroup): View {
//        val cityView: View
//        val viewHolder: ViewHolder
//
//        if(convertView == null){
//            cityView = LayoutInflater.from(context).inflate(R.layout.city_item,
//                container, false)
//
//            viewHolder = ViewHolder()
//            with(viewHolder){
//                cityCountry = cityView.findViewById(R.id.city_country)
//                cityName = cityView.findViewById(R.id.city_name)
//                cityView.tag = this
//            }
//        } else{
//            cityView = convertView
//            viewHolder = convertView.tag as ViewHolder
//        }
//
//        with(viewHolder){
//            cityCountry.text = getItem(position).country
//            cityName.text = getItem(position).name
//        }
//
//        return cityView
//    }
//
//    private class ViewHolder{
//        lateinit var cityCountry: TextView
//        lateinit var cityName: TextView
//    }
//endregion
}