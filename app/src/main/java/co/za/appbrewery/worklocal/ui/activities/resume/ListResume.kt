package co.za.appbrewery.worklocal.ui.activities.resume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import co.za.appbrewery.worklocal.R

class ListResume : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_resume)

        //hooks
        val tvGetStarted = findViewById<TextView>(R.id.tvGetStartd)

        tvGetStarted.setOnClickListener {
            Intent(this, CreateResume::class.java).also {
                startActivity(it)
            }
        }
    }
}