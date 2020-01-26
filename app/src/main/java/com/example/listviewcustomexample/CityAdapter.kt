package com.example.listviewcustomexample

import android.widget.TextView
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.core.content.ContextCompat

class CityAdapter(val cityData: Array<City>) : BaseAdapter() {
    override fun getCount(): Int {
        return cityData.size
    }

    override fun getItem(position: Int): City {
        return cityData[position]
    }

    override fun getItemId(position: Int): Long {
        return cityData[position].name.hashCode().toLong()
    }
//region
//    override fun getView(position: Int, convertView: View?, container: ViewGroup): View {
//        val convertView = LayoutInflater.from(container.context).inflate(R.layout.city_item,
//                container, false)
//
//        val cityCountry: TextView = convertView.findViewById(R.id.city_country)
//        val cityName: TextView = convertView.findViewById(R.id.city_name)
//
//        cityCountry.text = getItem(position).country
//        cityName.text = getItem(position).name
//
//        return convertView
//    }
//endregion

//region
    override fun getView(position: Int, convertView: View?, container: ViewGroup): View {
        val cityView: View
        val viewHolder: ViewHolder

        if(convertView == null){
            cityView = LayoutInflater.from(container.context).inflate(R.layout.city_item,
                container, false)

            viewHolder = ViewHolder()
            with(viewHolder){
                cityCountry = cityView.findViewById(R.id.city_country)
                cityName = cityView.findViewById(R.id.city_name)
                cityView.tag = this
            }
        } else{
            cityView = convertView
            viewHolder = convertView.tag as ViewHolder
        }

        with(viewHolder){
            val city = getItem(position)
            cityCountry.text = city.country
            cityName.text = city.name


            if(city.favorite){
                cityView.setBackgroundColor(ContextCompat
                    .getColor(cityView.context, R.color.colorFavorite))

            } else{
                cityView.setBackgroundColor(ContextCompat
                    .getColor(cityView.context, android.R.color.white))
            }

        }

        return cityView
    }

    private class ViewHolder{
        lateinit var cityCountry: TextView
        lateinit var cityName: TextView
    }
//endregion
}