package com.example.listviewcustomexample

import android.graphics.Paint
import android.graphics.Typeface
import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    val cityData = fillCityData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cities: ListView = findViewById(R.id.cities)
        val cityAdapter = CityAdapter(cityData)
        cities.adapter = cityAdapter

        cities.setOnItemClickListener{parent, view, position, id ->

            val city: City? = cityAdapter.getItem(position)
            city?.let{
                city.favorite = !city.favorite
                cityAdapter.notifyDataSetChanged()
            }
        }
    }


    private fun fillCityData(): Array<City>{
        return arrayOf(City("Argentina","Buenos Aires"),
            City("Australia","Canberra"),
            City("Austria","Vienna"),
            City("Bangladesh","Dhaka"),
            City("Belgium","Brussels"),
            City("Bhutan","Thimphu"),
            City("Bolivia","La Paz"),
            City("Brazil","Brasilia"),
            City("Myanmar","Rangoon"),
            City("Cambodia","Phnom Penh"),
            City("Canada","Ottawa"),
            City("China","Beijing"),
            City("Colombia","Bogota"),
            City("Costa Rica","San Jose"),
            City("Cyprus","Nicosia"),
            City("Denmark","Copenhagen"),
            City("Egypt","Cairo"),
            City("Finland","Helsinki"),
            City("France","Paris"),
            City("Germany","Berlin"),
            City("Hungary","Budapest"),
            City("Iceland","Reykjavik"),
            City("India","New Delhi"),
            City("Indonesia","Jakarta"),
            City("Iran","Tehran"),
            City("Iraq","Baghdad"),
            City("Ireland","Dublin"),
            City("Italy","Rome"),
            City("Jamaica","Kingston"),
            City("Japan","Tokyo"),
            City("Kenya","Nairobi"),
            City("North Korea","Pyongyang"),
            City("South Korea","Seoul"),
            City("Kuwait","Kuwait City"),
            City("Libya","Tripoli"),
            City("Macedonia","Skopje"),
            City("Madagascar","Antananarivo"),
            City("Malaysia","Kuala Lumpur"),
            City("Maldives","Male"),
            City("Mauritius","Port Louis"),
            City("Mexico","Mexico City"),
            City("Nepal","Kathmandu"),
            City("Netherlands","Amsterdam"),
            City("New Zealand","Wellington"),
            City("Nigeria","Abuja"),
            City("Norway","Oslo"),
            City("Oman","Muscat"),
            City("Pakistan","Islamabad"),
            City("Peru","Lima"),
            City("Philippines","Manila"),
            City("Poland","Warsaw"),
            City("Portugal","Lisbon"),
            City("Qatar","Doha"),
            City("Romania","Bucharest"),
            City("Russia","Moscow"),
            City("Saudi Arabia","Riyadh"),
            City("Singapore","Singapore"),
            City("Sri Lanka","Colombo"),
            City("Sudan","Khartoum"),
            City("Switzerland","Bern"),
            City("Taiwan","Taipei"),
            City("Thailand","Bangkok"),
            City("Turkey","Ankara"),
            City("United Arab Emirates","Abu Dhabi"),
            City("United Kingdom","London"),
            City("United States","Washington"),
            City("Zambia","Lusaka"),
            City("Zimbabwe","Harare"))

    }
}
