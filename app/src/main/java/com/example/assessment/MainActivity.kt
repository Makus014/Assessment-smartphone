package com.example.assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottomsheet_fragment.*

class MainActivity : AppCompatActivity() {

    //Spinner options
    val list1= arrayOf("Ruby", "Lapiz Lazuli", "Aquamarine")
    val list2 = arrayOf("Emerald", "Amethyst", "Rose Quartz")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //For spinner to show
        val adapter1= ArrayAdapter(this, android.R.layout.simple_spinner_item, list1)
        val adapter2= ArrayAdapter(this, android.R.layout.simple_spinner_item, list2)
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spinner1.adapter=adapter1
        spinner2.adapter=adapter2


        //Button to pair
        var button1 = findViewById(R.id.pair) as Button

        //for pop up
        val bottomsheetFragment = BottomsheetFragment()
        val bottomsheetFragment2 = BottomsheetFragment2()
        val bottomsheetFragment3 = BottomsheetFragment3()
        val bottomsheetFragment1_1 = BottomsheetFragment1_1()
        val bottomsheetFragment1_2 = BottomsheetFragment1_2()
        val bottomsheetFragment1_3 = BottomsheetFragment1_3()
        val bottomsheetFragment2_1 = BottomsheetFragment2_1()
        val bottomsheetFragment2_2 = BottomsheetFragment2_2()
        val bottomsheetFragment2_3 = BottomsheetFragment2_3()

        //Setting up if spinner 1 is = to spinner 2 = result
        button1.setOnClickListener {
            // Ruby + emerald
            if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==0){
                bottomsheetFragment.show(supportFragmentManager, "BottomSheetDialog")
            }
            // Ruby + Amethyst
            if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==1){
                bottomsheetFragment2.show(supportFragmentManager, "BottomSheetDialog")
            }
            // Ruby + Rose quartz
            if(spinner1.selectedItemPosition==0 && spinner2.selectedItemPosition==2){
                bottomsheetFragment3.show(supportFragmentManager, "BottomSheetDialog")
            }
            //Lapiz lazuli + Emerald
            if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==0){
                bottomsheetFragment1_1.show(supportFragmentManager, "BottomSheetDialog")
            }
            //Lapiz lazuli + Amethyst
            if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==1){
                bottomsheetFragment1_2.show(supportFragmentManager, "BottomSheetDialog")
            }
            //Lapiz lazuli + Rose quartz
            if(spinner1.selectedItemPosition==1 && spinner2.selectedItemPosition==2){
                bottomsheetFragment1_3.show(supportFragmentManager, "BottomSheetDialog")
            }
            //Aquamarine + emerald
            if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==0){
                bottomsheetFragment2_1.show(supportFragmentManager, "BottomSheetDialog")
            }
            //Aquamarine + Amethyst
            if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==1){
                bottomsheetFragment2_2.show(supportFragmentManager, "BottomSheetDialog")
            }
            //Aquamarine + rose quartz
            if(spinner1.selectedItemPosition==2 && spinner2.selectedItemPosition==2){
                bottomsheetFragment2_3.show(supportFragmentManager, "BottomSheetDialog")
            }



        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.aboutus -> {
                val intent = Intent(this, aboutus::class.java)
                startActivity(intent)
            return true}
            else->
                return super.onOptionsItemSelected(item)
        }
    }

}