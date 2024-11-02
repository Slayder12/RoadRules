package com.example.roadrules

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var infoCheckBox: CheckBox
    private lateinit var rulesTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        infoCheckBox = findViewById(R.id.infoCheckBoxCB)
        rulesTextView = findViewById(R.id.rulesTextViewTV)

        infoCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                infoCheckBox.text = getString(R.string.road_rules)
                rulesTextView.text = getString(R.string.rules_text).trimIndent()
            } else {
                rulesTextView.text = ""
                infoCheckBox.text = getString(R.string.info_text)
            }

        }

    }
}