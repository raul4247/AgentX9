package com.raulfm.agentx9.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.raulfm.agentx9.R

class MainActivity : AppCompatActivity() {

    private lateinit var addEventButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        addEventButton = findViewById(R.id.add_event)
        addEventButton.setOnClickListener{
            val i = Intent(this, EventCreationActivity::class.java)
            startActivity(i)
        }
    }
}
