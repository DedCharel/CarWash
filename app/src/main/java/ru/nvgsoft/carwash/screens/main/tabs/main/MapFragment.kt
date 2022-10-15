package ru.nvgsoft.carwash.screens.main.tabs.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import ru.nvgsoft.carwash.R

class MapFragment: Fragment(R.layout.fragment_map), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // initialize view
        val view = inflater.inflate(R.layout.fragment_map, container, false)

        // initialize map fragment
        val supportMapFragment = childFragmentManager.findFragmentById(R.id.google_map) as SupportMapFragment
        supportMapFragment.getMapAsync(this)
        return view

    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        val marker1 = LatLng(45.082930,41.068061)
        val marker2 = LatLng(45.104338,41.023532)
        val marker3 = LatLng(45.116612,41.002668)
        val start = LatLng(45.105897,41.043908)
        mMap.addMarker(MarkerOptions().position(marker1).title("Автомойка"))
        mMap.addMarker(MarkerOptions().position(marker2).title("Автомойка"))
        mMap.addMarker(MarkerOptions().position(marker3).title("Автомойка"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(start,15f))
    }


}